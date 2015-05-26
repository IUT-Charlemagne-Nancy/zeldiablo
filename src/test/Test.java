package test;

import static org.junit.Assert.*;
import personnage.Heros;

public class Test {

	@org.junit.Test
	public void test_Heros_Constructeur() {
		Heros h = new Heros();
		assertTrue("Le héros doit se trouver en x = 0",0,h.getPosX());
		assertTrue("Le héros doit se trouver en y = 0",0,h.getPosY());
	}
	
	public void test_Heros_Deplacement_1(){
		Heros h = new Heros();
		h.seDeplacer("haut");
		assertTrue("Le héros doit se trouver en x = 0",0,h.getPosX());
		assertTrue("Le héros doit se trouver en y = 1",1,h.getPosY());
	}
	
	public void test_Heros_Deplacement_2(){
		Heros h = new Heros();
		h.seDeplacer("haut");
		h.seDeplacer("bas");
		assertTrue("Le héros doit se trouver en x = 0",0,h.getPosX());
		assertTrue("Le héros doit se trouver en y = 0",1,h.getPosY());
	}
	
	public void test_Heros_Deplacement_3(){
		Heros h = new Heros();
		h.seDeplacer("droite");
		assertTrue("Le héros doit se trouver en x = 1",1,h.getPosX());
		assertTrue("Le héros doit se trouver en y = 0",0,h.getPosY());
	}
	
	public void test_Heros_Deplacement_4(){
		Heros h = new Heros();
		h.seDeplacer("droite");
		h.seDeplacer("gauche");
		assertTrue("Le héros doit se trouver en x = 0",0,h.getPosX());
		assertTrue("Le héros doit se trouver en y = 0",0,h.getPosY());
	}
	
	public void test_Heros_Deplacement_5(){
		Heros h = new Heros();
		h.seDeplacer("bas");
		assertTrue("Le héros doit se trouver en x = 0",0,h.getPosX());
		assertTrue("Le héros doit se trouver en y = 0",0,h.getPosY());
	}
	
	public void test_Heros_Deplacement_6(){
		Heros h = new Heros();
		h.seDeplacer("gauche");
		assertTrue("Le héros doit se trouver en x = 0",0,h.getPosX());
		assertTrue("Le héros doit se trouver en y = 0",0,h.getPosY());
	}
	
	public void test_Heros_Deplacement_7(){
		Heros h = new Heros();
		for (int i = 0 ; i<12 ; i++){
			h.seDeplacer("haut");
		}
		assertTrue("Le héros doit se trouver en x = 0",0,h.getPosX());
		assertTrue("Le héros doit se trouver en y = 10",10,h.getPosY());
	}
	
	public void test_Heros_Deplacement_8(){
		Heros h = new Heros();
		for (int i = 0 ; i<12 ; i++){
			h.seDeplacer("droite");
		}
		assertTrue("Le héros doit se trouver en x = 10",10,h.getPosX());
		assertTrue("Le héros doit se trouver en y = 0",0,h.getPosY());
	}
	
	
	
	
	
	

}
