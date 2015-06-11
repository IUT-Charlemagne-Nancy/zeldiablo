package personnage;

import moteurJeu.Commande;
import jeu.MonJeu;
	
/**
 * Classe abstraite qui definit tout les monstres du jeu
 * @author Benjamin
 *
 */
public abstract class Monstre extends Personnage {
	protected static final int ZONE_INTERDITE_X=4;
	protected static final int ZONE_INTERDITE_Y=4;
	
	/**
	 * constructeur d'un monstre
	 * @param x
	 * @param y
	 * @param attack
	 * @param porte
	 * @param pv
	 * @param j
	 */
	public Monstre(int x, int y, int attack, int porte, int pv, MonJeu j) {
		super(x,y,attack,porte,pv,j);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * methode qui permet au monsre d'attaquer
	 */
	public void attaquer(Commande c){
		if(this.etreMort()==false){
			jeu.getPj().subirDegat(this.getAttaque());
			this.etreEnMouvement("attaque");
		}
	}
	
	/**
	 * methode qui permet au monstre de se deplacer
	 */
	@Override
	public abstract void seDeplacer(Commande c);

}