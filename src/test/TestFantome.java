package test;

import static org.junit.Assert.assertEquals;
import jeu.MonJeu;
import moteurJeu.Commande;
import personnage.Ghost;
import personnage.Heros;
import personnage.Orcs;

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
	@org.junit.Test
	public void test_attaque_Heros(){
		MonJeu j = new MonJeu();
		Heros h = new Heros(j);
		Ghost g = new Ghost(j);
		j.ajouterMonstre(g);
		g.setPosX(2);
		g.setPosY(2);
		Commande c = new Commande();
		c.attaque = true;
		g.attaquer(c);
		assertEquals("le heros doit avoir 98pv",98 ,j.getPj().getVie());
	}
	@org.junit.Test
	public void test_attaque_Fantome(){
		MonJeu j = new MonJeu();
		Ghost h = new Ghost(j);
		Ghost g = new Ghost(j);
		j.ajouterMonstre(g);
		j.ajouterMonstre(h);
		g.setPosX(2);
		g.setPosY(2);
		h.setPosX(1);
		h.setPosY(2);
		Commande c = new Commande();
		c.attaque = true;
		g.attaquer(c);
		assertEquals("le fantome doit avoir 30pv",30 ,h.getVie());
	}
	@org.junit.Test
	public void test_attaque_Orcs(){
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
		g.attaquer(c);
		assertEquals("l'orc doit avoir 50pv",50 ,o.getVie());
	}
	@org.junit.Test
	public void test_Deplacement_Fantome_Fantome(){
		MonJeu j = new MonJeu();
		Ghost g1 = new Ghost(j);
		Ghost g2 = new Ghost(j);
		j.ajouterMonstre(g1);
		j.ajouterMonstre(g2);
		g1.setPosX(2);
		g1.setPosY(2);
		g2.setPosX(2);
		g2.setPosY(3);
		Commande c = new Commande();
		c.haut=true;
		g2.seDeplacer(c);
		assertEquals("le fantome doit etre en position x = 2", 2, g2.getPosX());
		assertEquals("le fantome doit etre en position y = 2", 2, g2.getPosY());
	}
	@org.junit.Test
	public void test_Deplacement_Fantome_Orcs(){
		MonJeu j = new MonJeu();
		Ghost g1 = new Ghost(j);
		Orcs o = new Orcs(j);
		j.ajouterMonstre(g1);
		j.ajouterMonstre(o);
		o.setPosX(2);
		o.setPosY(2);
		g1.setPosX(2);
		g1.setPosY(3);
		Commande c = new Commande();
		c.haut=true;
		g1.seDeplacer(c);
		assertEquals("le fantome doit etre en position x = 2", 2, g1.getPosX());
		assertEquals("le fantome doit etre en position y = 2", 2, g1.getPosY());
	}
	@org.junit.Test
	public void test_attaquer_etreMort(){
		MonJeu j = new MonJeu();
		Ghost g = new Ghost(j);
		Heros h = new Heros (j);
		j.ajouterMonstre(g);
		g.setPosX(2);
		g.setPosY(2);
		g.subirDegat(30);
		Commande c = new Commande();
		c.attaque=true;
		g.attaquer(c);
		assertEquals("le heros doit avoir 100pdv", 100,j.getPj().getVie());
	}
}
