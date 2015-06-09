package test;

import static org.junit.Assert.assertEquals;
import moteurJeu.Commande;
import jeu.MonJeu;
import personnage.Ghost;
import personnage.Heros;
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
		o.setPosX(8);
		o.setPosY(2);
		Commande c = new Commande();
		c.gauche=true;
		o.seDeplacer(c);
		assertEquals("l'orc doit etre en position x = 7", 7, o.getPosX());
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
		o.setPosX(8);
		o.setPosY(7);
		Commande c = new Commande();
		c.gauche=true;
		c.haut=true;
		o.seDeplacer(c);
		assertEquals("l'orc doit etre en position x = 7", 7, o.getPosX());
		assertEquals("l'orc doit etre en position y = 6", 6, o.getPosY());
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
		o.setPosX(8);
		o.setPosY(2);
		Commande c = new Commande();
		c.bas=true;
		c.gauche=true;
		o.seDeplacer(c);
		assertEquals("l'orc doit etre en position x = 7", 7, o.getPosX());
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
	@org.junit.Test
	public void test_attaque_Heros(){
		MonJeu j = new MonJeu();
		Heros h = new Heros(j);
		Orcs o = new Orcs(j);
		j.ajouterMonstre(o);
		o.setPosX(2);
		o.setPosY(2);
		Commande c = new Commande();
		c.attaque = true;
		o.attaquer(c);
		assertEquals("le fantome doit avoir 95pv",95 ,j.getPj().getVie());
	}
	@org.junit.Test
	public void test_attaque_Orcs(){
		MonJeu j = new MonJeu();
		Orcs o = new Orcs(j);
		Orcs g = new Orcs(j);
		j.ajouterMonstre(g);
		j.ajouterMonstre(o);
		g.setPosX(2);
		g.setPosY(2);
		o.setPosX(1);
		o.setPosY(2);
		Commande c = new Commande();
		c.attaque = true;
		g.attaquer(c);
		assertEquals("l'orc doit avoir 50pv",50 ,o.getVie());
	}	
	@org.junit.Test
	public void test_attaque_Fantome(){
		MonJeu j = new MonJeu();
		Orcs o = new Orcs(j);
		Ghost g = new Ghost(j);
		j.ajouterMonstre(g);
		j.ajouterMonstre(o);
		g.setPosX(2);
		g.setPosY(2);
		o.setPosX(1);
		o.setPosY(2);
		Commande c = new Commande();
		c.attaque = true;
		o.attaquer(c);
		assertEquals("le fantome doit avoir 30pv",30 ,g.getVie());
	}
	
	@org.junit.Test
	public void test_Deplacement_Orcs_Orcs(){
		MonJeu j = new MonJeu();
		Orcs o1 = new Orcs(j);
		Orcs o2 = new Orcs(j);
		j.ajouterMonstre(o1);
		j.ajouterMonstre(o2);
		o1.setPosX(2);
		o1.setPosY(2);
		o2.setPosX(2);
		o2.setPosY(3);
		Commande c = new Commande();
		c.haut=true;
		o2.seDeplacer(c);
		assertEquals("l'orc doit etre en position x = 2", 2, o2.getPosX());
		assertEquals("l'orc doit etre en position y = 3", 3, o2.getPosY());
	}
	@org.junit.Test
	public void test_Deplacement_Orcs_Fantome(){
		MonJeu j = new MonJeu();
		Ghost g1 = new Ghost(j);
		Orcs o = new Orcs(j);
		j.ajouterMonstre(g1);
		j.ajouterMonstre(o);
		g1.setPosX(2);
		g1.setPosY(2);
		o.setPosX(2);
		o.setPosY(3);
		Commande c = new Commande();
		c.haut=true;
		o.seDeplacer(c);
		assertEquals("le fantome doit etre en position x = 2", 2, o.getPosX());
		assertEquals("le fantome doit etre en position y = 2", 2, o.getPosY());
	}
	@org.junit.Test
	public void test_attaquer_etreMort(){
		MonJeu j = new MonJeu();
		Orcs o = new Orcs(j);
		Heros h = new Heros (j);
		j.ajouterMonstre(o);
		o.setPosX(2);
		o.setPosY(2);
		o.subirDegat(50);
		Commande c = new Commande();
		c.attaque=true;
		o.attaquer(c);
		assertEquals("le heros doit avoir 100pdv", 100,j.getPj().getVie());
	}
}
