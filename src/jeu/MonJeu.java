
package jeu;

import java.util.ArrayList;
import java.util.List;

import personnage.Heros;
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
	
	/**
	 * liste des cases du murs
	 */
	private Case[][]labyrinthe;
	
	public final static int LIMIT_X=16;
	public final static int LIMIT_Y=16; 

	/**
	 * constructeur de jeu avec un Personnage
	 */
	public MonJeu() {
		this.pj=new Heros();
		this.labyrinthe = new Case[LIMIT_X][LIMIT_Y];
		for (int i = 0 ;i<this.labyrinthe.length;i++){
			for (int j = 0; j<this.labyrinthe[i].length; j++){
				if(i == 0 || j == 0 || i == this.LIMIT_X-1 || j == (this.LIMIT_Y-1)){
					Case c = new Mur(i,j);
					this.labyrinthe[i][j]=c;
				}
				else{
				Case c = new Case(i,j);
				this.labyrinthe[i][j]=c;
				}
			}
		}
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
		if (commande.gauche){
			if (this.labyrinthe[pj.getPosX()-1][pj.getPosY()].etreTraversable()==true){
				this.getPj().seDeplacer(commande);
			}
		}
		if (commande.droite){
			if (this.labyrinthe[pj.getPosX()+1][pj.getPosY()].etreTraversable()==true){
				this.getPj().seDeplacer(commande);
			}
		}
		if (commande.haut){
			if (this.labyrinthe[pj.getPosX()][pj.getPosY()-1].etreTraversable()==true){
				this.getPj().seDeplacer(commande);
			}
			
		}
		if (commande.bas){
			if (this.labyrinthe[pj.getPosX()][pj.getPosY()+1].etreTraversable()==true){
				this.getPj().seDeplacer(commande);
			}	
		}
		if (commande.gauche && commande.bas){
			if (this.labyrinthe[pj.getPosX()-1][pj.getPosY()].etreTraversable()==true && this.labyrinthe[pj.getPosX()][pj.getPosY()+1].etreTraversable()==true ){
				this.getPj().seDeplacer(commande);
			}
		}
		if (commande.gauche && commande.haut){
			if (this.labyrinthe[pj.getPosX()-1][pj.getPosY()].etreTraversable()==true && this.labyrinthe[pj.getPosX()][pj.getPosY()-1].etreTraversable()==true){
				this.getPj().seDeplacer(commande);
			}
		}
		if (commande.droite && commande.bas){
			if (this.labyrinthe[pj.getPosX()+1][pj.getPosY()].etreTraversable()==true && this.labyrinthe[pj.getPosX()][pj.getPosY()+1].etreTraversable()==true){
				this.getPj().seDeplacer(commande);
			}
		}
		if (commande.droite && commande.haut){
			if (this.labyrinthe[pj.getPosX()+1][pj.getPosY()].etreTraversable()==true && this.labyrinthe[pj.getPosX()][pj.getPosY()-1].etreTraversable()==true){
				this.getPj().seDeplacer(commande);
			}
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

}
