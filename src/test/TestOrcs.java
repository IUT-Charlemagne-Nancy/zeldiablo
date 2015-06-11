package test;

import static org.junit.Assert.assertEquals;
import moteurJeu.Commande;
import jeu.MonJeu;
import personnage.Ghost;
import personnage.Orcs;

public class TestOrcs {

	/**
	 * Test qui verifie le constructeur de Orcs
	 */
	@org.junit.Test
	public void test_Constructeur_Orc(){
		MonJeu j = new MonJeu(1);
		Orcs o = new Orcs(5,5,j);
		assertEquals("l'orc doit avoir 50 de vie",50,o.getVie() );
		assertEquals("l'orc doit avoir 1 de portee",1,o.getPortee());
		assertEquals("l'orc doit avoir 5 de degat",5,o.getAttaque());
	}
	/**
	 * Test qui vérifie le déplacement d'un orc vers le bas
	 */
	@org.junit.Test
	public void test_Deplacement_Orcs_1(){
		MonJeu j = new MonJeu(1);
		Orcs o = new Orcs(2,2,j);
		Commande c = new Commande();
		c.bas=true;
		o.seDeplacer(c);
		assertEquals("l'orc doit etre en position x = 2", 2, o.getPosX());
		assertEquals("l'orc doit etre en position y = 3", 3, o.getPosY());
	}
	/**
	 * Test qui vérifie le déplacement d'un orc vers le haut
	 */
	@org.junit.Test
	public void test_Deplacement_Orcs_2(){
		MonJeu j = new MonJeu(1);
		Orcs o = new Orcs(5,6,j);
		Commande c = new Commande();
		c.haut=true;
		o.seDeplacer(c);
		assertEquals("l'orc doit etre en position x = 5", 5, o.getPosX());
		assertEquals("l'orc doit etre en position y = 5", 5, o.getPosY());
	}
	/**
	 * Test qui vérifie le déplacement d'un orc vers la droite
	 */
	@org.junit.Test
	public void test_Deplacement_Orcs_3(){
		MonJeu j = new MonJeu(1);
		Orcs o = new Orcs(2,2,j);
		Commande c = new Commande();
		c.droite=true;
		o.seDeplacer(c);
		assertEquals("l'orc doit etre en position x = 3", 3, o.getPosX());
		assertEquals("l'orc doit etre en position y = 2", 2, o.getPosY());
	}
	/**
	 * Test qui vérifie le déplacement d'un orc vers la gauche
	 */
	@org.junit.Test
	public void test_Deplacement_Orcs_4(){
		MonJeu j = new MonJeu(1);
		Orcs o = new Orcs(8,2,j);
		Commande c = new Commande();
		c.gauche=true;
		o.seDeplacer(c);
		assertEquals("l'orc doit etre en position x = 7", 7, o.getPosX());
		assertEquals("l'orc doit etre en position y = 2", 2, o.getPosY());
	}
	/**
	 * Test qui vérifie le déplacement d'un orc en haut à droite
	 */
	@org.junit.Test
	public void test_Deplacement_Orcs_5(){
		MonJeu j = new MonJeu(1);
		Orcs o = new Orcs(17,6,j);
		Commande c = new Commande();
		c.haut=true;
		c.droite=true;
		o.seDeplacer(c);
		assertEquals("l'orc doit etre en position x = 18", 18, o.getPosX());
		assertEquals("l'orc doit etre en position y = 5", 5, o.getPosY());
	}
	/**
	 * Test qui vérifie le déplacement d'un orc en haut à gauche
	 */
	@org.junit.Test
	public void test_Deplacement_Orcs_6(){
		MonJeu j = new MonJeu(1);
		Orcs o = new Orcs(18,10,j);
		Commande c = new Commande();
		c.gauche=true;
		c.haut=true;
		o.seDeplacer(c);
		assertEquals("l'orc doit etre en position x = 17", 17, o.getPosX());
		assertEquals("l'orc doit etre en position y = 9", 9, o.getPosY());
	}
	/**
	 * Test qui vérifie le déplacement d'un orc en bas à droite
	 */
	@org.junit.Test
	public void test_Deplacement_Orcs_7(){
		MonJeu j = new MonJeu(1);
		Orcs o = new Orcs(2,2,j);
		Commande c = new Commande();
		c.bas=true;
		c.droite=true;
		o.seDeplacer(c);
		assertEquals("l'orc doit etre en position x = 3", 3, o.getPosX());
		assertEquals("l'orc doit etre en position y = 3", 3, o.getPosY());
	}
	/**
	 * Test qui vérifie le déplacement d'un orc en bas à gauche
	 */
	@org.junit.Test
	public void test_Deplacement_Orcs_8(){
		MonJeu j = new MonJeu(1);
		Orcs o = new Orcs(8,2,j);
		Commande c = new Commande();
		c.bas=true;
		c.gauche=true;
		o.seDeplacer(c);
		assertEquals("l'orc doit etre en position x = 7", 7, o.getPosX());
		assertEquals("l'orc doit etre en position y = 3", 3, o.getPosY());
	}
	/**
	 * Test qui vérifie qu'un orc ne peut pas se déplacer dans un mur
	 */
	@org.junit.Test
	public void test_Deplacement_Orcs_Mur(){
		MonJeu j = new MonJeu(1);
		Orcs o = new Orcs(2,1,j);
		Commande c = new Commande();
		c.haut=true;
		o.seDeplacer(c);
		assertEquals("l'orc doit etre en position x = 2", 2, o.getPosX());
		assertEquals("l'orc doit etre en position y = 1", 1, o.getPosY());
	}
	/**
	 * test qui vérifie qu'un orc ne peut pas se déplacer sur la case du héros
	 */
	@org.junit.Test
	public void test_Deplacement_Orcs_Heros(){
		MonJeu j = new MonJeu(1);
		Orcs o = new Orcs(1,2,j);
		Commande c = new Commande();
		c.haut=true;
		o.seDeplacer(c);
		assertEquals("l'orc doit etre en position x = 1", 1, o.getPosX());
		assertEquals("l'orc doit etre en position y = 2", 2, o.getPosY());
	}
	/**
	 * Test qui vérifie qu'un orc ne peut pas se déplacer sur la case d'un autre orc
	 */
	@org.junit.Test
	public void test_Deplacement_Orcs_Orcs(){
		MonJeu j = new MonJeu(1);
		Orcs o1 = new Orcs(2,2,j);
		Orcs o2 = new Orcs(2,3,j);
		j.ajouterMonstre(o1);
		j.ajouterMonstre(o2);
		Commande c = new Commande();
		c.haut=true;
		o2.seDeplacer(c);
		assertEquals("l'orc doit etre en position x = 2", 2, o2.getPosX());
		assertEquals("l'orc doit etre en position y = 3", 3, o2.getPosY());
	}
	/**
	 * Test qui vérifie qu'un orc peut se déplacer sur la case d'un fantome
	 */
	@org.junit.Test
	public void test_Deplacement_Orcs_Fantome(){
		MonJeu j = new MonJeu(1);
		Ghost g1 = new Ghost(5,1,j);
		Orcs o = new Orcs(5,1,j);
		j.ajouterMonstre(g1);
		j.ajouterMonstre(o);
		Commande c = new Commande();
		c.haut=true;
		o.seDeplacer(c);
		assertEquals("le fantome doit etre en position x = 5", 5, o.getPosX());
		assertEquals("le fantome doit etre en position y = 1", 1, o.getPosY());
	}
	/**
	 * Test qui vérifie qu'un orc ne peut pas entrer dans la zone interdite
	 */
	@org.junit.Test
	public void test_Deplacement_Sanctuaire(){
		MonJeu j = new MonJeu(1);
		Orcs o = new Orcs(6,1,j);
		j.ajouterMonstre(o);
		Commande c = new Commande();
		c.gauche = true;
		o.seDeplacer(c);
		o.seDeplacer(c);
		assertEquals("l'orc doit être en position x = 6", 6, o.getPosX());
		assertEquals("l'orc doit être en position y = 1", 1, o.getPosY());
	}
	/**
	 * Test qui vérifie qu'un orc peut attaquer un heros
	 */
	@org.junit.Test
	public void test_attaque_Heros(){
		MonJeu j = new MonJeu(1);
		Orcs o = new Orcs(2,2,j);
		j.ajouterMonstre(o);
		Commande c = new Commande();
		c.attaque = true;
		o.attaquer(c);
		assertEquals("le fantome doit avoir 95pv",95 ,j.getPj().getVie());
	}
	/**
	 * Test qui vérifie qu'un orc ne peut pas attaquer un autre orc
	 */
	@org.junit.Test
	public void test_attaque_Orcs(){
		MonJeu j = new MonJeu(1);
		Orcs o = new Orcs(2,2,j);
		Orcs g = new Orcs(1,2,j);
		j.ajouterMonstre(g);
		j.ajouterMonstre(o);
		Commande c = new Commande();
		c.attaque = true;
		g.attaquer(c);
		assertEquals("l'orc doit avoir 50pv",50 ,o.getVie());
	}	
	/**
	 * Test qui vérifie qu'un orc ne peut pas attaquer un fantome
	 */
	@org.junit.Test
	public void test_attaque_Fantome(){
		MonJeu j = new MonJeu(1);
		Orcs o = new Orcs(2,2,j);
		Ghost g = new Ghost(1,2,j);
		j.ajouterMonstre(g);
		j.ajouterMonstre(o);
		Commande c = new Commande();
		c.attaque = true;
		o.attaquer(c);
		assertEquals("le fantome doit avoir 30pv",30 ,g.getVie());
	}
/**
 * Test qui vérifie qu'un orc ne peut pas attaquer un heros s'il est mort
 */
	@org.junit.Test
	public void test_attaquer_etreMort(){
		MonJeu j = new MonJeu(1);
		Orcs o = new Orcs(2,2,j);
		j.ajouterMonstre(o);
		o.setPosX(2);
		o.subirDegat(50);
		Commande c = new Commande();
		c.attaque=true;
		o.attaquer(c);
		assertEquals("le heros doit avoir 100pdv", 100,j.getPj().getVie());
	}
	/**
	 * Test qui vérifie qu'un orc ne peut pas se deplacer s'il est mort
	 */
	@org.junit.Test
	public void test_Deplacer_etreMort(){
		MonJeu j = new MonJeu(1);
		Orcs o = new Orcs(2,2,j);
		j.ajouterMonstre(o);
		o.subirDegat(50);
		Commande c = new Commande();
		c.gauche=true;
		o.seDeplacer(c);
		assertEquals("l'orc ne doit pas bouger", 2,o.getPosX());
		assertEquals("l'orc ne doit pas bouger", 2,o.getPosY());
	}
}
