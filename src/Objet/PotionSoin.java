package Objet;

import personnage.Heros;
/**
 * 
 * @author Benjamin
 *
 */
public class PotionSoin extends Objet {

	public PotionSoin(int x,int y) {
		super("Potion de soin",x,y);
	}

	@Override
	public void appliquerEffet(Heros heros) {
		heros.setVie(heros.getVie()+25);	
	}

}
