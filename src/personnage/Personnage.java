package personnage;

import java.util.List;
import java.util.ArrayList;

import moteurJeu.Commande;
import jeu.MonJeu;
/**
 * Classe abstraite qui definit tout les personnages
 * @author Benjamin
 *
 */
public abstract class Personnage {
	protected MonJeu jeu;
	protected int posX,posY,attaque,portee,vie;
	protected String mouvement;
	public final static int LIMIT_X=24;
	public final static int LIMIT_Y=24;
	
	/**
	 * constructeur d'un personnage
	 * @param x
	 * @param y
	 * @param attack
	 * @param porte
	 * @param pv
	 * @param j
	 */
	public Personnage(int x, int y, int attack, int porte, int pv, MonJeu j) {
		this.posX=x;
		this.posY=y;
		this.attaque=attack;
		this.portee=porte;
		this.vie=pv;
		this.jeu =j;
		this.mouvement="banane";
		
	}
	/**
	 * methode qui permet de deplacer le personnage
	 * @param c
	 */
	public abstract void seDeplacer(Commande c);

	/**
	 * methode qui inflige des degats au personnage
	 * @param x
	 */
	public void subirDegat(int x) {
		if (!this.etreMort()){
			if(x<0){
				x=0;
			}
			this.vie=this.vie-x;
			if (this.vie<0){
				this.vie=0;
			}
		}
		
	}
	
	/**
	 * methode qui indique si un personnage est mort ou non
	 * @return
	 */
	public boolean etreMort(){
		boolean res=false;
		if(this.vie<=0){
			res=true;
		}
		return res;
	}
	
	


	public int getAttaque() {
		return attaque;
	}

	public void setAttaque(int attaque) {
		this.attaque = attaque;
	}

	public void setPortee(int portee) {
		this.portee = portee;
	}

	public void setVie(int vie) {
		this.vie = vie;
	}

	public int getPosX(){
		return this.posX;
	}
	public int getPosY(){
		return this.posY;
	}
	public int getPortee(){
		return this.portee;
		
	}
	public int getVie(){
		return this.vie;
	}
	
	public void setPosX(int posX) {
		this.posX = posX;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}
	
	/**
	 * methode qui permet d'attaquer
	 * @param c
	 */
	public abstract void attaquer(Commande c);

	public void etreEnMouvement(String mouv){
		this.mouvement = mouv;
	}
	public String mouvement(){
		return mouvement;
	}
 }
