package test;

import static org.junit.Assert.assertEquals;
import jeu.MonJeu;
import moteurJeu.Commande;
import personnage.Ghost;
import personnage.Heros;
import personnage.Orcs;

public class TestHeros {

	@org.junit.Test
	public void test_Heros_Constructeur() {
		MonJeu j = new MonJeu(1);
		Heros h = new Heros(j);
		assertEquals("Le heros doit se trouver en x = 1",1,h.getPosX());
		assertEquals("Le heros doit se trouver en y = 1",1,h.getPosY());
		assertEquals("le heros doit avoir 100 de vie",100,h.getVie() );
		assertEquals("le heros doit avoir 1 de portee",1,h.getPortee());
		assertEquals("le heros doit avoir 5 de degat",5,h.getDegat());
	}
	@org.junit.Test
	public void test_Heros_Deplacement_1(){
		MonJeu j = new MonJeu(1);
		Commande c = new Commande();
		c.bas = true;
		j.getPj().seDeplacer(c);
		assertEquals("Le heros doit se trouver en x = 1",1,j.getPj().getPosX());
		assertEquals("Le heros doit se trouver en y = 2",2,j.getPj().getPosY());
	}
	
	@org.junit.Test
	public void test_Heros_Deplacement_2(){
		MonJeu j = new MonJeu(1);
		Commande c = new Commande();
		c.droite = true;
		j.getPj().seDeplacer(c);
		assertEquals("Le heros doit se trouver en x = 2",2,j.getPj().getPosX());
		assertEquals("Le heros doit se trouver en y = 1",1,j.getPj().getPosY());
	}
	
	@org.junit.Test
	public void test_Heros_Deplacement_3(){
		MonJeu j = new MonJeu(1);
		Commande c = new Commande();
		c.haut = true;
		j.getPj().seDeplacer(c);
		assertEquals("Le heros doit se trouver en x = 1",1,j.getPj().getPosX());
		assertEquals("Le heros doit se trouver en y = 1",1,j.getPj().getPosY());
	}
	@org.junit.Test
	public void test_Heros_Deplacement_4(){
		MonJeu j = new MonJeu(1);
		Commande c = new Commande();
		c.gauche = true;
		j.getPj().seDeplacer(c);
		assertEquals("Le heros doit se trouver en x = 1",1,j.getPj().getPosX());
		assertEquals("Le heros doit se trouver en y = 1",1,j.getPj().getPosY());
	}
	@org.junit.Test
	public void test_Heros_Deplacement_5(){
		MonJeu j = new MonJeu(1);
		Commande c = new Commande();
		c.bas = true;
		for (int i = 0 ; i<20 ; i++){
			j.getPj().seDeplacer(c);
		}
		assertEquals("Le heros doit se trouver en x = 1",1,j.getPj().getPosX());

	}
	@org.junit.Test
	public void test_Heros_Deplacement_6(){
		MonJeu j = new MonJeu(1);
		Heros h = new Heros(j);
		Commande c = new Commande();
		c.droite = true;
		for (int i = 0 ; i<20 ; i++){
			h.seDeplacer(c);
		}
		assertEquals("Le heros doit se trouver en x = 3",3,h.getPosX());
		assertEquals("Le heros doit se trouver en y = 1",1,h.getPosY());
	}
	
	@org.junit.Test
	public void test_Heros_Deplacement_7(){
		MonJeu j = new MonJeu(1);
		Heros h = new Heros(j);
		Commande c1 = new Commande();
		c1.droite = true;
		c1.bas = true;
		h.seDeplacer(c1);;
		assertEquals("Le heros doit se trouver en x = 2",2,h.getPosX());
		assertEquals("Le heros doit se trouver en y = 2",2,h.getPosY());
	}
	@org.junit.Test
	public void test_Heros_Deplacement_8(){
		MonJeu j = new MonJeu(1);
		Heros h = new Heros(j);
		Commande c1 = new Commande();
		Commande c2 = new Commande();
		c2.bas = true;
		h.seDeplacer(c2);
		c1.droite = true;
		c1.haut = true;
		h.seDeplacer(c1);;
		assertEquals("Le heros doit se trouver en x = 2",2,h.getPosX());
		assertEquals("Le heros doit se trouver en y = 1",1,h.getPosY());
	}
	
	@org.junit.Test
	public void test_Deplacement_Dans_Mur(){
		MonJeu j = new MonJeu(1);
		Heros h = new Heros (j);
		Commande c = new Commande();
		c.bas = true;
		h.seDeplacer(c);
		h.seDeplacer(c);
		h.seDeplacer(c);
		assertEquals ("Le heros doit se trouver en x = 1", 1, h.getPosX());
		assertEquals ("Le heros doit se trouver en y = 3", 3, h.getPosY());
	}
	@org.junit.Test
	public void test_Heros_Deplacement_Mur_Diagonal(){
		MonJeu j = new MonJeu(1);
		Heros h = new Heros(j);
		Commande c1 = new Commande();
		Commande c2 = new Commande();
		c2.bas = true;
		h.seDeplacer(c2);
		h.seDeplacer(c2);
		c1.droite = true;
		c1.bas = true;
		h.seDeplacer(c1);
		assertEquals("Le heros doit se trouver en x = 2",2,h.getPosX());
		assertEquals("Le heros doit se trouver en y = 3",3,h.getPosY());
	}
	
	@org.junit.Test
	public void test_subirDegat_1(){
		MonJeu j = new MonJeu(1);
		Heros h = new Heros(j);
		h.subirDegat(11);
		assertEquals("h1 doit avoir 89pv",89,h.getVie());
	}
	@org.junit.Test
	public void test_subirDegat_2(){
		MonJeu j = new MonJeu(1);
		Heros h = new Heros(j);
		h.subirDegat(-11);
		assertEquals("h1 doit avoir 100pv",100,h.getVie());
	}
	@org.junit.Test
	public void test_etreMort_1(){
		MonJeu j = new MonJeu(1);
		Heros h = new Heros(j);
		h.subirDegat(100);
		assertEquals("h1 doit etre mort",true,h.etreMort());
	}
	@org.junit.Test
	public void test_etreMort_2(){
		MonJeu j = new MonJeu(1);
		Heros h = new Heros(j);
		h.subirDegat(1);
		assertEquals("h1 doit etre vivant",false,h.etreMort());
	}
	
	@org.junit.Test
	public void test_Deplacer_etreMort(){
		MonJeu j = new MonJeu(1);
		Heros h = new Heros (j);
		h.subirDegat(100);
		Commande c = new Commande();
		c.droite = true;
		h.seDeplacer(c);
		assertEquals("Le heros ne doit pas bouger", 1, h.getPosX());
		assertEquals("Le heros ne doit pas bouger", 1, h.getPosY());
	}

	@org.junit.Test
	public void test_attaque_Fantome(){
		MonJeu j = new MonJeu(1);
		Heros h = new Heros(j);
		Ghost g = new Ghost(j);
		j.ajouterMonstre(g);
		g.setPosX(2);
		g.setPosY(2);
		Commande c = new Commande();
		c.attaque = true;
		h.attaquer(c);
		assertEquals("le fantome doit avoir 25pv",25,g.getVie());
	}
	
	@org.junit.Test
	public void test_attaque_Orcs(){
		MonJeu j = new MonJeu(1);
		Heros h = new Heros(j);
		Orcs o = new Orcs(j);
		j.ajouterMonstre(o);
		o.setPosX(2);
		o.setPosY(2);
		Commande c = new Commande();
		c.attaque=true;
		h.attaquer(c);
		assertEquals("l'orc doit avoir 45pv",45,o.getVie());
	}

	@org.junit.Test
	public void test_toString(){
		MonJeu j = new MonJeu(1);
		Heros h = new Heros(j);
		String b = h.toString();
		Commande c = new Commande();
		c.droite = true;
		h.seDeplacer(c);
		assertEquals("Le toString doit être différent",false,h.toString()==b);
	}
	@org.junit.Test
	public void test_attaquer_etreMort(){
		MonJeu j = new MonJeu(1);
		Orcs o = new Orcs(j);
		Heros h = new Heros (j);
		j.ajouterMonstre(o);
		o.setPosX(2);
		o.setPosY(2);
		h.subirDegat(100);
		Commande c = new Commande();
		c.attaque=true;
		h.attaquer(c);
		assertEquals("l'orc doit avoir 50pdv", 50,o.getVie());
	}
	@org.junit.Test
	public void test_attaquer_plusieurs_Monstres(){
		MonJeu j = new MonJeu(1);
		Orcs o = new Orcs(j);
		Heros h = new Heros(j);
		Ghost g = new Ghost(j);
		j.ajouterMonstre(o);
		j.ajouterMonstre(g);
		o.setPosX(2);
		o.setPosY(2);
		g.setPosX(2);
		g.setPosY(1);
		Commande c = new Commande();
		c.attaque=true;
		h.attaquer(c);
		assertEquals("l'orc doit avoir 45pdv", 45,o.getVie());
		assertEquals("le fantome doit avoir 25pdv", 25, g.getVie());
	}
	@org.junit.Test
	public void test_attaquer_Fantome_dans_Mur(){
		MonJeu j = new MonJeu(1);
		Ghost g = new Ghost(j);
		Heros h = new Heros (j);
		j.ajouterMonstre(g);
		g.setPosX(0);
		g.setPosY(0);
		Commande c = new Commande();
		c.attaque=true;
		h.attaquer(c);
		assertEquals("le fantome doit avoir 30pdv", 30,g.getVie());
	}
}
