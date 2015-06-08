
package personnage;
import jeu.MonJeu;
import moteurJeu.Commande;
public class Heros extends Personnage{

	public Heros() {
		super(1,1,1,1,100);
	}
	public void seDeplacer(Commande c){
		
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
	public String toString(){
		return("vie: "+this.vie+" portee: "+this.portee+" Degats: "+this.attaque+" le personnage est en position: x:"+this.posX+" y: "+this.posY);
	}
}