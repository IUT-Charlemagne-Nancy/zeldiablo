
package personnage;
import java.util.ArrayList;
import java.util.List;

import jeu.MonJeu;
import moteurJeu.Commande;
public class Heros extends Personnage{

	
	public Heros(MonJeu j) {
		super(1,1,5,1,100,j);
	}
	public String toString(){
		return("vie: "+this.vie+" portee: "+this.portee+" Degats: "+this.attaque+" le personnage est en position: x:"+this.posX+" y: "+this.posY);
	}
	public void attaquer(Commande c){
		if(this.etreMort()==false){
			jeu.etreAPortee(this);
		}
	}
}
