package moteurJeu;



import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.SwingUtilities;
import javax.swing.border.TitledBorder;
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
		vie = 100;
		
		
		
		 // Créer un objet de la Barre de progression
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
	     
		
		JPanel Total = new JPanel();
		JPanel Informations = new JPanel();
		Total.setPreferredSize(new Dimension(600,450));
	
		
		Total.setLayout(new BorderLayout());
		
		JLabel ecriture = new JLabel();
		ecriture.setText("Points de vie");
		
		JLabel pointA = new JLabel();
		pointA.setText("Points d'attaque");
		
		this.panel=new PanelDessin(x, y,afficheurUtil);
		
		Controleur controlleurGraph=new Controleur();
		this.controleur=controlleurGraph;
		Total.addKeyListener(controlleurGraph);
		
		TitledBorder border = BorderFactory.createTitledBorder("Interface de jeu");
		Total.setBorder(border);
		Total.add(this.panel, BorderLayout.WEST);
		Informations.add(ecriture, BorderLayout.WEST);
		Informations.add(barre_vie, BorderLayout.CENTER);
		Informations.add(pointA, BorderLayout.SOUTH);
		Total.add(Informations);
		
		f.setContentPane(Total);
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
