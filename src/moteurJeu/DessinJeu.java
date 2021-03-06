package moteurJeu;

import java.awt.*;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

import jeu.MonJeu;
import personnage.Heros;

/**
 * une interface representant la maniere de dessiner sur un JPanel
 * 
 * @author vthomas
 */
public interface DessinJeu {

	/**
	 * methode dessiner a completer. Elle construit une image correspondant au
	 * jeu. Jeu est un attribut de l'afficheur
	 * 
	 * @param image
	 *            image sur laquelle dessiner
	 */
	public abstract void dessiner(BufferedImage image);

}
