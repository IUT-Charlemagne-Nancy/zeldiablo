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
		heros.setAttaque(heros.getAttaque()+4);
		heros.setVie(heros.getVie()+30);
	}

}
