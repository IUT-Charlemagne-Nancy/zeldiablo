
package personnage;
import java.util.ArrayList;
import java.util.List;

import Objet.Objet;
import jeu.MonJeu;
import moteurJeu.Commande;
public class Heros extends Personnage{

	private boolean avoirTalisman;
	private ArrayList<Objet> inventaire;
	private final static int MAX_INVENTAIRE=10;
	public Heros(MonJeu j) {
			super(1,1,5,1,100,j);
			avoirTalisman=false;
			inventaire=new ArrayList<Objet>();
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
		
		if (!this.etreMort() && inventaire.size()<MAX_INVENTAIRE){
			jeu.donnerObjet(this);
				
		}
	}
	public void ajouterObjet(Objet objet) {
		inventaire.add(objet);
		
	}
	public void avoirPrisTalisman() {
		avoirTalisman=true;
		
	}
	public void consommerObjet(int i){
		if(i<=inventaire.size()){
		inventaire.get(i).appliquerEffet(this);
		inventaire.remove(i);
		}
	}
	public boolean avoirTalisman(){
		return avoirTalisman;
	}
	
}
