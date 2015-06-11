package personnage;

import java.util.List;

import moteurJeu.Commande;
import jeu.MonJeu;
import java.util.List;

import moteurJeu.Commande;
import jeu.MonJeu;

/**
 * classe qui definit les orcs
 * @author Benjamin
 *
 */
public class Orcs extends Monstre{

	/**
	 * constructeur d'orcs
	 * @param x
	 * @param y
	 * @param j
	 */
	public Orcs(int x,int y,MonJeu j) {
		super(x,y, 5, 1, 50, j);
	}
	
	/**
	 * methode qui permet à l'orc de se deplacer
	 */
	public void seDeplacer(Commande c){
		if(this.etreMort()==false){
			if (c.gauche){
				if (jeu.recupererCase(this.posX-1,this.posY).etreTraversable() && !jeu.caseOccuper(this.posX-1, this.posY)){
					if (this.posX-1>ZONE_INTERDITE_X||this.posY>ZONE_INTERDITE_Y){
						posX--;
						if (this.posX<1){
							posX=1;
						}
					}
				}
				this.etreEnMouvement("gauche");
			}
			if (c.droite ){
				if (jeu.recupererCase(this.posX+1,this.posY).etreTraversable()&& !jeu.caseOccuper(this.posX+1, this.posY)){
					this.posX++;
					if(this.posX>Personnage.LIMIT_X-1){
						this.posX=LIMIT_X-1;
					}
				}
				this.etreEnMouvement("droite");
			}
			if (c.haut){
				if (jeu.recupererCase(this.posX,this.posY-1).etreTraversable()&& !jeu.caseOccuper(this.posX, this.posY-1)){
					if (this.posY>ZONE_INTERDITE_Y || this.posX>ZONE_INTERDITE_X){
						this.posY--;
						if(this.posY<1){
							this.posY=1;
						}
					}
				}
				this.etreEnMouvement("haut");
			}
			if (c.bas){
				if (jeu.recupererCase(this.posX,this.posY+1).etreTraversable()&&!jeu.caseOccuper(this.posX, this.posY+1)){
					this.posY++;
					if(this.posY>Personnage.LIMIT_Y-1){
						this.posY=LIMIT_Y-1;
					}
				}
				this.etreEnMouvement("bas");
			}
		}
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

}
