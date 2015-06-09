import java.util.Scanner;

import javax.swing.JPanel;



import jeu.DessinMonJeu;
import jeu.MonJeu;
import moteurJeu.MoteurGraphique;

/**
 * lancement du moteur avec le jeu
 */
public class Main extends JPanel {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("choissisez votre niveau(entre 1 et 3) :" );
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		// creation du jeu particulier et de son afficheur
		MonJeu jeu = new MonJeu(i);
		DessinMonJeu aff = new DessinMonJeu(jeu);

		// classe qui lance le moteur de jeu generique
		MoteurGraphique moteur = new MoteurGraphique(jeu, aff);
		moteur.lancerJeu(800,800);
		
	}

}
