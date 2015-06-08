package personnage;

	import java.awt.*;
	import java.awt.event.*;
	import javax.swing.*;
	 
	public class Barre_de_vie extends JPanel
	 {
	 
	  JProgressBar barre_vie;
	  static final int MINIMUM=0;
	  static final int MAXIMUM=100;
	  protected int vie;
	 
	  public Barre_de_vie( )
	  {
	 	 // Cr�er un objet de la Barre de progression
	     barre_vie = new JProgressBar( );
	 
	     // D�finir la valeur initiale de la barre de progression
	     barre_vie.setMinimum(MINIMUM);
	     // D�finir la valeur maximale de la barre de progression
	     barre_vie.setMaximum(MAXIMUM);
	 
	     // Cr�er un JPanel et ajouter la barre de progression dans le JPanel
	     JPanel pnl=new JPanel();
	     pnl.add(barre_vie);
	      try
	      {
	         SwingUtilities.invokeLater(new Runnable( ) {
	             public void run( ) {
	               updateBar(vie);
	             }
	         });
	         java.lang.Thread.sleep(100);
	       } catch (InterruptedException e) {;}
	     } 
	 
	  
	 
	  public void updateBar(int newValue)
	  {
	    barre_vie.setValue(newValue);
	  }
}

