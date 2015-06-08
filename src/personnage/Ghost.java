package personnage;

import jeu.MonJeu;
import moteurJeu.Commande;

public class Ghost extends Personnage {
	
	public Ghost(MonJeu j) {
		super((int)Math.random()*15,(int)Math.random()*(-15),10,3,30,j);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void seDeplacer(Commande c) {
		int i=(int)Math.random()*4;
		c= new Commande(i);
		if (c.gauche){
				posX--;
				if (this.posX<1){
					posX=1;
				}
		}
		if (c.droite ){
				this.posX++;
				if(this.posX>Personnage.LIMIT_X-1){
					this.posX=LIMIT_X-1;
				}
		}
		if (c.haut){
				this.posY--;
				if(this.posY<1){
					this.posY=1;
			}
		}
		if (c.bas){
				this.posY++;
				if(this.posY>Personnage.LIMIT_Y-1){
					this.posY=LIMIT_Y-1;
				}
		}
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

}
