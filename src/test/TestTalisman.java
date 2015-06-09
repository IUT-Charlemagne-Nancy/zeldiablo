package test;

import static org.junit.Assert.*;
import personnage.Heros;
import Objet.Talisman;
import jeu.MonJeu;

public class TestTalisman {

	@org.junit.Test
	public void test_Constructeur_Talisman(){
		MonJeu j = new MonJeu();
		Talisman t = new Talisman();
		assertEquals("le talisman doit etre en position x = 14",14,t.getPosX());
		assertEquals("le talisman doit etre en position y = 9", 9, t.getPosY());
	}
	@org.junit.Test
	public void test_Effet_Talisman(){
		MonJeu j = new MonJeu();
		Heros h = new Heros(j);
		Talisman t = new Talisman();
		t.appliquerEffet(h);
		assertEquals("Le heros doit avoir 300pdv", 300, h.getVie());
		assertEquals("Le heros doit avoir 10 d'attaque", 10, h.getAttaque());
		assertEquals("Le heros doit avoir 2 de portee", 2, h.getPortee());
	}
	@org.junit.Test
	public void test_Effet_Talisman_apres_Attaque(){
		MonJeu j = new MonJeu();
		Heros h = new Heros(j);
		h.subirDegat(50);
		Talisman t = new Talisman();
		t.appliquerEffet(h);
		assertEquals("Le heros doit avoir 200pdv", 200, h.getVie());
		assertEquals("Le heros doit avoir 10 d'attaque", 10, h.getAttaque());
		assertEquals("Le heros doit avoir 2 de portee", 2, h.getPortee());
	}

	
}
