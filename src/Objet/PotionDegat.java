package Objet;

import personnage.Heros;
/**
 * 
 * @author Benjamin
 *
 */
public class PotionDegat extends Objet{

	public PotionDegat(int x, int y) {
		super("Potion de dégats",x,y);
	}

	@Override
	public void appliquerEffet(Heros heros) {
		heros.setAttaque(heros.getAttaque()+2);		
	}

}
