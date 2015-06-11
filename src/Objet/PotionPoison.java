package Objet;

import personnage.Heros;
/**
 * Classe qui definit une potion empoisonnee
 * @author Benjamin
 *
 */
public class PotionPoison extends Objet{

	/**
	 * constructeur d'une potion empoisonee
	 * @param x
	 * @param y
	 */
	public PotionPoison(int x, int y) {
		super("Potion empoisonée",x,y);
	}

	/**
	 * methode qui applique les effets du poison
	 */
	@Override
	public void appliquerEffet(Heros heros) {
		heros.setVie(heros.getVie()-10);
	}

}
