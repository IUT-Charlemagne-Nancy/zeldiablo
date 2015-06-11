package test;

import static org.junit.Assert.assertEquals;
import jeu.MonJeu;
import Objet.PotionPoison;
import Objet.PotionSoin;


public class TestPotion {

	/**
	 * Test qui vérifie le constructeur de PotionPoison
	 */
	@org.junit.Test
	public void test_Constructeur_PotionPoison(){
		PotionPoison pp = new PotionPoison(1,1);
		assertEquals("La potion doit etre en position x=1", 1, pp.getPosX());
		assertEquals("la potion doit etre en position y=1", 1, pp.getPosY());
	}
	/**
	 * Test qui vérifie les effets d'une potion poison
	 */
	@org.junit.Test
	public void test_Effet_PotionPoison(){
		MonJeu j = new MonJeu(1);
		PotionPoison pp = new PotionPoison(1,1);
		pp.appliquerEffet(j.getPj());
		assertEquals("le heros doit perdre 10pdv", 90, j.getPj().getVie());
	}
	/**
	 * Test qui vérifie le constructeur de PotionSoin
	 */
	@org.junit.Test
	public void test_Constructeur_PotionSoin(){
		PotionSoin ps = new PotionSoin(1,1);
		assertEquals("La potion doit etre en position x=1", 1, ps.getPosX());
		assertEquals("la potion doit etre en position y=1", 1, ps.getPosY());
	}
	/**
	 * Test qui vérifie les effets d'une potion de soin
	 */
	@org.junit.Test
	public void test_Effet_PotionSoin(){
		MonJeu j = new MonJeu(1);
		PotionSoin ps = new PotionSoin(1,1);
		ps.appliquerEffet(j.getPj());
		assertEquals("le heros doit se soigner de 25pdv", 125, j.getPj().getVie());
	}
}
