package test;

import static org.junit.Assert.*;
import jeu.MonJeu;
import jeu.Mur;
import moteurJeu.Commande;
import personnage.Ghost;
import personnage.Heros;
import personnage.Orcs;

public class Test {

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
	}
	@org.junit.Test
	public void test_attaque_4(){
		MonJeu j = new MonJeu();
		Heros h1 = new Heros(j);
		Commande c = new Commande();
		c.droite = true;
		h1.seDeplacer(c);
		h1.subirDegat(10);
		Heros h2 = new Heros(j);
		h2.subirDegat(10);
		h1.attaquer(h2);
		assertEquals("h2 doit avoir 89pv",89,h2.getVie());
	}
*/	
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
	
	@org.junit.Test
	public void test_Mur_Constructeur(){
		Mur m = new Mur (0,0);
		assertEquals("Le mur doit se trouver en x = 0",0,m.getPosX());
		assertEquals("Le mur doit se trouver en y = 0",0,m.getPosY());
	}
	
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
	public void test_Constructeur_Orc(){
		MonJeu j = new MonJeu();
		Orcs o = new Orcs(j);
		assertEquals("l'orc doit avoir 50 de vie",50,o.getVie() );
		assertEquals("l'orc doit avoir 1 de portee",1,o.getPortee());
		assertEquals("l'orc doit avoir 5 de degat",5,o.getDegat());
	}
	
	@org.junit.Test
	public void test_Constructeur_Fantome(){
		MonJeu j = new MonJeu();
		Ghost g = new Ghost(j);
		assertEquals("le fantome doit avoir 30 de vie",30,g.getVie() );
		assertEquals("le fantome doit avoir 3 de portee",3,g.getPortee());
		assertEquals("le fantome doit avoir 2 de degat",2,g.getDegat());
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
	}
	*/
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
	public void test_Case_Occupee_Constructeur(){
		MonJeu j = new MonJeu();
		Heros h = new Heros (j);
		boolean res = j.caseOccuper(1,1);
		assertEquals("la case doit être occupée", true, res);
	}
	@org.junit.Test
	public void test_Case_Occupee_Deplacement(){
		MonJeu j = new MonJeu();
		Heros h = new Heros(j);
		Commande c = new Commande();
		c.bas=true;
		h.seDeplacer(c);
		boolean res = j.caseOccuper(1, 2);
		//boolean res2 = j.caseOccuper(1, 1);
		assertEquals("la case doit etre occupee", true, res);
		//assertEquals("la case ne doit pas etre occupee", false, res2);
		
	}
}