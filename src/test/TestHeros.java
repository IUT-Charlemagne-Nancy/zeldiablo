package test;

import static org.junit.Assert.assertEquals;
import jeu.MonJeu;
import moteurJeu.Commande;
import personnage.Heros;
import personnage.Orcs;

public class TestHeros {

	@org.junit.Test
	public void test_Heros_Constructeur() {
		MonJeu j = new MonJeu();
		Heros h = new Heros(j);
		assertEquals("Le heros doit se trouver en x = 1",1,h.getPosX());
		assertEquals("Le heros doit se trouver en y = 1",1,h.getPosY());
		assertEquals("le heros doit avoir 100 de vie",100,h.getVie() );
		assertEquals("le heros doit avoir 1 de portee",1,h.getPortee());
		assertEquals("le heros doit avoir 5 de degat",5,h.getDegat());
	}
	@org.junit.Test
	public void test_Heros_Deplacement_1(){
		MonJeu j = new MonJeu();
		Heros h = new Heros(j);
		Commande c = new Commande();
		c.bas = true;
		h.seDeplacer(c);
		assertEquals("Le heros doit se trouver en x = 1",1,h.getPosX());
		assertEquals("Le heros doit se trouver en y = 2",2,h.getPosY());
	}
	/**@org.junit.Test
	public void test_Heros_Deplacement_2(){
		MonJeu j = new MonJeu();
		Heros h = new Heros(j);
		Commande c1 = new Commande();
		Commande c2 = new Commande();
		Commande c3 = new Commande();
		Commande c4 = new Commande();
		c1.bas=true;
		c2.droite=true;
		c3.haut=true;
		c4.gauche=true;
		h.seDeplacer(c1);
		h.seDeplacer(c2);
		h.seDeplacer(c3);
		h.seDeplacer(c4);
		assertEquals("Le heros doit se trouver en x = 1",1,h.getPosX());
		assertEquals("Le heros doit se trouver en y = 1",1,h.getPosY());
	}*/
	@org.junit.Test
	public void test_Heros_Deplacement_3(){
		MonJeu j = new MonJeu();
		Heros h = new Heros(j);
		Commande c = new Commande();
		c.droite = true;
		h.seDeplacer(c);
		assertEquals("Le heros doit se trouver en x = 2",2,h.getPosX());
		assertEquals("Le heros doit se trouver en y = 1",1,h.getPosY());
	}
	/**@org.junit.Test
	public void test_Heros_Deplacement_4(){
		MonJeu j = new MonJeu();
		Heros h = new Heros(j);
		Commande c = new Commande();
		c.droite= true;
		h.seDeplacer(c);
		c.droite = false;
		c.gauche = true;
		h.seDeplacer(c);
		assertEquals("Le heros doit se trouver en x = 1",1,h.getPosX());
		assertEquals("Le heros doit se trouver en y = 1",1,h.getPosY());
	}*/
	@org.junit.Test
	public void test_Heros_Deplacement_5(){
		MonJeu j = new MonJeu();
		Heros h = new Heros(j);
		Commande c = new Commande();
		c.haut = true;
		h.seDeplacer(c);
		assertEquals("Le heros doit se trouver en x = 1",1,h.getPosX());
		assertEquals("Le heros doit se trouver en y = 1",1,h.getPosY());
	}
	@org.junit.Test
	public void test_Heros_Deplacement_6(){
		MonJeu j = new MonJeu();
		Heros h = new Heros(j);
		Commande c = new Commande();
		c.gauche = true;
		h.seDeplacer(c);
		assertEquals("Le heros doit se trouver en x = 1",1,h.getPosX());
		assertEquals("Le heros doit se trouver en y = 1",1,h.getPosY());
	}
	@org.junit.Test
	public void test_Heros_Deplacement_7(){
		MonJeu j = new MonJeu();
		Heros h = new Heros(j);
		Commande c = new Commande();
		c.bas = true;
		for (int i = 0 ; i<20 ; i++){
			h.seDeplacer(c);
		}
		assertEquals("Le heros doit se trouver en x = 1",1,h.getPosX());

	}
	@org.junit.Test
	public void test_Heros_Deplacement_8(){
		MonJeu j = new MonJeu();
		Heros h = new Heros(j);
		Commande c = new Commande();
		c.droite = true;
		for (int i = 0 ; i<20 ; i++){
			h.seDeplacer(c);
		}
		assertEquals("Le heros doit se trouver en x = 14",14,h.getPosX());
		assertEquals("Le heros doit se trouver en y = 1",1,h.getPosY());
	}
	
	@org.junit.Test
	public void test_Heros_Deplacement_9(){
		MonJeu j = new MonJeu();
		Heros h = new Heros(j);
		Commande c1 = new Commande();
		c1.droite = true;
		c1.bas = true;
		h.seDeplacer(c1);;
		assertEquals("Le heros doit se trouver en x = 2",2,h.getPosX());
		assertEquals("Le heros doit se trouver en y = 2",2,h.getPosY());
	}
	@org.junit.Test
	public void test_Heros_Deplacement_10(){
		MonJeu j = new MonJeu();
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
	/**@org.junit.Test
	public void test_Heros_Deplacement_11(){
		MonJeu j = new MonJeu();
		Heros h = new Heros(j);
		Commande c1 = new Commande();
		Commande c2 = new Commande();
		c2.droite = true;
		h.seDeplacer(c2);
		c1.gauche = true;
		c1.bas = true;
		h.seDeplacer(c1);;
		assertEquals("Le heros doit se trouver en x = 1",1,h.getPosX());
		assertEquals("Le heros doit se trouver en y = 2",2,h.getPosY());
	}
	
	@org.junit.Test
	public void test_Heros_Deplacement_12(){
		MonJeu j = new MonJeu();
		Heros h = new Heros(j);
		Commande c1 = new Commande();
		Commande c2 = new Commande();
		c2.droite = true;
		h.seDeplacer(c2);
		c2.droite = false;
		c2.bas = true;
		h.seDeplacer(c2);
		c1.gauche = true;
		c1.haut = true;
		h.seDeplacer(c1);;
		assertEquals("Le heros doit se trouver en x = 1",1,h.getPosX());
		assertEquals("Le heros doit se trouver en y = 1",1,h.getPosY());
	}*/
	@org.junit.Test
	public void test_Deplacement_Dans_Mur(){
		MonJeu j = new MonJeu();
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
		MonJeu j = new MonJeu();
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
		MonJeu j = new MonJeu();
		Heros h = new Heros(j);
		h.subirDegat(11);
		assertEquals("h1 doit avoir 89pv",89,h.getVie());
	}
	@org.junit.Test
	public void test_subirDegat_2(){
		MonJeu j = new MonJeu();
		Heros h = new Heros(j);
		h.subirDegat(-11);
		assertEquals("h1 doit avoir 100pv",100,h.getVie());
	}
	@org.junit.Test
	public void test_etreMort_1(){
		MonJeu j = new MonJeu();
		Heros h = new Heros(j);
		h.subirDegat(100);
		assertEquals("h1 doit etre mort",true,h.etreMort());
	}
	@org.junit.Test
	public void test_etreMort_2(){
		MonJeu j = new MonJeu();
		Heros h = new Heros(j);
		h.subirDegat(1);
		assertEquals("h1 doit etre vivant",false,h.etreMort());
	}
	
	@org.junit.Test
	public void test_etreMort_3(){
		MonJeu j = new MonJeu();
		Heros h = new Heros (j);
		h.subirDegat(100);
		Commande c = new Commande();
		c.droite = true;
		h.seDeplacer(c);
		assertEquals("Le heros ne doit pas bouger", 1, h.getPosX());
		assertEquals("Le heros ne doit pas bouger", 1, h.getPosY());
	}
	/**@org.junit.Test
	public void test_etreAPortee_1(){
		MonJeu j = new MonJeu();
		Heros h1 = new Heros(j);
		Commande c = new Commande();
		c.droite = true;
		h1.seDeplacer(c);
		Heros h2=new Heros(j);
		assertEquals("h2 doit etre a portee",true,h1.etreAPortee(h2));
	}
	@org.junit.Test
	public void test_etreAPortee_2(){
		MonJeu j = new MonJeu();
		Heros h1 = new Heros(j);
		Commande c = new Commande();
		c.droite = true;
		h1.seDeplacer(c);
		h1.seDeplacer(c);
		Heros h2=new Heros(j);
		assertEquals("h2 ne doit pas etre a portee",false,j.etreAPortee(h2));
	}
	@org.junit.Test
	public void test_attaque_1(){
		MonJeu j = new MonJeu();
		Heros h1 = new Heros(j);
		Commande c = new Commande();
		c.droite = true;
		h1.seDeplacer(c);
		Heros h2=new Heros(j);
		h1.attaquer(h2);
		assertEquals("h2 doit avoir 99pv",99,h2.getVie());
	}
	@org.junit.Test
	public void test_attaque_2(){
		MonJeu j = new MonJeu();
		Heros h1 = new Heros(j);
		Commande c = new Commande();
		c.droite = true;
		h1.seDeplacer(c);
		h1.seDeplacer(c);
		Heros h2 = new Heros(j);
		h1.attaquer(h2);
		assertEquals("h2 doit avoir 100pv",100,h2.getVie());
	}
	@org.junit.Test
	public void test_attaque_3(){
		MonJeu j = new MonJeu();
		Heros h1 = new Heros(j);
		Commande c = new Commande();
		c.droite = true;
		h1.seDeplacer(c);
		h1.subirDegat(10);
		Heros h2 = new Heros(j);
		h1.attaquer(h2);
		assertEquals("h2 doit avoir 99pv",99,h2.getVie());
	}*/
	@org.junit.Test
	public void test_attaque_4(){
		MonJeu j = new MonJeu();
		Heros h = new Heros(j);
		Orcs o = new Orcs(j);
		o.setPosX(2);
		o.setPosY(2);
		Commande c1 = new Commande();
		Commande c2 = new Commande();
		c1.droite = true;
		c2.attaque=true;
		h.seDeplacer(c1);
		h.attaquer(c2);
		assertEquals("l'orc doit avoir 45pv",45,o.getVie());
	}

	@org.junit.Test
	public void test_toString(){
		MonJeu j = new MonJeu();
		Heros h = new Heros(j);
		String b = h.toString();
		Commande c = new Commande();
		c.droite = true;
		h.seDeplacer(c);
		assertEquals("Le toString doit être différent",false,h.toString()==b);
	}
}
