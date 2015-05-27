
package personnage;
import moteurJeu.Commande;
public class Heros extends Personnage{

	public Heros() {
		super(0,0,1,1,10);
	}

	public void seDeplacer(Commande c){
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
	public String toString(){
		return("vie: "+this.vie+" portee: "+this.portee+" Degats: "+this.attaque+" le personnage est en position: x:"+this.posX+" y: "+this.posY);
	}
}