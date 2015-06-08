package jeu;

import java.awt.*;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

import personnage.Ghost;
import personnage.Heros;
import personnage.Orcs;
import personnage.Personnage;
import moteurJeu.DessinJeu;
import moteurJeu.Jeu;

/**
 * un afficheur graphique associe au JeuTest fourni
 * 
 * @author vthomas
 */
public class DessinMonJeu implements DessinJeu {

	/**
	 * constante pour gerer la taille des cases
	 */
	private static int TAILLE_CASE = 25;

	/**
	 * lien vers le jeu a afficher
	 */
	public MonJeu jeu;

	/**
	 * appelle constructeur parent
	 * 
	 * @param j
	 *            le jeutest a afficher
	 */
	public DessinMonJeu(MonJeu j) {
		this.jeu = j;
	}

	/**
	 * dessiner un objet consiste a dessiner sur l'image suivante methode
	 * redefinie de Afficheur
	 */
	private void dessinerObjet(String s, int x, int y, BufferedImage im) {
		Graphics2D crayon = (Graphics2D) im.getGraphics();
		switch (s) {
		case "PJ":
			crayon.setColor(Color.green);
			crayon.fillOval(x * TAILLE_CASE, y * TAILLE_CASE, TAILLE_CASE,
					TAILLE_CASE);
			break;
		case "ORCS":
			crayon.setColor(Color.red);
			crayon.fillOval(x * TAILLE_CASE, y * TAILLE_CASE, TAILLE_CASE,
					TAILLE_CASE);
			break;
		case "GHOST":
			crayon.setColor(Color.blue);
			crayon.fillOval(x * TAILLE_CASE, y * TAILLE_CASE, TAILLE_CASE,
					TAILLE_CASE);
			break;
		case "MUR":
			crayon.setColor(Color.gray);
			crayon.fillRect(x * TAILLE_CASE, y * TAILLE_CASE, TAILLE_CASE,
					TAILLE_CASE);
			break;
		default:
			throw new AssertionError("objet inexistant");
		}
	}

	/**
	 * methode dessiner redefinie de Afficheur retourne une image du jeu
	 */
	public void dessiner(BufferedImage im) {
		// no sait que c'est un jeuTest
		MonJeu j = (MonJeu) jeu;
		Personnage pj = j.getPj();
		Orcs orc = new Orcs(j);
		
		for (int i = 0 ;i<j.LIMIT_X;i++){
			for (int k = 0; k<j.LIMIT_Y; k++){
				Case c = j.recupererCase(i,k);
				if (c instanceof Mur){
					this.dessinerObjet("MUR",i,k,im);
				}
			}
			
		}
		for (int i = 0 ; i < j.monstres.size() ; i++){
			if (j.monstres.get(i) instanceof Orcs){
				this.dessinerObjet("ORCS",j.monstres.get(i).getPosX(), j.monstres.get(i).getPosY(), im);
			}
			if (j.monstres.get(i) instanceof Ghost){
				this.dessinerObjet("GHOST", j.monstres.get(i).getPosX(), j.monstres.get(i).getPosY(), im);
			}
		}
		
		this.dessinerObjet("PJ", pj.getPosX(), pj.getPosY(), im);
		
	}

}
