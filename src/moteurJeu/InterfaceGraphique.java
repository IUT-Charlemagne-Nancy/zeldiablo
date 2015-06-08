package moteurJeu;



import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JFrame;
import javax.swing.JProgressBar;
import javax.swing.SwingUtilities;

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
		
		
		JProgressBar barre_vie;
		int MINIMUM=0;
		int MAXIMUM=100;
		int vie;
		vie = 100;
		
		
		
		 // Créer un objet de la Barre de progression
	     barre_vie = new JProgressBar( );
	 
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
	         java.lang.Thread.sleep(100);
	       } catch (InterruptedException e) {;}
	     
	     
	 
		
		f.setLayout(new BorderLayout());
		
		this.panel=new PanelDessin(x, y,afficheurUtil);
		Controleur controlleurGraph=new Controleur();
		this.controleur=controlleurGraph;
		
		this.panel.addKeyListener(controlleurGraph);	
		f.add(this.panel, BorderLayout.NORTH);
		f.add(barre_vie, BorderLayout.EAST);
		
		
		//recuperation du focus
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
