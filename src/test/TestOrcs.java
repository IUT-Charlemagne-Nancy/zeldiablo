package test;

import static org.junit.Assert.assertEquals;
import moteurJeu.Commande;
import jeu.MonJeu;
import personnage.Orcs;

public class TestOrcs {

	@org.junit.Test
	public void test_Constructeur_Orc(){
		MonJeu j = new MonJeu();
		Orcs o = new Orcs(j);
		assertEquals("l'orc doit avoir 50 de vie",50,o.getVie() );
		assertEquals("l'orc doit avoir 1 de portee",1,o.getPortee());
		assertEquals("l'orc doit avoir 5 de degat",5,o.getDegat());
	}
	@org.junit.Test
	public void test_Deplacement_Orcs_1(){
		MonJeu j = new MonJeu();
		Orcs o = new Orcs(j);
		o.setPosX(2);
		o.setPosY(2);
		Commande c = new Commande();
		c.bas=true;
		o.seDeplacer(c);
		assertEquals("l'orc doit etre en position x = 2", 2, o.getPosX());
		assertEquals("l'orc doit etre en position y = 3", 3, o.getPosY());
	}
	
	@org.junit.Test
	public void test_Deplacement_Orcs_2(){
		MonJeu j = new MonJeu();
		Orcs o = new Orcs(j);
		o.setPosX(2);
		o.setPosY(2);
		Commande c = new Commande();
		c.haut=true;
		o.seDeplacer(c);
		assertEquals("l'orc doit etre en position x = 2", 2, o.getPosX());
		assertEquals("l'orc doit etre en position y = 1", 1, o.getPosY());
	}
	
	@org.junit.Test
	public void test_Deplacement_Orcs_3(){
		MonJeu j = new MonJeu();
		Orcs o = new Orcs(j);
		o.setPosX(2);
		o.setPosY(2);
		Commande c = new Commande();
		c.droite=true;
		o.seDeplacer(c);
		assertEquals("l'orc doit etre en position x = 3", 3, o.getPosX());
		assertEquals("l'orc doit etre en position y = 2", 2, o.getPosY());
	}
	
	@org.junit.Test
	public void test_Deplacement_Orcs_4(){
		MonJeu j = new MonJeu();
		Orcs o = new Orcs(j);
		o.setPosX(2);
		o.setPosY(2);
		Commande c = new Commande();
		c.gauche=true;
		o.seDeplacer(c);
		assertEquals("l'orc doit etre en position x = 1", 1, o.getPosX());
		assertEquals("l'orc doit etre en position y = 2", 2, o.getPosY());
	}
	@org.junit.Test
	public void test_Deplacement_Orcs_5(){
		MonJeu j = new MonJeu();
		Orcs o = new Orcs(j);
		o.setPosX(2);
		o.setPosY(2);
		Commande c = new Commande();
		c.haut=true;
		c.droite=true;
		o.seDeplacer(c);
		assertEquals("l'orc doit etre en position x = 3", 3, o.getPosX());
		assertEquals("l'orc doit etre en position y = 1", 1, o.getPosY());
	}
	@org.junit.Test
	public void test_Deplacement_Orcs_6(){
		MonJeu j = new MonJeu();
		Orcs o = new Orcs(j);
		o.setPosX(3);
		o.setPosY(3);
		Commande c = new Commande();
		c.gauche=true;
		c.haut=true;
		o.seDeplacer(c);
		assertEquals("l'orc doit etre en position x = 2", 2, o.getPosX());
		assertEquals("l'orc doit etre en position y = 2", 2 , o.getPosY());
	}
	@org.junit.Test
	public void test_Deplacement_Orcs_7(){
		MonJeu j = new MonJeu();
		Orcs o = new Orcs(j);
		o.setPosX(2);
		o.setPosY(2);
		Commande c = new Commande();
		c.bas=true;
		c.droite=true;
		o.seDeplacer(c);
		assertEquals("l'orc doit etre en position x = 3", 3, o.getPosX());
		assertEquals("l'orc doit etre en position y = 3", 3, o.getPosY());
	}
	@org.junit.Test
	public void test_Deplacement_Orcs_8(){
		MonJeu j = new MonJeu();
		Orcs o = new Orcs(j);
		o.setPosX(2);
		o.setPosY(2);
		Commande c = new Commande();
		c.bas=true;
		c.gauche=true;
		o.seDeplacer(c);
		assertEquals("l'orc doit etre en position x = 1", 1, o.getPosX());
		assertEquals("l'orc doit etre en position y = 3", 3, o.getPosY());
	}
	@org.junit.Test
	public void test_Deplacement_Orcs_Mur(){
		MonJeu j = new MonJeu();
		Orcs o = new Orcs(j);
		o.setPosX(2);
		o.setPosY(1);
		Commande c = new Commande();
		c.haut=true;
		o.seDeplacer(c);
		assertEquals("l'orc doit etre en position x = 2", 2, o.getPosX());
		assertEquals("l'orc doit etre en position y = 1", 1, o.getPosY());
	}
	@org.junit.Test
	public void test_Deplacement_Orcs_Heros(){
		MonJeu j = new MonJeu();
		Orcs o = new Orcs(j);
		o.setPosX(1);
		o.setPosY(2);
		Commande c = new Commande();
		c.haut=true;
		o.seDeplacer(c);
		assertEquals("l'orc doit etre en position x = 1", 1, o.getPosX());
		assertEquals("l'orc doit etre en position y = 2", 2, o.getPosY());
	}
	/**@org.junit.Test
	public void test_Deplacement_Orcs_Orcs(){
		MonJeu j = new MonJeu();
		Orcs o1 = new Orcs(j);
		Orcs o2 = new Orcs(j);
		o1.setPosX(2);
		o1.setPosY(2);
		o2.setPosX(2);
		o2.setPosY(3);
		Commande c = new Commande();
		c.haut=true;
		o2.seDeplacer(c);
		assertEquals("l'orc doit etre en position x = 2", 2, o2.getPosX());
		assertEquals("l'orc doit etre en position y = 3", 3, o2.getPosY());
	}*/
}
