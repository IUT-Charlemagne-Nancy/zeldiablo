
package jeu;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import Objet.Objet;
import Objet.Talisman;
import personnage.Ghost;
import personnage.Heros;
import personnage.Monstre;
import personnage.Orcs;
import personnage.Personnage;
import moteurJeu.Commande;
import moteurJeu.Jeu;

/**
 * classe qui contient les donnees du jeu. Pour le moment, il ne possede qu'un
 * personnage
 *
 */
public class MonJeu implements Jeu {

	/**
	 * le personnage du jeu
	 */
	private Heros pj;
	protected List<Monstre> monstres;
	protected List<Objet> objets;
	/**
	 * liste des cases du murs
	 */
	protected Case[][]labyrinthe;
	
	public final static int LIMIT_X=25;
	public final static int LIMIT_Y=25; 

	/**
	 * constructeur de jeu avec un Personnage
	 * @throws IOException 
	 */
	public MonJeu(int i) {
		this.pj=new Heros(this);
		this.labyrinthe = new Case[LIMIT_X][LIMIT_Y];
		this.objets=new ArrayList<Objet>();
		genererNiveau(i);
		this.monstres=new ArrayList<Monstre>();
		this.monstres.add(new Ghost(this));
		this.monstres.add(new Orcs(this));
		this.monstres.add(new Orcs(this));
		this.monstres.add(new Ghost(this));
		
		
	}
	public Case recupererCase(int x,int y){
		return this.labyrinthe[x][y];
	}
	
	public boolean traverse(int x, int y){
		return this.labyrinthe[x][y].etreTraversable();
	}
	
	public void modifierCase(Case c, int x,int y){
		this.labyrinthe[x][y]=c;
	}

	/**
	 * surcharge toString
	 */
	public String toString() {
		return ("" + this.getPj());
	}

	/**
	 * demande a deplacer le personnage
	 * 
	 * @param commande
	 *            chaine qui donne ordre
	 */
	public void evoluer(Commande commande) {
		this.getPj().seDeplacer(commande);
		for (int i = 0 ; i<this.monstres.size();i++){
			Commande c = new Commande();
			if (this.etreAPorteeHeros(this.monstres.get(i))){
				c.attaque = true;
				monstres.get(i).attaquer(c);
			}
			if (this.sentirPresence(this.monstres.get(i))){
				int x = this.monstres.get(i).getPosX()-this.getPj().getPosX();
				int y = this.monstres.get(i).getPosY()-this.getPj().getPosY();
				if (x<0){
					c.droite=true;
					monstres.get(i).seDeplacer(c);
				}
				if (x>0){
					c.gauche=true;
					monstres.get(i).seDeplacer(c);
				}
				if(y<0){
					c.bas=true;
					monstres.get(i).seDeplacer(c);
				}
				if(y>0){
					c.haut=true;
					monstres.get(i).seDeplacer(c);
				}
			}
			else{
				Commande c2 = new Commande((int)Math.round(Math.random()*8));
				monstres.get(i).seDeplacer(c2);
			}			
		}
		if (commande.attaque == true){
		this.getPj().attaquer(commande);
		}
		if(commande.prendre == true){
			this.getPj().prendre(commande);
		}
	}

	@Override
	public boolean etreFini() {
		boolean res=false;
		if(pj.etreMort()||(pj.avoirTalisman() &&(pj.getPosX()<4 && pj.getPosY()<4)) ){
			res=true;
		}
		return res;
	}

	/**
	 * getter pour l'affichage
	 * 
	 * @return personnage du jeu
	 */
	public Heros getPj() {
		return pj;
	}
	public List<Monstre> getMonstres(){
		return this.monstres;
	}
	public boolean caseOccuper(int x,int y){
		boolean res=false;
		if(pj.getPosX()==x && pj.getPosY()==y){
			res=true;
		}
		for(int i=0;i<monstres.size();i++){
			if(!(monstres.get(i).etreMort())&&(monstres.get(i) instanceof Orcs &&(monstres.get(i).getPosX()==x && monstres.get(i).getPosY()==y))){
				res=true;
			}
			
		}
		return res;
	}
	
	public void etreAPortee(Personnage p){
		for(int i = 0; i<this.monstres.size() ; i++ ){
			if ((int)Math.abs(this.monstres.get(i).getPosX()-p.getPosX())<=p.getPortee() && (int) Math.abs(this.monstres.get(i).getPosY()- p.getPosY()) <= p.getPortee()){
				if (this.labyrinthe[this.monstres.get(i).getPosX()][this.monstres.get(i).getPosY()].etreTraversable()){
				this.monstres.get(i).subirDegat(p.getAttaque());
				}
			}
		}
	}
	public boolean etreAPorteeHeros(Personnage p){
		if ((int)Math.abs(p.getPosX()-this.getPj().getPosX())<=p.getPortee() && (int) Math.abs(p.getPosY()-this.getPj().getPosY()) <= p.getPortee()){
			return true;
		}
		else{
			return false;
		}
	}
	
	public boolean sentirPresence(Personnage p){
		if ((int)Math.abs(p.getPosX()-this.getPj().getPosX())<=3 && (int) Math.abs(p.getPosY()-this.getPj().getPosY()) <= 3){
			return true;
		}
		else{
			return false;
		}
	}
	/**
	 * méthode qui sert a ajouter un monstre
	 * @param m
	 */
	public void ajouterMonstre(Monstre m){
		this.monstres.add(m);
	}
	/**
	 * Méthode qui recupere le monstre de la liste à l'indice passé en paramètre
	 * @param i
	 * @return
	 */
	public Monstre recupererMonstre(int i){
		return this.monstres.get(i);
	}
	public void donnerObjet(Heros heros) {
		for(int i=0;i<objets.size();i++){
			if(objets.get(i).getPosX()==heros.getPosX() && objets.get(i).getPosY()==heros.getPosY() ){
				heros.ajouterObjet(objets.get(i));
				if(objets.get(i)  instanceof Talisman){
					heros.avoirPrisTalisman();
					objets.get(i).appliquerEffet(heros);
				}
				objets.remove(i);
			
			}
		}
	}
	private  void genererNiveau(int num){
		String res=null;
		switch(num){
		case 1:
			res="./document/level1.txt";
			break;
		}
		try{
		BufferedReader fichier=new BufferedReader(new FileReader(res));
		for(int i=0;i<LIMIT_Y;i++){
			String line= fichier.readLine();
			for(int j=0 ;j<LIMIT_X;j++){
				char la_case=(char)fichier.read();
				Case c=null;
				if(la_case=='M'){
					c= new Mur(j,i);
				}
				if(la_case=='C'){
					c=new Case(j,i);
				}
				if(la_case=='T'){
					c=new Case(j,i);
					this.objets.add(new Talisman(j,i));
				}
				labyrinthe[j][i]=c;
			}
			
		}
		fichier.close();
	}catch(IOException e){
		e.printStackTrace();
	}
	}
}

