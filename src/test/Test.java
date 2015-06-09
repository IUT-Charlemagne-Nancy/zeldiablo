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
	public void test_Mur_Constructeur(){
		Mur m = new Mur (0,0);
		assertEquals("Le mur doit se trouver en x = 0",0,m.getPosX());
		assertEquals("Le mur doit se trouver en y = 0",0,m.getPosY());
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