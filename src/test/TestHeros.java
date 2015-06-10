package test;

import static org.junit.Assert.assertEquals;
import jeu.MonJeu;
import moteurJeu.Commande;
import personnage.Ghost;
import personnage.Heros;
import personnage.Orcs;

public class TestHeros {

	/**
	 * Test qui vérifie le constructeur de Heros
	 */
	@org.junit.Test
	public void test_Heros_Constructeur() {
		MonJeu j = new MonJeu(1);
		Heros h = new Heros(j);
		assertEquals("Le heros doit se trouver en x = 1",1,h.getPosX());
		assertEquals("Le heros doit se trouver en y = 1",1,h.getPosY());
		assertEquals("le heros doit avoir 100 de vie",100,h.getVie() );
		assertEquals("le heros doit avoir 1 de portee",1,h.getPortee());
		assertEquals("le heros doit avoir 5 de degat",5,h.getAttaque());
	}
	/**
	 * Test qui vérifie le déplacement du heros vers le bas
	 */
	@org.junit.Test
	public void test_Heros_Deplacement_1(){
		MonJeu j = new MonJeu(1);
		Commande c = new Commande();
		c.bas = true;
		j.getPj().seDeplacer(c);
		assertEquals("Le heros doit se trouver en x = 1",1,j.getPj().getPosX());
		assertEquals("Le heros doit se trouver en y = 2",2,j.getPj().getPosY());
	}
	/**
	 * Test qui vérifie le déplacement du heros vers la droite
	 */
	@org.junit.Test
	public void test_Heros_Deplacement_2(){
		MonJeu j = new MonJeu(1);
		Commande c = new Commande();
		c.droite = true;
		j.getPj().seDeplacer(c);
		assertEquals("Le heros doit se trouver en x = 2",2,j.getPj().getPosX());
		assertEquals("Le heros doit se trouver en y = 1",1,j.getPj().getPosY());
	}
	/**
	 * Test qui vérifie le déplacement du héros vers le haut
	 */
	@org.junit.Test
	public void test_Heros_Deplacement_3(){
		MonJeu j = new MonJeu(1);
		Commande c = new Commande();
		c.haut = true;
		j.getPj().seDeplacer(c);
		assertEquals("Le heros doit se trouver en x = 1",1,j.getPj().getPosX());
		assertEquals("Le heros doit se trouver en y = 1",1,j.getPj().getPosY());
	}
	/**
	 * Test qui vérifie le déplacement du heros vers la gauche
	 */
	@org.junit.Test
	public void test_Heros_Deplacement_4(){
		MonJeu j = new MonJeu(1);
		Commande c = new Commande();
		c.gauche = true;
		j.getPj().seDeplacer(c);
		assertEquals("Le heros doit se trouver en x = 1",1,j.getPj().getPosX());
		assertEquals("Le heros doit se trouver en y = 1",1,j.getPj().getPosY());
	}
	/**
	 * Test qui vérifie le deplacement du heros en bas à droite
	 */
	@org.junit.Test
	public void test_Heros_Deplacement_5(){
		MonJeu j = new MonJeu(1);
		Commande c1 = new Commande();
		c1.droite = true;
		c1.bas = true;
		j.getPj().seDeplacer(c1);;
		assertEquals("Le heros doit se trouver en x = 2",2,j.getPj().getPosX());
		assertEquals("Le heros doit se trouver en y = 2",2,j.getPj().getPosY());
	}
	/**
	 * Test qui vérifie le deplacement du heros en haut à droite
	 */
	@org.junit.Test
	public void test_Heros_Deplacement_6(){
		MonJeu j = new MonJeu(1);
		Commande c1 = new Commande();
		Commande c2 = new Commande();
		c2.bas = true;
		j.getPj().seDeplacer(c2);
		c1.droite = true;
		c1.haut = true;
		j.getPj().seDeplacer(c1);;
		assertEquals("Le heros doit se trouver en x = 2",2,j.getPj().getPosX());
		assertEquals("Le heros doit se trouver en y = 1",1,j.getPj().getPosY());
	}
	/**
	 * Test qui vérifie le deplacement du heros en haut à gauche
	 */
	@org.junit.Test
	public void test_Heros_Deplacement_7(){
		MonJeu j = new MonJeu(1);
		Commande c1 = new Commande();
		Commande c2 = new Commande();
		Commande c3 = new Commande();
		c2.bas = true;
		c3.droite=true;
		j.getPj().seDeplacer(c2);
		j.getPj().seDeplacer(c3);
		c1.gauche = true;
		c1.haut = true;
		j.getPj().seDeplacer(c1);;
		assertEquals("Le heros doit se trouver en x = 1",1,j.getPj().getPosX());
		assertEquals("Le heros doit se trouver en y = 1",1,j.getPj().getPosY());
	}	
	/**
	 * Test qui verifie le déplacement du heros en bas à gauche
	 */
	@org.junit.Test
	public void test_Heros_Deplacement_8(){
		MonJeu j = new MonJeu(1);
		Commande c1 = new Commande();
		Commande c2 = new Commande();
		c2.droite = true;
		j.getPj().seDeplacer(c2);
		c1.gauche = true;
		c1.bas = true;
		j.getPj().seDeplacer(c1);;
		assertEquals("Le heros doit se trouver en x = 1",1,j.getPj().getPosX());
		assertEquals("Le heros doit se trouver en y = 2",2,j.getPj().getPosY());
	}
	/**
	 * Test qui vérifie qu'un heros ne peut pas se déplacer dans un mur
	 */
	@org.junit.Test
	public void test_Deplacement_Dans_Mur(){
		MonJeu j = new MonJeu(1);
		Commande c = new Commande();
		c.bas = true;
		j.getPj().seDeplacer(c);
		j.getPj().seDeplacer(c);
		j.getPj().seDeplacer(c);
		assertEquals ("Le heros doit se trouver en x = 1", 1, j.getPj().getPosX());
		assertEquals ("Le heros doit se trouver en y = 3", 3, j.getPj().getPosY());
	}
	/**
	 * Test qui vérifie qu'un heros ne peut pas se deplacer en diagonal dans un mur
	 */
	@org.junit.Test
	public void test_Heros_Deplacement_Mur_Diagonal(){
		MonJeu j = new MonJeu(1);
		Commande c1 = new Commande();
		Commande c2 = new Commande();
		c2.bas = true;
		j.getPj().seDeplacer(c2);
		j.getPj().seDeplacer(c2);
		c1.droite = true;
		c1.bas = true;
		j.getPj().seDeplacer(c1);
		assertEquals("Le heros doit se trouver en x = 2",2,j.getPj().getPosX());
		assertEquals("Le heros doit se trouver en y = 3",3,j.getPj().getPosY());
	}
	/**
	 * Test qui verifie que le heros peut subir des degats
	 */
	@org.junit.Test
	public void test_subirDegat_1(){
		MonJeu j = new MonJeu(1);
		j.getPj().subirDegat(11);
		assertEquals("h1 doit avoir 89pv",89,j.getPj().getVie());
	}
	/**
	 * Test qui verifie qu'un heros ne peut pas se faire soigner par un monstre
	 */
	@org.junit.Test
	public void test_subirDegat_2(){
		MonJeu j = new MonJeu(1);
		j.getPj().subirDegat(-11);
		assertEquals("h1 doit avoir 100pv",100,j.getPj().getVie());
	}
	/**
	 * Test qui verifie qu'un heros peut mourrir
	 */
	@org.junit.Test
	public void test_etreMort_1(){
		MonJeu j = new MonJeu(1);
		j.getPj().subirDegat(100);
		assertEquals("h1 doit etre mort",true,j.getPj().etreMort());
	}
	/**
	 * Test qui verifie qu'un heros n'est pas mort s'il ne perd pas tous ses pdv
	 */
	@org.junit.Test
	public void test_etreMort_2(){
		MonJeu j = new MonJeu(1);
		j.getPj().subirDegat(1);
		assertEquals("h1 doit etre vivant",false,j.getPj().etreMort());
	}
	/**
	 * Test qui vérifie qu'un heros ne peut pas se deplacer s'il est mort
	 */
	@org.junit.Test
	public void test_Deplacer_etreMort(){
		MonJeu j = new MonJeu(1);
		j.getPj().subirDegat(100);
		Commande c = new Commande();
		c.droite = true;
		j.getPj().seDeplacer(c);
		assertEquals("Le heros ne doit pas bouger", 1, j.getPj().getPosX());
		assertEquals("Le heros ne doit pas bouger", 1, j.getPj().getPosY());
	}
	/**
	 * Test qui vérifie que le heros peut attaquer un fantome
	 */
	@org.junit.Test
	public void test_attaque_Fantome(){
		MonJeu j = new MonJeu(1);
		Ghost g = new Ghost(j);
		j.ajouterMonstre(g);
		g.setPosX(2);
		g.setPosY(2);
		Commande c = new Commande();
		c.attaque = true;
		j.getPj().attaquer(c);
		assertEquals("le fantome doit avoir 25pv",25,g.getVie());
	}
	/**
	 * Test qui verifie que le heros peut attaquer un orc
	 */
	@org.junit.Test
	public void test_attaque_Orcs(){
		MonJeu j = new MonJeu(1);
		Orcs o = new Orcs(j);
		j.ajouterMonstre(o);
		o.setPosX(2);
		o.setPosY(2);
		Commande c = new Commande();
		c.attaque=true;
		j.getPj().attaquer(c);
		assertEquals("l'orc doit avoir 45pv",45,o.getVie());
	}
	/**
	 * Test qui verifie le toString() du heros
	 */
	@org.junit.Test
	public void test_toString(){
		MonJeu j = new MonJeu(1);
		String b = j.getPj().toString();
		Commande c = new Commande();
		c.droite = true;
		j.getPj().seDeplacer(c);
		assertEquals("Le toString doit être différent",false,j.getPj().toString()==b);
	}
	/**
	 * Test qui verifie qu'un heros ne peut pas attaquer s'il est mort
	 */
	@org.junit.Test
	public void test_attaquer_etreMort(){
		MonJeu j = new MonJeu(1);
		Orcs o = new Orcs(j);
		j.ajouterMonstre(o);
		o.setPosX(2);
		o.setPosY(2);
		j.getPj().subirDegat(100);
		Commande c = new Commande();
		c.attaque=true;
		j.getPj().attaquer(c);
		assertEquals("l'orc doit avoir 50pdv", 50,o.getVie());
	}
	/**
	 * Test qui verifie qu'un heros peut attaquer plusieurs monstres en même temps si ceux-ci sont dans sa zone d'attaque
	 */
	@org.junit.Test
	public void test_attaquer_plusieurs_Monstres(){
		MonJeu j = new MonJeu(1);
		Orcs o = new Orcs(j);
		Ghost g = new Ghost(j);
		j.ajouterMonstre(o);
		j.ajouterMonstre(g);
		o.setPosX(2);
		o.setPosY(2);
		g.setPosX(2);
		g.setPosY(1);
		Commande c = new Commande();
		c.attaque=true;
		j.getPj().attaquer(c);
		assertEquals("l'orc doit avoir 45pdv", 45,o.getVie());
		assertEquals("le fantome doit avoir 25pdv", 25, g.getVie());
	}
	/**
	 * Test qui vérifie qu'un heros ne peut pas attaquer un fantome si celui ci est dans un mur
	 */
	@org.junit.Test
	public void test_attaquer_Fantome_dans_Mur(){
		MonJeu j = new MonJeu(1);
		Ghost g = new Ghost(j);
		j.ajouterMonstre(g);
		g.setPosX(0);
		g.setPosY(0);
		Commande c = new Commande();
		c.attaque=true;
		j.getPj().attaquer(c);
		assertEquals("le fantome doit avoir 30pdv", 30,g.getVie());
	}
}
