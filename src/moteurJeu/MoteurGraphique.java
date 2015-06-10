package moteurJeu;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import jeu.DessinMonJeu;
import jeu.MonJeu;

/**
 * classe MoteurGraphique represente un moteur de jeu generique.
 * 
 * On lui passe un jeu et un afficheur et il permet d'executer un jeu.
 */
public class MoteurGraphique extends JPanel {

	private boolean ouvert = false;
	
	/**
	 * le jeu a executer
	 */
	private Jeu jeu;

	/**
	 * l'interface graphique
	 */
	private InterfaceGraphique gui;

	/**
	 * l'afficheur a utiliser pour le rendu
	 */
	private DessinMonJeu dessin;

	/**
	 * construit un moteur
	 * 
	 * @param pJeu
	 *            jeu a lancer
	 * @param pAffiche
	 *            afficheur a utiliser
	 */
	public MoteurGraphique(Jeu pJeu, DessinMonJeu pAffiche) {
		// creation du jeu
		this.jeu = pJeu;
		this.dessin = pAffiche;
	}

	/**
	 * permet de lancer le jeu
	 */
	public void lancerJeu(int width, int height) throws InterruptedException {

		// creation de l'interface graphique
		this.gui = new InterfaceGraphique(this.dessin,width,height);
		Controleur controle = this.gui.getControleur();
		JFrame premierepage = new JFrame();
		premierepage.setBackground(Color.gray);
		JPanel affiche = new JPanel();
		
		final JLabel consigne = new JLabel();
		consigne.setText("Vous êtes un chevalier, et votre quête a ");
		
		final JLabel consigne2 = new JLabel();
		consigne2.setText("pour but de chercher le talisman magique et de le ramener sans vous faire tuer.");
		
		final JLabel consigne3 = new JLabel();
		consigne3.setText("Vous disposez d'une épée, et de votre ruse. De plus, des potions seronts disponibles afin");
		
		final JLabel consigne4 = new JLabel();
		consigne4.setText("(peut être) de vous sauvez.");
		
		final JLabel vide = new JLabel();
		vide.setText("                                                                                                                                                                                       ");

		final JLabel control = new JLabel();
		control.setText("Controle : Haut --> Z    Bas --> S ");

		final JLabel control2 = new JLabel();
		control2.setText("Gauche --> Q   Droite --> D");
		
		final JButton b1 = new JButton("Commencez");
		
		while(ouvert != true){
		b1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
				ouvert = true;
					
			}
		});
			affiche.add(consigne);
			affiche.add(consigne2);
			affiche.add(consigne3);
			affiche.add(consigne4);
			affiche.add(vide);
			affiche.add(control);
			affiche.add(control2);
			affiche.add(b1);
			premierepage.setPreferredSize(new Dimension(600,300));
			premierepage.setContentPane(affiche);
			premierepage.pack();
			premierepage.setAlwaysOnTop(true);
			premierepage.setVisible(true);
			premierepage.getContentPane().requestFocus();
		}
			
		
		// boucle de jeu
		while (!this.jeu.etreFini()) {
			// demande controle utilisateur
			Commande c = controle.getCommande();
			// fait evoluer le jeu
			this.jeu.evoluer(c);
			// affiche le jeu
			this.gui.dessiner();
			this.gui.secondes = this.gui.secondes + 0.1;
			// met en attente
			Thread.sleep(100);
		}
		JFrame a = new JFrame();
		a.setBackground(Color.gray);
		JLabel win = new JLabel();
		a.setAlwaysOnTop(true);
		if(this.gui.nombremonstre == 0 || this.jeu.etreFini() && !dessin.jeu.getPj().etreMort()){
			win.setText("Vous avez gagné !! ");
			a.add(win);
			a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			a.setPreferredSize(new Dimension(250,70));
			a.setContentPane(win);
			a.pack();
			a.setVisible(true);
			a.getContentPane().setFocusable(true);
			a.getContentPane().requestFocus();
		}
		else {
			win.setText("Vous avez perdu :(");
			a.add(win);
			a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			a.setPreferredSize(new Dimension(250,70));
			a.setContentPane(win);
			a.pack();
			a.setVisible(true);
			a.getContentPane().setFocusable(true);
			a.getContentPane().requestFocus();
		}
	}

}
