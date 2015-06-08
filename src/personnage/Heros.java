
package personnage;
import jeu.MonJeu;
import moteurJeu.Commande;
public class Heros extends Personnage{
	
	public Heros(MonJeu j) {
		super(1,1,1,1,10,j);
	}
	public void seDeplacer(Commande c){

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
	public String toString(){
		return("vie: "+this.vie+" portee: "+this.portee+" Degats: "+this.attaque+" le personnage est en position: x:"+this.posX+" y: "+this.posY);
	}
}