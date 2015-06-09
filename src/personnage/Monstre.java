package personnage;

import moteurJeu.Commande;
import jeu.MonJeu;

public class Monstre extends Personnage {

	public Monstre(int x, int y, int attack, int porte, int pv, MonJeu j) {
		super(x,y,attack,porte,pv,j);
		// TODO Auto-generated constructor stub
	}
	public void attaquer(Commande c){
		if(this.etreMort()==false){
			jeu.etreAPorteeHeros(this);
		}
	}

}
