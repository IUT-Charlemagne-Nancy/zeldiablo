import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;








import javax.swing.JRadioButton;

import jeu.DessinMonJeu;
import jeu.MonJeu;
import moteurJeu.MoteurGraphique;

/**
 * lancement du moteur avec le jeu
 */
public class Main extends JPanel {
	
	private static int i;
	
	private static boolean ouvert = false;

	public static void main(String[] args) throws InterruptedException, IOException {
		i = 0;
		final JFrame a = new JFrame();
		final JPanel b = new JPanel();
		final JLabel affich = new JLabel();
		final JRadioButton b1 = new JRadioButton("1er stage");
		final JRadioButton b2 = new JRadioButton("2eme stage");
		final JRadioButton b3 = new JRadioButton("3eme stage");
		final JRadioButton b4 = new JRadioButton("4eme stage");
		affich.setText("Veuillez selectionnez le numero du stage : ");
		while(ouvert != true){
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					a.dispose();
					i = 1;
					ouvert = true;
				}
			});
		
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					a.dispose();
					i = 2;
					ouvert = true;
				}
			});
		
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					a.dispose();
					i = 3;
					ouvert = true;
				}
			});
		
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					a.dispose();
					i = 4;
					ouvert = true;
				}
			});
		b.add(affich);
		b.add(b1);
		b.add(b2);
		b.add(b3);
		b.add(b4);
		a.setContentPane(b);
		a.setPreferredSize(new Dimension(600,300));
		a.pack();
		a.setAlwaysOnTop(true);
		a.setVisible(true);
		a.getContentPane().requestFocus();
		}
		// creation du jeu particulier et de son afficheur
		MonJeu jeu = new MonJeu(i);
		DessinMonJeu aff = new DessinMonJeu(jeu);

		// classe qui lance le moteur de jeu generique
		MoteurGraphique moteur = new MoteurGraphique(jeu, aff);
		moteur.lancerJeu(800,800);
		
	}

}
