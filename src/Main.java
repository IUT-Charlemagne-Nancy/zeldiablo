import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

import personnage.Barre_de_vie;
import jeu.DessinMonJeu;
import jeu.MonJeu;
import moteurJeu.MoteurGraphique;

/**
 * lancement du moteur avec le jeu
 */
public class Main extends JPanel {

	public static void main(String[] args) throws InterruptedException {

		// creation du jeu particulier et de son afficheur
		MonJeu jeu = new MonJeu();
		DessinMonJeu aff = new DessinMonJeu(jeu);

		// classe qui lance le moteur de jeu generique
		MoteurGraphique moteur = new MoteurGraphique(jeu, aff);
		Barre_de_vie barre = new Barre_de_vie();
		Main fenetre = new Main();
		fenetre.setLayout(new BorderLayout());
		fenetre.add(moteur,BorderLayout.NORTH);
		fenetre.add(barre, BorderLayout.EAST);
		JFrame vue = new JFrame();
		vue.setContentPane(fenetre);
		vue.pack();
		vue.setVisible(true);
		moteur.lancerJeu(400,400);
		
	}

}
