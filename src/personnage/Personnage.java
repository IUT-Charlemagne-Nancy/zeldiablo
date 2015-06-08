package personnage;

import moteurJeu.Commande;
import jeu.MonJeu;

public abstract class Personnage {
	private MonJeu jeu;
	protected int posX,posY,attaque,portee,vie;
	public final static int LIMIT_X=15;
	public final static int LIMIT_Y=15; 
	
	public Personnage(int x, int y, int attack, int porte, int pv) {
		this.posX=x;
		this.posY=y;
		this.attaque=attack;
		this.portee=porte;
		this.vie=pv;
	}

	public abstract void seDeplacer(Commande c);
	public abstract String toString();
	public void attaquer(Personnage victime){
		if(!this.etreMort()){
			if (!victime.etreMort()){

				if(this.etreAPortee(victime)){
					victime.subirDegat(this.attaque);
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
	public boolean etreAPortee(Personnage perso){
		boolean res=false;
		if(Math.abs(this.posX-perso.posX)<=portee&&Math.abs(this.posY-perso.posY)<=portee){
			res=true;
		}
		return res;
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
}
