package moteurJeu;



import java.awt.BorderLayout;
import java.awt.Color;

import javafx.scene.layout.Border;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.SwingUtilities;
import javax.swing.border.TitledBorder;

import personnage.Barre_de_vie;


/**
 * cree une interface graphique avec son controleur et son afficheur
 * @author Graou
 *
 */
public class InterfaceGraphique  {

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
	 * @param afficheurUtil l'afficheur a utiliser dans le moteur
	 * 
	 */
	public InterfaceGraphique(DessinJeu afficheurUtil,int x,int y)
	{

		JFrame f=new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	    final JProgressBar barre_vie;
		int MINIMUM=0;
		int MAXIMUM=100;
		final int vie;
		vie = 75;
		
		
		
		 // Créer un objet de la Barre de progression
	     barre_vie = new JProgressBar();
	     barre_vie.setBackground(Color.BLACK);
	     barre_vie.setForeground(Color.GREEN);
	     if(vie <= 20) {
	    	 barre_vie.setForeground(Color.RED);
	     }
	 
	     // Définir la valeur initiale de la barre de progression
	     barre_vie.setMinimum(MINIMUM);
	     // Définir la valeur maximale de la barre de progression
	     barre_vie.setMaximum(MAXIMUM);
	     
	     try
	      {
	         SwingUtilities.invokeLater(new Runnable( ) {
	             public void run( ) {
	            		 barre_vie.setValue(vie); 
	             }
	         });
	         Thread.sleep(1000);
	       } catch (InterruptedException e) {;}
	     
		
		JPanel Jambono = new JPanel();
		
		JPanel Tchoupi = new JPanel();
		Tchoupi.setLayout(new BorderLayout());
		
		JLabel ecriture = new JLabel();
		ecriture.setText("Points de vie");
		
		this.panel=new PanelDessin(x, y,afficheurUtil);
		Controleur controlleurGraph=new Controleur();
		this.controleur=controlleurGraph;
		Jambono.addKeyListener(controlleurGraph);
		TitledBorder border = BorderFactory.createTitledBorder("Interface de jeu");
		Jambono.setBorder(border);
		Jambono.add(this.panel, BorderLayout.WEST);
		Tchoupi.add(ecriture, BorderLayout.NORTH);
		Tchoupi.add(barre_vie, BorderLayout.CENTER);
		Jambono.add(Tchoupi);
		f.setContentPane(Jambono);
		f.pack();
		f.setVisible(true);
		f.getContentPane().setFocusable(true);
		f.getContentPane().requestFocus();
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
