package Objet;

import personnage.Heros;

/**
 * Classe qui definit une potion de soin
 * @author Benjamin
 *
 */
public class PotionSoin extends Objet {

	/**
	 * constructeur d'une potion de soin
	 * @param x
	 * @param y
	 */
	public PotionSoin(int x,int y) {
		super("Potion de soin",x,y);
	}

	/**
	 * methode qui applique les effets de soin
	 */
	@Override
	public void appliquerEffet(Heros heros) {
		heros.setVie(heros.getVie()+25);	
	}

}
