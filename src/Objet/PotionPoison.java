package Objet;

import personnage.Heros;
/**
 * 
 * @author Benjamin
 *
 */
public class PotionPoison extends Objet{

	public PotionPoison(int x, int y) {
		super("Potion empoison�e",x,y);
	}

	@Override
	public void appliquerEffet(Heros heros) {
		heros.setVie(heros.getVie()-10);
	}

}
