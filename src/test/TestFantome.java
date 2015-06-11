package test;

import static org.junit.Assert.assertEquals;
import jeu.MonJeu;
import moteurJeu.Commande;
import personnage.Ghost;
import personnage.Orcs;

public class TestFantome {

	/**
	 * Test qui vérifie le constructeur de Ghost
	 */
	@org.junit.Test
	public void test_Constructeur_Fantome(){
		MonJeu j = new MonJeu(1);
		Ghost g = new Ghost(1,1,j);
		assertEquals("le fantome doit avoir 30 de vie",30,g.getVie() );
		assertEquals("le fantome doit avoir 1 de portee",1,g.getPortee());
		assertEquals("le fantome doit avoir 2 de degat",2,g.getAttaque());
	}
	
	/**
	 * Test qui vérifie un déplacement du fantome vers le haut
	 */
	@org.junit.Test
	public void test_Deplacement_Fantome_1(){
		MonJeu j = new MonJeu(1);
		Ghost g = new Ghost(7,2,j);
		Commande c = new Commande();
		c.haut=true;
		g.seDeplacer(c);
		assertEquals("le fantome doit etre en position x = 7", 7, g.getPosX());
		assertEquals("le fantome doit etre en position y = 1", 1, g.getPosY());
	}
	/**
	 * Test qui vérifie un déplacement du fantome vers le bas
	 */
	@org.junit.Test
	public void test_Deplacement_Fantome_2(){
		MonJeu j = new MonJeu(1);
		Ghost g = new Ghost(2,2,j);
		Commande c = new Commande();
		c.bas=true;
		g.seDeplacer(c);
		assertEquals("le fantome doit etre en position x = 2", 2, g.getPosX());
		assertEquals("le fantome doit etre en position y = 3", 3, g.getPosY());
	}
	/**
	 * Test qui vérifie un déplacement du fantome vers la droite
	 */
	@org.junit.Test
	public void test_Deplacement_Fantome_3(){
		MonJeu j = new MonJeu(1);
		Ghost g = new Ghost(2,2,j);
		Commande c = new Commande();
		c.droite=true;
		g.seDeplacer(c);
		assertEquals("le fantome doit etre en position x = 3", 3, g.getPosX());
		assertEquals("le fantome doit etre en position y = 2", 2, g.getPosY());
	}
	/**
	 * Test qui vérifie un déplacement du fantome vers la gauche
	 */
	@org.junit.Test
	public void test_Deplacement_Fantome_4(){
		MonJeu j = new MonJeu(1);
		Ghost g = new Ghost(8,2,j);
		Commande c = new Commande();
		c.gauche=true;
		g.seDeplacer(c);
		assertEquals("le fantome doit etre en position x = 7", 7, g.getPosX());
		assertEquals("le fantome doit etre en position y = 2", 2, g.getPosY());
	}
	/**
	 * Test qui vérifie un déplacement du fantome en haut à droite
	 */
	@org.junit.Test
	public void test_Deplacement_Fantome_5(){
		MonJeu j = new MonJeu(1);
		Ghost g = new Ghost(5,3,j);
		Commande c = new Commande();
		c.haut=true;
		c.droite=true;
		g.seDeplacer(c);
		assertEquals("le fantome doit etre en position x = 6", 6, g.getPosX());
		assertEquals("le fantome doit etre en position y = 2", 2, g.getPosY());
	}
	/**
	 * Test qui vérifie un déplacement du fantome en haut à gauche
	 */
	@org.junit.Test
	public void test_Deplacement_Fantome_6(){
		MonJeu j = new MonJeu(1);
		Ghost g = new Ghost(8,3,j);
		Commande c = new Commande();
		c.haut=true;
		c.gauche=true;
		g.seDeplacer(c);
		assertEquals("le fantome doit etre en position x = 7", 7, g.getPosX());
		assertEquals("le fantome doit etre en position y = 2", 2, g.getPosY());
	}
	/**
	 * Test qui vérifie un déplacement du fantome en bas à gauche
	 */
	@org.junit.Test
	public void test_Deplacement_Fantome_7(){
		MonJeu j = new MonJeu(1);
		Ghost g = new Ghost(7,2,j);
		Commande c = new Commande();
		c.bas=true;
		c.gauche=true;
		g.seDeplacer(c);
		assertEquals("le fantome doit etre en position x = 6", 6, g.getPosX());
		assertEquals("le fantome doit etre en position y = 3", 3, g.getPosY());
	}
	/**
	 * Test qui vérifie un déplacement du fantome en bas à droite
	 */
	@org.junit.Test
	public void test_Deplacement_Fantome_8(){
		MonJeu j = new MonJeu(1);
		Ghost g = new Ghost(2,2,j);
		Commande c = new Commande();
		c.bas=true;
		c.droite=true;
		g.seDeplacer(c);
		assertEquals("le fantome doit etre en position x = 3", 3, g.getPosX());
		assertEquals("le fantome doit etre en position y = 3", 3, g.getPosY());
	}
	/**
	 * Test qui vérifie qu'un fantome attaque bien le heros
	 */
	@org.junit.Test
	public void test_attaque_Heros(){
		MonJeu j = new MonJeu(1);
		Ghost g = new Ghost(2,2,j);
		j.ajouterMonstre(g);
		Commande c = new Commande();
		c.attaque = true;
		g.attaquer(c);
		assertEquals("le heros doit avoir 98pv",98 ,j.getPj().getVie());
	}
	/**
	 * Test qui verifie qu'un fantome n'attaque pas un autre fantome
	 */
	@org.junit.Test
	public void test_attaque_Fantome(){
		MonJeu j = new MonJeu(1);
		Ghost h = new Ghost(1,2,j);
		Ghost g = new Ghost(2,2,j);
		j.ajouterMonstre(g);
		j.ajouterMonstre(h);
		Commande c = new Commande();
		c.attaque = true;
		g.attaquer(c);
		assertEquals("le fantome doit avoir 30pv",30 ,h.getVie());
	}
	/**
	 * Test qui vérifie qu'un fantome n'attaque pas un orc
	 */
	@org.junit.Test
	public void test_attaque_Orcs(){
		MonJeu j = new MonJeu(1);
		Orcs o = new Orcs(1,2,j);
		Ghost g = new Ghost(1,2,j);
		j.ajouterMonstre(g);
		j.ajouterMonstre(o);
		Commande c = new Commande();
		c.attaque = true;
		g.attaquer(c);
		assertEquals("l'orc doit avoir 50pv",50 ,o.getVie());
	}
	/**
	 * Test qui vérifie qu'un fantome peut se déplacer sur la case d'un autre fantome
	 */
	@org.junit.Test
	public void test_Deplacement_Fantome_Fantome(){
		MonJeu j = new MonJeu(1);
		Ghost g1 = new Ghost(6,2,j);
		Ghost g2 = new Ghost(6,3,j);
		j.ajouterMonstre(g1);
		j.ajouterMonstre(g2);
		Commande c = new Commande();
		c.haut=true;
		g2.seDeplacer(c);
		assertEquals("le fantome doit etre en position x = 6", 6, g2.getPosX());
		assertEquals("le fantome doit etre en position y = 2", 2, g2.getPosY());
	}
	/**
	 * Test qui vérifie qu'un fantome peut aller sur la case d'un orc
	 */
	@org.junit.Test
	public void test_Deplacement_Fantome_Orcs(){
		MonJeu j = new MonJeu(1);
		Ghost g1 = new Ghost(6,3,j);
		Orcs o = new Orcs(6,2,j);
		j.ajouterMonstre(g1);
		j.ajouterMonstre(o);
		Commande c = new Commande();
		c.haut=true;
		g1.seDeplacer(c);
		assertEquals("le fantome doit etre en position x = 6", 6, g1.getPosX());
		assertEquals("le fantome doit etre en position y = 2", 2, g1.getPosY());
	}
	/**
	 * Test qui vérifie qu'un fantome peut aller sur la case du heros
	 */
	@org.junit.Test
	public void test_Deplacement_Fantome_Heros(){
		MonJeu j = new MonJeu(1);
		Ghost g1 = new Ghost(7,1,j);
		j.ajouterMonstre(g1);
		Commande c1 = new Commande();
		Commande c2 = new Commande();
		c1.droite=true;
		c2.gauche=true;
		j.getPj().seDeplacer(c1);
		j.getPj().seDeplacer(c1);
		j.getPj().seDeplacer(c1);
		j.getPj().seDeplacer(c1);
		j.getPj().seDeplacer(c1);
		g1.seDeplacer(c2);
		assertEquals("le fantome doit etre en position x = 6", 6, g1.getPosX());
		assertEquals("le fantome doit etre en position y = 1", 1, g1.getPosY());
	}
	/**
	 * Test qui verifie qu'un fantome ne peut pas aller en zone interdite
	 */
	@org.junit.Test
	public void test_Deplacement_Sanctuaire(){
		MonJeu j = new MonJeu(1);
		Ghost g = new Ghost(6,1,j);
		j.ajouterMonstre(g);
		Commande c = new Commande();
		c.gauche = true;
		g.seDeplacer(c);
		g.seDeplacer(c);
		assertEquals("le fantome doit être en position x = 5", 5, g.getPosX());
	}
	/**
	 * Test qui verifie qu'un fantome ne peut pas attaquer s'il est mort
	 */
	@org.junit.Test
	public void test_attaquer_etreMort(){
		MonJeu j = new MonJeu(1);
		Ghost g = new Ghost(2,2,j);
		j.ajouterMonstre(g);
		g.subirDegat(30);
		Commande c = new Commande();
		c.attaque=true;
		g.attaquer(c);
		assertEquals("le heros doit avoir 100pdv", 100,j.getPj().getVie());
	}
	/**
	 * Test qui vérifie qu'un fantome peut traverser un mur
	 */
	@org.junit.Test
	public void test_Deplacement_Mur(){
		MonJeu j = new MonJeu(1);
		Ghost g = new Ghost(7,1,j);
		j.ajouterMonstre(g);
		Commande c = new Commande();
		c.droite=true;
		for (int i=0;i<30;i++){
			g.seDeplacer(c);
		}
		assertEquals("le fantome doit traverser le mur", 24, g.getPosX());
	}
}
