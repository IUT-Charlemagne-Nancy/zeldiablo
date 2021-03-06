package Objet;

import personnage.Heros;
import jeu.MonJeu;
/**
 * Classe abstraite qui definit les objets
 * @author Benjamin
 *
 */
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
	
	public String getNomObjet() {
		return nomObjet;
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
