package personnage;

import java.util.List;
import java.util.ArrayList;

import moteurJeu.Commande;
import jeu.MonJeu;

public abstract class Personnage {
	protected MonJeu jeu;
	protected int posX,posY,attaque,portee,vie;
	public final static int LIMIT_X=15;
	public final static int LIMIT_Y=15; 
	
	public Personnage(int x, int y, int attack, int porte, int pv, MonJeu j) {
		this.posX=x;
		this.posY=y;
		this.attaque=attack;
		this.portee=porte;
		this.vie=pv;
		this.jeu =j;
	}

	public void seDeplacer(Commande c){
		if(this.etreMort()==false){
			if (c.gauche){
				if (jeu.recupererCase(this.posX-1,this.posY).etreTraversable() && !jeu.caseOccuper(this.posX-1, this.posY) ){
					posX--;
					if (this.posX<0){
						posX=0;
					}
				}
			}
			if (c.droite ){
				if (jeu.recupererCase(this.posX+1,this.posY).etreTraversable()&& !jeu.caseOccuper(this.posX+1, this.posY)){
					this.posX++;
					if(this.posX>Personnage.LIMIT_X-1){
						this.posX=LIMIT_X-1;
					}
				}
			}
			if (c.haut){
				if (jeu.recupererCase(this.posX,this.posY-1).etreTraversable()&& !jeu.caseOccuper(this.posX, this.posY-1)){
					this.posY--;
					if(this.posY<0){
						this.posY=0;
					}
				}
			}
			if (c.bas){
				if (jeu.recupererCase(this.posX,this.posY+1).etreTraversable()&&!jeu.caseOccuper(this.posX, this.posY+1)){
					this.posY++;
					if(this.posY>Personnage.LIMIT_Y-1){
						this.posY=LIMIT_Y-1;
					}
				}
			}
		}
	}

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
	public int getDegat(){
		return this.attaque;
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
		
 }
