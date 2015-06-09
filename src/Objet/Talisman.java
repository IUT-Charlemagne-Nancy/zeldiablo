package Objet;

import personnage.Heros;
import jeu.MonJeu;

public class Talisman extends Objet{

	public Talisman() {
		super("Talisman magique",14,9);
	}

	@Override
	public void appliquerEffet(Heros heros) {
		heros.setVie(heros.getVie()*2+100);
		heros.setAttaque(heros.getAttaque()*2);
		heros.setPortee(heros.getPortee()*2);
		
	}

}
