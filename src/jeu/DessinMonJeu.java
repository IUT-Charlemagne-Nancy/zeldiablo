package jeu;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

import Objet.Talisman;
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

	public Image images;

	/**
	 * constante pour gerer la taille des cases
	 */
	private static int TAILLE_CASE = 25;

	/**
	 * lien vers le jeu a afficher
	 */
	public static MonJeu jeu;

	/**
	 * appelle constructeur parent
	 * 
	 * @param j
	 *            le jeutest a afficher
	 * @throws IOException 
	 */
	public DessinMonJeu(MonJeu j) throws IOException {
		this.jeu = j;
		images = new Image();
	}

	/**
	 * dessiner un objet consiste a dessiner sur l'image suivante methode
	 * redefinie de Afficheur
	 */
	private void dessinerObjet(String s, int x, int y, BufferedImage im)
			throws IOException {
		Graphics2D crayon = (Graphics2D) im.getGraphics();
		crayon.setColor(Color.DARK_GRAY);
		switch (s) {
		case "PJ":
			im = images.heros;
			crayon.drawImage(im, x * TAILLE_CASE, y * TAILLE_CASE, null);
			break;
		case "PJg":
			im = images.herosgauche;
			crayon.drawImage(im, x * TAILLE_CASE, y * TAILLE_CASE, null);
			break;
		case "PJd":
			im = images.herosdroite;
			crayon.drawImage(im, x * TAILLE_CASE, y * TAILLE_CASE, null);
			break;
		case "PJb":
			im = images.herosbas;
			crayon.drawImage(im, x * TAILLE_CASE, y * TAILLE_CASE, null);
			break;
		case "PJh":
			im = images.heroshaut;
			crayon.drawImage(im, x * TAILLE_CASE, y * TAILLE_CASE, null);
			break;
		case "PJa":
			im = images.herosattaque;
			crayon.drawImage(im, x * TAILLE_CASE, y * TAILLE_CASE, null);
			break;
		case "PJp":
			im = images.herosprendre;
			crayon.drawImage(im, x * TAILLE_CASE, y * TAILLE_CASE, null);
			break;
		case "MORTPJ":
			im = images.herosmort;
			crayon.drawImage(im, x * TAILLE_CASE, y * TAILLE_CASE, null);
			break;
		case "GHOST":
			im = images.ghost;
			crayon.drawImage(im, x * TAILLE_CASE, y * TAILLE_CASE, null);
			break;
		case "GHOSTg":
			im = images.ghostgauche;
			crayon.drawImage(im, x * TAILLE_CASE, y * TAILLE_CASE, null);
			break;
		case "GHOSTd":
			im = images.ghostdroite;
			crayon.drawImage(im, x * TAILLE_CASE, y * TAILLE_CASE, null);
			break;
		case "GHOSTb":
			im = images.ghostbas;
			crayon.drawImage(im, x * TAILLE_CASE, y * TAILLE_CASE, null);
			break;
		case "GHOSTh":
			im = images.ghosthaut;
			crayon.drawImage(im, x * TAILLE_CASE, y * TAILLE_CASE, null);
			break;
		case "GHOSTa":
			im = images.ghostattaque;
			crayon.drawImage(im, x * TAILLE_CASE, y * TAILLE_CASE, null);
			break;
		case "GHOSTm":
			im = images.ghostmort;
			crayon.drawImage(im, x * TAILLE_CASE, y * TAILLE_CASE, null);
			break;
		case "ORCS":
			im = images.orcs;
			crayon.drawImage(im, x * TAILLE_CASE, y * TAILLE_CASE, null);
			break;
		case "ORCSg":
			im = images.orcsgauche;
			crayon.drawImage(im, x * TAILLE_CASE, y * TAILLE_CASE, null);
			break;
		case "ORCSd":
			im = images.orcsdroite;
			crayon.drawImage(im, x * TAILLE_CASE, y * TAILLE_CASE, null);
			break;
		case "ORCSb":
			im = images.orcsbas;
			crayon.drawImage(im, x * TAILLE_CASE, y * TAILLE_CASE, null);
			break;
		case "ORCSh":
			im = images.orcshaut;
			crayon.drawImage(im, x * TAILLE_CASE, y * TAILLE_CASE, null);
			break;
		case "ORCSattaque":
			im = images.orcsattaque;
			crayon.drawImage(im, x * TAILLE_CASE, y * TAILLE_CASE, null);
			break;
		case "ORCSm":
			im = images.orcsmort;
			crayon.drawImage(im, x * TAILLE_CASE, y * TAILLE_CASE, null);
			break;
		case "MUR":
			im = images.mur;
			crayon.drawImage(im, x * TAILLE_CASE, y * TAILLE_CASE, null);
			break;
		case "SOL":
			crayon.setColor(Color.gray);
			crayon.fillRect(x * TAILLE_CASE, y * TAILLE_CASE, TAILLE_CASE,
					TAILLE_CASE);
			break;
		case "MORT":
			im = images.mort;
			crayon.drawImage(im, x * TAILLE_CASE, y * TAILLE_CASE, null);
			break;
		case "SPAWN":
			crayon.setColor(new Color(200, 140, 0));
			crayon.fillRect(x * TAILLE_CASE, y * TAILLE_CASE, TAILLE_CASE,
					TAILLE_CASE);
			break;
		case "TALISMAN":
			im = images.talisman;
			crayon.drawImage(im, x * TAILLE_CASE, y * TAILLE_CASE, null);

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
		String gauche = "gauche";
		String droite = "droite";
		String haut = "haut";
		String bas = "bas";
		String attaque = "attaque";
		String prendre = "prendre";

		for (int i = 0; i < j.LIMIT_X; i++) {
			for (int k = 0; k < j.LIMIT_Y; k++) {
				Case c = j.recupererCase(i, k);
				if (c instanceof Mur) {
					try {
						this.dessinerObjet("MUR", i, k, im);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} else {
					if (i <= 3 && i > 0 && k <= 3 && k > 0) {
						try {
							this.dessinerObjet("SPAWN", i, k, im);
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					} else {
						try {
							this.dessinerObjet("SOL", i, k, im);
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}

			}

		}
		for (int i = 0; i < j.monstres.size(); i++) {
			if (j.monstres.get(i) instanceof Orcs){
				if (j.monstres.get(i).etreMort() == false) {
					try {
						String mouv = j.monstres.get(i).mouvement();
						if (mouv.equals("repos")){
							this.dessinerObjet("ORCS", j.monstres.get(i).getPosX(), j.monstres.get(i).getPosY(), im);
						}
						if (mouv.equals(gauche)){
							this.dessinerObjet("ORCSg", j.monstres.get(i).getPosX(), j.monstres.get(i).getPosY(), im);
							j.monstres.get(i).etreEnMouvement("repos");
						}
						if (mouv.equals(droite)){
							this.dessinerObjet("ORCSd", j.monstres.get(i).getPosX(), j.monstres.get(i).getPosY(), im);
							j.monstres.get(i).etreEnMouvement("repos");
						}
						if (mouv.equals(bas)){
							this.dessinerObjet("ORCSb", j.monstres.get(i).getPosX(), j.monstres.get(i).getPosY(), im);
							j.monstres.get(i).etreEnMouvement("repos");
						}
						if (mouv.equals(haut)){
							this.dessinerObjet("ORCSh", j.monstres.get(i).getPosX(), j.monstres.get(i).getPosY(), im);
							j.monstres.get(i).etreEnMouvement("repos");
						}
						if (mouv.equals(attaque)){
							this.dessinerObjet("ORCSa", j.monstres.get(i).getPosX(), j.monstres.get(i).getPosY(), im);
							j.monstres.get(i).etreEnMouvement("repos");
						}
						
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				else {
					try{
						this.dessinerObjet("ORCSm", j.monstres.get(i).getPosX(), j.monstres.get(i).getPosY(), im);
					}
					catch (IOException e){
						e.printStackTrace();
					}
				}
			}
			if (j.monstres.get(i) instanceof Ghost){
				if (j.monstres.get(i).etreMort() == false) {
					try {
						String mouv = j.monstres.get(i).mouvement();
						if (mouv.equals("repos")){
							this.dessinerObjet("GHOST", j.monstres.get(i).getPosX(), j.monstres.get(i).getPosY(), im);
						}
						if (mouv.equals(gauche)){
							this.dessinerObjet("GHOSTg", j.monstres.get(i).getPosX(), j.monstres.get(i).getPosY(), im);
							j.monstres.get(i).etreEnMouvement("repos");
						}
						if (mouv.equals(droite)){
							this.dessinerObjet("GHOSTd", j.monstres.get(i).getPosX(), j.monstres.get(i).getPosY(), im);
							j.monstres.get(i).etreEnMouvement("repos");
						}
						if (mouv.equals(bas)){
							this.dessinerObjet("GHOSTb", j.monstres.get(i).getPosX(), j.monstres.get(i).getPosY(), im);
							j.monstres.get(i).etreEnMouvement("repos");
						}
						if (mouv.equals(haut)){
							this.dessinerObjet("GHOSTh", j.monstres.get(i).getPosX(), j.monstres.get(i).getPosY(), im);
							j.monstres.get(i).etreEnMouvement("repos");
						}
						if (mouv.equals(attaque)){
							this.dessinerObjet("GHOSTa", j.monstres.get(i).getPosX(), j.monstres.get(i).getPosY(), im);
							j.monstres.get(i).etreEnMouvement("repos");
						}
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				else {
					try{
						this.dessinerObjet("GHOSTm", j.monstres.get(i).getPosX(), j.monstres.get(i).getPosY(), im);
					}
					catch (IOException e){
						e.printStackTrace();
					}
				}
			}
		}
		for (int i = 0; i < j.objets.size(); i++) {
			if (j.objets.get(i) instanceof Talisman) {
				try {
					this.dessinerObjet("TALISMAN", j.objets.get(i).getPosX(),
							j.objets.get(i).getPosY(), im);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		if (!pj.etreMort()) {
			try {
				String mouv = pj.mouvement();
				if (mouv.equals("repos")){
					this.dessinerObjet("PJ", pj.getPosX(), pj.getPosY(), im);
				}
				if (mouv.equals(gauche)){
					this.dessinerObjet("PJg", pj.getPosX(), pj.getPosY(), im);
					j.getPj().etreEnMouvement("repos");
				}
				if (mouv.equals(droite)){
					this.dessinerObjet("PJd", pj.getPosX(), pj.getPosY(), im);
					j.getPj().etreEnMouvement("repos");
				}
				if (mouv.equals(bas)){
					this.dessinerObjet("PJb", pj.getPosX(), pj.getPosY(), im);
					j.getPj().etreEnMouvement("repos");
				}
				if (mouv.equals(haut)){
					this.dessinerObjet("PJh", pj.getPosX(), pj.getPosY(), im);
					j.getPj().etreEnMouvement("repos");
				}
				if (mouv.equals(attaque)){
					this.dessinerObjet("PJa", pj.getPosX(), pj.getPosY(), im);
					j.getPj().etreEnMouvement("repos");
				}
				if (mouv.equals(prendre)){
					this.dessinerObjet("PJp", pj.getPosX(), pj.getPosY(), im);
					j.getPj().etreEnMouvement("repos");
				}

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (pj.etreMort() == true) {
			try {
				this.dessinerObjet("MORTPJ", pj.getPosX(), pj.getPosY(), im);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

}
