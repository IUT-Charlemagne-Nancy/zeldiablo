package test;

import static org.junit.Assert.assertEquals;
import jeu.MonJeu;
import moteurJeu.Commande;
import personnage.Ghost;

public class TestFantome {

	@org.junit.Test
	public void test_Constructeur_Fantome(){
		MonJeu j = new MonJeu();
		Ghost g = new Ghost(j);
		assertEquals("le fantome doit avoir 30 de vie",30,g.getVie() );
		assertEquals("le fantome doit avoir 3 de portee",3,g.getPortee());
		assertEquals("le fantome doit avoir 2 de degat",2,g.getDegat());
	}
	

	@org.junit.Test
	public void test_Deplacement_Fantome_1(){
		MonJeu j = new MonJeu();
		Ghost g = new Ghost(j);
		g.setPosX(2);
		g.setPosY(2);
		Commande c = new Commande();
		c.haut=true;
		g.seDeplacer(c);
		assertEquals("le fantome doit etre en position x = 2", 2, g.getPosX());
		assertEquals("le fantome doit etre en position y = 1", 1, g.getPosY());
	}
	@org.junit.Test
	public void test_Deplacement_Fantome_2(){
		MonJeu j = new MonJeu();
		Ghost g = new Ghost(j);
		g.setPosX(2);
		g.setPosY(2);
		Commande c = new Commande();
		c.bas=true;
		g.seDeplacer(c);
		assertEquals("le fantome doit etre en position x = 2", 2, g.getPosX());
		assertEquals("le fantome doit etre en position y = 3", 3, g.getPosY());
	}
	@org.junit.Test
	public void test_Deplacement_Fantome_3(){
		MonJeu j = new MonJeu();
		Ghost g = new Ghost(j);
		g.setPosX(2);
		g.setPosY(2);
		Commande c = new Commande();
		c.droite=true;
		g.seDeplacer(c);
		assertEquals("le fantome doit etre en position x = 3", 3, g.getPosX());
		assertEquals("le fantome doit etre en position y = 2", 2, g.getPosY());
	}
	@org.junit.Test
	public void test_Deplacement_Fantome_4(){
		MonJeu j = new MonJeu();
		Ghost g = new Ghost(j);
		g.setPosX(2);
		g.setPosY(2);
		Commande c = new Commande();
		c.gauche=true;
		g.seDeplacer(c);
		assertEquals("le fantome doit etre en position x = 1", 1, g.getPosX());
		assertEquals("le fantome doit etre en position y = 2", 2, g.getPosY());
	}
	@org.junit.Test
	public void test_Deplacement_Fantome_5(){
		MonJeu j = new MonJeu();
		Ghost g = new Ghost(j);
		g.setPosX(2);
		g.setPosY(2);
		Commande c = new Commande();
		c.haut=true;
		c.droite=true;
		g.seDeplacer(c);
		assertEquals("le fantome doit etre en position x = 3", 3, g.getPosX());
		assertEquals("le fantome doit etre en position y = 1", 1, g.getPosY());
	}
	@org.junit.Test
	public void test_Deplacement_Fantome_6(){
		MonJeu j = new MonJeu();
		Ghost g = new Ghost(j);
		g.setPosX(3);
		g.setPosY(3);
		Commande c = new Commande();
		c.haut=true;
		c.gauche=true;
		g.seDeplacer(c);
		assertEquals("le fantome doit etre en position x = 2", 2, g.getPosX());
		assertEquals("le fantome doit etre en position y = 2", 2, g.getPosY());
	}
	@org.junit.Test
	public void test_Deplacement_Fantome_7(){
		MonJeu j = new MonJeu();
		Ghost g = new Ghost(j);
		g.setPosX(2);
		g.setPosY(2);
		Commande c = new Commande();
		c.bas=true;
		c.gauche=true;
		g.seDeplacer(c);
		assertEquals("le fantome doit etre en position x = 1", 1, g.getPosX());
		assertEquals("le fantome doit etre en position y = 3", 3, g.getPosY());
	}
	@org.junit.Test
	public void test_Deplacement_Fantome_8(){
		MonJeu j = new MonJeu();
		Ghost g = new Ghost(j);
		g.setPosX(2);
		g.setPosY(2);
		Commande c = new Commande();
		c.bas=true;
		c.droite=true;
		g.seDeplacer(c);
		assertEquals("le fantome doit etre en position x = 3", 3, g.getPosX());
		assertEquals("le fantome doit etre en position y = 3", 3, g.getPosY());
	}
}
