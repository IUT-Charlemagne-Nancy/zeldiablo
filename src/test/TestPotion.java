package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import moteurJeu.Commande;
import jeu.MonJeu;
import Objet.Objet;
import Objet.PotionDegat;
import Objet.PotionMagique;
import Objet.PotionPoison;
import Objet.PotionSoin;


public class TestPotion {

	/**
	 * Test qui vérifie le constructeur de PotionDegat
	 */
	@org.junit.Test
	public void test_Constructeur_PotionDegat(){
		PotionDegat pd = new PotionDegat(1,1);
		assertEquals("La potion doit etre en position x=1", 1, pd.getPosX());
		assertEquals("la potion doit etre en position y=1", 1, pd.getPosY());
	}
	/**
	 * Test qui vérifie les effets de d'une potion degat
	 */
	@org.junit.Test
	public void test_Effet_PotionDegat(){
		MonJeu j = new MonJeu(1);
		PotionDegat pd = new PotionDegat(1,1);
		pd.appliquerEffet(j.getPj());
		assertEquals("l'attaque du heros doit augmenter de 2 points", 7, j.getPj().getAttaque());
	}
	/**
	 * Test qui vérifie le constructeur de PotionMagique
	 */
	@org.junit.Test
	public void test_Constructeur_PotionMagique(){
		PotionMagique pm = new PotionMagique(1,1);
		assertEquals("La potion doit etre en position x=1", 1, pm.getPosX());
		assertEquals("la potion doit etre en position y=1", 1, pm.getPosY());
	}
	/**
	 * Test qui vérifie les effets d'une potion magique
	 */
	@org.junit.Test
	public void test_Effet_PotionMagique(){
		MonJeu j = new MonJeu(1);
		PotionMagique pm = new PotionMagique(1,1);
		pm.appliquerEffet(j.getPj());
		assertEquals("l'attaque du heros doit augmenter de 4 points", 9, j.getPj().getAttaque());
		assertEquals("le heros doit se soigner de 30pdv", 130, j.getPj().getVie());
	}
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
