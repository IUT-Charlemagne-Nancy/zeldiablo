package personnage;

import java.util.List;

import moteurJeu.Commande;
import jeu.MonJeu;


public class Orcs extends Personnage{

	public Orcs(MonJeu j) {
		super((int)Math.random()*15,  (int)Math.random()*15, 5, 1, 50, j);
		while (jeu.recupererCase(this.posX, this.posY).etreTraversable()==false){
			this.posX = (int)(Math.random()*15);
			this.posY = (int)(Math.random()*15);
		}
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

}
