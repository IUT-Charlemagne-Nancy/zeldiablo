package personnage;

import java.util.List;
import java.util.ArrayList;

import moteurJeu.Commande;
import jeu.MonJeu;

public abstract class Personnage {
	protected MonJeu jeu;
	protected int posX,posY,attaque,portee,vie;
	protected String mouvement;
	public final static int LIMIT_X=24;
	public final static int LIMIT_Y=24; 
	public Personnage(int x, int y, int attack, int porte, int pv, MonJeu j) {
		this.posX=x;
		this.posY=y;
		this.attaque=attack;
		this.portee=porte;
		this.vie=pv;
		this.jeu =j;
		this.mouvement="banane";
		
	}

	public abstract void seDeplacer(Commande c);

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

	public abstract void attaquer(Commande c);

	public void etreEnMouvement(String mouv){
		this.mouvement = mouv;
	}
	public String mouvement(){
		return mouvement;
	}
 }
