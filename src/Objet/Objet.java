package Objet;

import personnage.Heros;
import jeu.MonJeu;

public abstract class Objet {

	private String nomObjet;
	private boolean estPris;
	protected MonJeu jeu;

	
	/**
	 * Constructeur d'un objet;
	 * @param nom
	 * @param pris
	 */
	public Objet(String nom,MonJeu j) {
		this.nomObjet = nom;
		this.jeu = j;
		this.estPris = false;
		}
	
	/**
	 * methode qui indique qu'un objet est pris.
	 */
	public void etrePris(Heros heros){
		this.estPris = true;
		this.appliquerEffet(heros);
	}
	
	public abstract void appliquerEffet(Heros heros);

}
