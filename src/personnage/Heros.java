
package personnage;
import java.util.ArrayList;
import java.util.List;

import Objet.Objet;
import jeu.MonJeu;
import moteurJeu.Commande;
public class Heros extends Personnage{

	private boolean avoirTalisman;
	private final static int MAX_INVENTAIRE=10;
	public Heros(MonJeu j) {
			super(1,1,5,1,100,j);
			avoirTalisman=false;
	}
	public String toString(){
		return("vie: "+this.vie+" portee: "+this.portee+" Degats: "+this.attaque+" le personnage est en position: x:"+this.posX+" y: "+this.posY);
	}
	public void attaquer(Commande c){
		if(this.etreMort()==false){
			jeu.etreAPortee(this);
		}
	}
	public void prendre(Commande c){
		
		if (!this.etreMort()){
			jeu.donnerObjet(this);
				
		}
	}
	public void avoirPrisTalisman() {
		avoirTalisman=true;
		
	}
	public boolean avoirTalisman(){
		return avoirTalisman;
	}
	
}

