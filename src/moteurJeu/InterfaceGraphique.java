package moteurJeu;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;

import java.util.Scanner;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.SwingUtilities;
import javax.swing.Timer;
import javax.swing.border.TitledBorder;

import personnage.Personnage;
import jeu.DessinMonJeu;

/**
 * cree une interface graphique avec son controleur et son afficheur
 * @author Graou
 *
 */

public class InterfaceGraphique {







	protected boolean ok = false;
	/**
	 * le Panel lie a la JFrame
	 */
	private PanelDessin panel;

	/**
	 * le controleur lie a la JFrame
	 */
	private Controleur controleur;

	/**
	 * la construction de l'interface grpahique
	 * - construit la JFrame
	 * - construit les Attributs
	 * 
	 * @param dessin l'afficheur a utiliser dans le moteur
	 * @throws InterruptedException 
	 * 
	 */
	public InterfaceGraphique(final DessinMonJeu dessin,int x,int y) throws InterruptedException
	{
		JFrame f=new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setPreferredSize(new Dimension(1000,1000));


		JProgressBar barre_vie;
		int MINIMUM=0;
		int MAXIMUM=100;

		int vie;
		vie = dessin.jeu.getPj().getVie();
		int attaque = dessin.jeu.getPj().getDegat();
		int portee = dessin.jeu.getPj().getPortee();
		int posx = dessin.jeu.getPj().getPosX();
		int posy = dessin.jeu.getPj().getPosY();






		// Cr�er un objet de la Barre de progression
		barre_vie = new JProgressBar();
		barre_vie.setBackground(Color.WHITE);
		barre_vie.setForeground(Color.green);
		if(vie < 80){
			barre_vie.setForeground(Color.yellow);
		}
		if(vie<50){
			barre_vie.setForeground(Color.orange);
		}
		if(vie <= 20) {
			barre_vie.setForeground(Color.RED);
		}

		// D�finir la valeur initiale de la barre de progression
		barre_vie.setMinimum(MINIMUM);
		// D�finir la valeur maximale de la barre de progression
		barre_vie.setMaximum(MAXIMUM);


		barre_vie.setValue(vie); 






		JPanel Total = new JPanel();
		JPanel Informations = new JPanel();
		Total.setPreferredSize(new Dimension(600,450));


		Total.setLayout(new BorderLayout());

		JLabel ecriture = new JLabel();
		ecriture.setText("Points de vie : " + vie);

		JLabel pointA = new JLabel();
		pointA.setText("Points d'attaque : " + attaque);

		JLabel po = new JLabel();
		po.setText("Portee : " + portee);

		JLabel vide = new JLabel();
		vide.setText("                    ");

		JLabel vide2 = new JLabel();
		vide2.setText("                                                        ");

		JLabel vide1 = new JLabel();
		vide1.setText("                                                        ");

		JLabel control = new JLabel();
		control.setText("Controle : Haut --> Z    Bas --> S ");

		JLabel control2 = new JLabel();
		control2.setText("Gauche --> Q   Droite --> D");

		JLabel boussole = new JLabel();
		boussole.setText("Boussole : " + " Position en x : " + posx );

		JLabel boussole1 = new JLabel();

		boussole1.setText(" Position en y : " + posy);


		this.panel=new PanelDessin(x, y,dessin);
		Controleur controlleurGraph=new Controleur(this);
		this.controleur=controlleurGraph;
		Total.addKeyListener(controlleurGraph);



		TitledBorder border = BorderFactory.createTitledBorder("Interface de jeu");
		Total.setBorder(border);
		Total.add(this.panel, BorderLayout.WEST);
		Informations.add(ecriture, BorderLayout.WEST);
		Informations.add(barre_vie, BorderLayout.CENTER);
		Informations.add(vide2);
		Informations.add(pointA, BorderLayout.SOUTH);
		Informations.add(po,BorderLayout.SOUTH);
		Informations.add(vide);
		Informations.add(control, BorderLayout.SOUTH);
		Informations.add(control2, BorderLayout.SOUTH);
		Informations.add(vide1);
		Informations.add(boussole);
		Informations.add(boussole1);




		Informations.setBackground(Color.LIGHT_GRAY);



		Total.add(Informations);
		f.setContentPane(Total);
		f.pack();
		f.setVisible(true);
		f.getContentPane().setFocusable(true);
		f.getContentPane().requestFocus();







		KeyListener kl = new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyPressed(KeyEvent e) {




				if (e.getKeyChar() == 'q' || e.getKeyChar() == 'z' || e.getKeyChar() == 'd' || e.getKeyChar() == 's') {
					Informations.removeAll();
					Informations.repaint();





					int vie = dessin.jeu.getPj().getVie();
					int attaque = dessin.jeu.getPj().getDegat();
					int portee = dessin.jeu.getPj().getPortee();
					int posx = dessin.jeu.getPj().getPosX();
					int posy = dessin.jeu.getPj().getPosY();
					barre_vie.setValue(vie);


					ecriture.setText("Points de vie : " + vie);

					pointA.setText("Points d'attaque : " + attaque);

					po.setText("Portee : " + portee);

					vide.setText("                    ");

					vide2.setText("                                                        ");

					vide1.setText("                                                        ");

					boussole.setText("Boussole : " + " Position en x : " + posx );

					boussole1.setText(" Position en y : " + posy);

					Total.setBorder(border);

					Informations.add(ecriture, BorderLayout.WEST);
					Informations.add(barre_vie, BorderLayout.CENTER);
					Informations.add(vide2);
					Informations.add(pointA, BorderLayout.SOUTH);
					Informations.add(po,BorderLayout.SOUTH);
					Informations.add(vide);
					Informations.add(control, BorderLayout.SOUTH);
					Informations.add(control2, BorderLayout.SOUTH);
					Informations.add(vide1);
					Informations.add(boussole);
					Informations.add(boussole1);
					Informations.repaint();
					Total.add(Informations);
					Total.revalidate();
					Total.repaint();
				}
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub

			}

		};
		Total.addKeyListener(kl);

	}





	/**
	 * retourne le controleur de l'affichage construit
	 * @return
	 */
	public Controleur getControleur() {
		return controleur;
	}

	/**
	 * demande la mise a jour du dessin
	 */
	public void dessiner() {
		this.panel.dessinerJeu();
	}

}

