package personnage;

import moteurJeu.Commande;
import jeu.MonJeu;
	
public abstract class Monstre extends Personnage {
	protected static final int ZONE_INTERDITE_X=4;
	protected static final int ZONE_INTERDITE_Y=4;
	public Monstre(int x, int y, int attack, int porte, int pv, MonJeu j) {
		super(x,y,attack,porte,pv,j);
		// TODO Auto-generated constructor stub
	}
	public void attaquer(Commande c){
		if(this.etreMort()==false){
			jeu.getPj().subirDegat(this.getAttaque());
			this.etreEnMouvement("attaque");
		}
	}
	@Override
	public abstract void seDeplacer(Commande c);

}