
package jeu;
import java.util.ArrayList;
import java.util.List;

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
	private Personnage pj;
	protected List<Monstre> monstres;
	/**
	 * liste des cases du murs
	 */
	protected Case[][]labyrinthe;
	
	public final static int LIMIT_X=16;
	public final static int LIMIT_Y=16; 

	/**
	 * constructeur de jeu avec un Personnage
	 */
	public MonJeu() {
		this.pj=new Heros(this);
		this.labyrinthe = new Case[LIMIT_X][LIMIT_Y];
		for (int i = 0 ;i<this.labyrinthe.length;i++){
			for (int j = 0; j<this.labyrinthe[i].length; j++){
				if(i == 0 || j == 0 || i == this.LIMIT_X-1 || j == (this.LIMIT_Y-1)||(i!=10 && i!=11 && i!=12 && j==4)||(j==7 && (i<=14 && i>=9))||(i==9 && (j>=8 && j<=12))||(j==12 &&(i>=12 && i<=14))||j==9&&(i>=3&&i<=8)||j==12&&(i>=1 && i<=6 )){
					Case c = new Mur(i,j);
					this.labyrinthe[i][j]=c;
					modifierCase(c,i,j);
				}
				else{
				Case c = new Case(i,j);
				this.labyrinthe[i][j]=c;
				}
			}
		}
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
			Commande c = new Commande((int)Math.round(Math.random()*8));
			c.attaque =true;
			monstres.get(i).seDeplacer(c);
			monstres.get(i).attaquer(c);
		}
		if (commande.attaque == true){
		this.getPj().attaquer(commande);
		}
	}

	@Override
	public boolean etreFini() {
		// le jeu n'est jamais fini
		return false;
	}

	/**
	 * getter pour l'affichage
	 * 
	 * @return personnage du jeu
	 */
	public Personnage getPj() {
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
			if((monstres.get(i) instanceof Orcs &&(monstres.get(i).getPosX()==x && monstres.get(i).getPosY()==y))){
				res=true;
			}
			
		}
		return res;
	}
	
	public void etreAPortee(Personnage p){
		for(int i = 0; i<this.monstres.size() ; i++ ){
			if ((int)Math.abs(this.monstres.get(i).getPosX()-p.getPosX())<=p.getPortee() && (int) Math.abs(this.monstres.get(i).getPosY()- p.getPosY()) <= p.getPortee()){
				this.monstres.get(i).subirDegat(p.getDegat());
			}
		}
	}
	public void etreAPorteeHeros(Personnage p){
		if ((int)Math.abs(p.getPosX()-this.getPj().getPosX())<=p.getPortee() && (int) Math.abs(p.getPosY()-this.getPj().getPosY()) <= p.getPortee()){
			this.getPj().subirDegat(p.getDegat());
		}
	}
}

