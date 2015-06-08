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
		Object o = null;
		if(this instanceof Orcs){
			o=jeu.getPj();
		}
		if(this instanceof Heros){
			List<Personnage> perso=jeu.getMonstres();
			for(int i=0;i<perso.size();i++){
				if(perso.get(i) instanceof Orcs){
					o=(Orcs)perso.get(i);
				}
			}
		}
		if(this.etreMort()==false){
			if (c.gauche){
				if (jeu.recupererCase(this.posX-1,this.posY).etreTraversable() && (this.posX-1!=((Personnage) o).getPosX() || this.posY!=((Personnage) o).getPosY()) ){
					posX--;
					if (this.posX<1){
						posX=1;
					}
				}
			}
			if (c.droite ){
				if (jeu.recupererCase(this.posX+1,this.posY).etreTraversable()&& (this.posX+1!=((Personnage) o).getPosX() || this.posY!=((Personnage) o).getPosY())){
					this.posX++;
					if(this.posX>Personnage.LIMIT_X-1){
						this.posX=LIMIT_X-1;
					}
				}
			}
			if (c.haut){
				if (jeu.recupererCase(this.posX,this.posY-1).etreTraversable()&& (this.posX!=((Personnage) o).getPosX() || this.posY-1!=((Personnage) o).getPosY())){
					this.posY--;
					if(this.posY<1){
						this.posY=1;
					}
				}
			}
			if (c.bas){
				if (jeu.recupererCase(this.posX,this.posY+1).etreTraversable()&&(this.posX!=((Personnage) o).getPosX() || this.posY+1!=((Personnage) o).getPosY())){
					this.posY++;
					if(this.posY>Personnage.LIMIT_Y-1){
						this.posY=LIMIT_Y-1;
					}
				}
			}
		}
	}
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
