package Objet;

import personnage.Heros;

/**
 * 
 * @author Benjamin
 *
 */
public class PotionMagique extends Objet{

	public PotionMagique(int x, int y) {
		super("Potion magique",x,y);
	}

	@Override
	public void appliquerEffet(Heros heros) {
		heros.setAttaque(heros.getDegat()+4);
		heros.setVie(heros.getDegat()+30);
	}

}
