package personnage;

import jeu.MonJeu;
import moteurJeu.Commande;

public class Orcs extends Personnage{

	

	public Orcs(MonJeu j) {
		super((int)Math.random()*15,  (int)Math.random()*15, 25, 1, 50, j);
		while (jeu.recupererCase(this.posX, this.posY).etreTraversable()==false){
			this.posX = (int)(Math.random()*15);
			this.posY = (int)(Math.random()*15);
		}
		// TODO Auto-generated constructor stub
	}

	public void seDeplacer(Commande c){
		if(this.etreMort()==false){
			if (c.gauche){
				if (jeu.recupererCase(this.posX-1,this.posY).etreTraversable()){
					posX--;
					if (this.posX<1){
						posX=1;
					}
				}
			}
			if (c.droite ){
				if (jeu.recupererCase(this.posX+1,this.posY).etreTraversable()){
					this.posX++;
					if(this.posX>Personnage.LIMIT_X-1){
						this.posX=LIMIT_X-1;
					}
				}
			}
			if (c.haut){
				if (jeu.recupererCase(this.posX,this.posY-1).etreTraversable()){
					this.posY--;
					if(this.posY<1){
						this.posY=1;
					}
				}
			}
			if (c.bas){
				if (jeu.recupererCase(this.posX,this.posY+1).etreTraversable()){
					this.posY++;
					if(this.posY>Personnage.LIMIT_Y-1){
						this.posY=LIMIT_Y-1;
					}
				}
			}
		}
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

}
