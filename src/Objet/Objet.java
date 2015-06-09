package Objet;

import personnage.Heros;
import jeu.MonJeu;

public abstract class Objet {

	private String nomObjet;
	private boolean estPris;
	private int posX;
	private int posY;
	
	/**
	 * Constructeur d'un objet;
	 * @param nom
	 * @param pris
	 */
	public Objet(String nom,int x,int y) {
		this.nomObjet = nom;
		this.posX = x;
		this.posY = y;
		}
	
	/**
	 * methode qui indique qu'un objet est pris.
	 */
	
	public String getNomObjet() {
		return nomObjet;
	}

	public void setNomObjet(String nomObjet) {
		this.nomObjet = nomObjet;
	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	public abstract void appliquerEffet(Heros heros);

}
