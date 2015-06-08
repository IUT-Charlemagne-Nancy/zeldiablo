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
		if (this.etreMort() == false){
			if (c.gauche){
				posX--;
				if (this.posX<0){
					posX=0;
				}
			}
			if (c.droite ){
				this.posX++;
				if(this.posX>Personnage.LIMIT_X){
					this.posX=LIMIT_X;
				}
			}
			if (c.haut){
				this.posY--;
				if(this.posY<0){
					this.posY=0;
				}
			}
			if (c.bas){
				this.posY++;
				if(this.posY>Personnage.LIMIT_Y){
					this.posY=LIMIT_Y;
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
