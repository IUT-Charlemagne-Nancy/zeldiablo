package test;

import static org.junit.Assert.*;
import jeu.MonJeu;
import jeu.Mur;


public class Test {
	/**
	 * Test qui v�rifie le constructeur de MonJeu
	 */
	@org.junit.Test
	public void test_MonJeu_Constructeur(){
		MonJeu j = new MonJeu(1);
		assertEquals("Le heros doit se trouver en x = 1",1,j.getPj().getPosX());
		assertEquals("Le heros doit se trouver en y = 1",1,j.getPj().getPosY());
	}
	/**
	 * Test qui v�rifie le constructeur de Mur
	 */
	@org.junit.Test
	public void test_Mur_Constructeur(){
		Mur m = new Mur (0,0);
		assertEquals("Le mur doit se trouver en x = 0",0,m.getPosX());
		assertEquals("Le mur doit se trouver en y = 0",0,m.getPosY());
	}
	/**
	 * Test qui v�rifie qu'une case est occup�e
	 */
	@org.junit.Test
	public void test_Case_Occupee(){
		MonJeu j = new MonJeu(1);
		boolean res = j.caseOccuper(1,1);
		assertEquals("la case doit �tre occup�e", true, res);
	}
	/**
	 * Test qui v�rifie que le jeu se termine � la mort du personnage
	 */
	@org.junit.Test
	public void test_Fin_Jeu_Perdu(){
		MonJeu j = new MonJeu(1);
		j.getPj().subirDegat(100);  
		assertEquals("le jeu doit etre fini", true, j.etreFini());
	}
	/**
	 * Test qui v�rifie que le jeu se termine quand le heros a ramen� le talisman
	 */
	@org.junit.Test
	public void test_Fin_Jeu_Gagne(){
		MonJeu j = new MonJeu(1);
		j.getPj().setPosX(14);
		j.getPj().setPosY(9);
		j.getPj().avoirPrisTalisman();
		j.getPj().setPosX(1);
		j.getPj().setPosY(1);
		assertEquals("le jeu doit etre fini", true, j.etreFini());
	}
}