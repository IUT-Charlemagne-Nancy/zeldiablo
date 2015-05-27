package test;

import static org.junit.Assert.*;
import personnage.Heros;
import personnage.Personnage;

public class Test {

	@org.junit.Test
	public void test_Heros_Constructeur() {
		Heros h = new Heros();
		assertEquals("Le héros doit se trouver en x = 0",0,h.getPosX());
		assertEquals("Le héros doit se trouver en y = 0",0,h.getPosY());
		assertEquals("le héros doit avoir 10 de vie",10,h.getVie() );
		assertEquals("le héros doit avoir 1 de portee",1,h.getPortee());
		assertEquals("le héros doit avoir 1 de dégat",1,h.getDegat());
	}
	@org.junit.Test
	public void test_Heros_Deplacement_1(){
		Heros h = new Heros();
		h.seDeplacer("haut");
		assertEquals("Le héros doit se trouver en x = 0",0,h.getPosX());
		assertEquals("Le héros doit se trouver en y = 1",1,h.getPosY());
	}
	@org.junit.Test
	public void test_Heros_Deplacement_2(){
		Heros h = new Heros();
		h.seDeplacer("haut");
		h.seDeplacer("bas");
		assertEquals("Le héros doit se trouver en x = 0",0,h.getPosX());
		assertEquals("Le héros doit se trouver en y = 0",0,h.getPosY());
	}
	@org.junit.Test
	public void test_Heros_Deplacement_3(){
		Heros h = new Heros();
		h.seDeplacer("droite");
		assertEquals("Le héros doit se trouver en x = 1",1,h.getPosX());
		assertEquals("Le héros doit se trouver en y = 0",0,h.getPosY());
	}
	@org.junit.Test
	public void test_Heros_Deplacement_4(){
		Heros h = new Heros();
		h.seDeplacer("droite");
		h.seDeplacer("gauche");
		assertEquals("Le héros doit se trouver en x = 0",0,h.getPosX());
		assertEquals("Le héros doit se trouver en y = 0",0,h.getPosY());
	}
	@org.junit.Test
	public void test_Heros_Deplacement_5(){
		Heros h = new Heros();
		h.seDeplacer("bas");
		assertEquals("Le héros doit se trouver en x = 0",0,h.getPosX());
		assertEquals("Le héros doit se trouver en y = 0",0,h.getPosY());
	}
	@org.junit.Test
	public void test_Heros_Deplacement_6(){
		Heros h = new Heros();
		h.seDeplacer("gauche");
		assertEquals("Le héros doit se trouver en x = 0",0,h.getPosX());
		assertEquals("Le héros doit se trouver en y = 0",0,h.getPosY());
	}
	@org.junit.Test
	public void test_Heros_Deplacement_7(){
		Heros h = new Heros();
		for (int i = 0 ; i<12 ; i++){
			h.seDeplacer("haut");
		}
		assertEquals("Le héros doit se trouver en x = 0",0,h.getPosX());
		assertEquals("Le héros doit se trouver en y = 10",10,h.getPosY());
	}
	@org.junit.Test
	public void test_Heros_Deplacement_8(){
		Heros h = new Heros();
		for (int i = 0 ; i<12 ; i++){
			h.seDeplacer("droite");
		}
		assertEquals("Le héros doit se trouver en x = 10",10,h.getPosX());
		assertEquals("Le héros doit se trouver en y = 0",0,h.getPosY());
	}
	
	@org.junit.Test
	public void test_subirDegat_1(){
		Heros h1=new Heros();
		h1.subirDegat(11);
		assertEquals("h1 doit avoir 0pv",0,h1.getVie());
	}
	@org.junit.Test
	public void test_subirDegat_2(){
		Heros h1=new Heros();
		h1.subirDegat(-11);
		assertEquals("h1 doit avoir 10pv",10,h1.getVie());
	}
	@org.junit.Test
	public void test_etreMort_1(){
		Heros h1=new Heros();
		h1.subirDegat(10);
		assertEquals("h1 doit etre mort",true,h1.etreMort());
	}
	@org.junit.Test
	public void test_etreMort_2(){
		Heros h1=new Heros();
		h1.subirDegat(1);
		assertEquals("h1 doit etre vivant",false,h1.etreMort());
	}
	@org.junit.Test
	public void test_etreAPortee_1(){
		Heros h1=new Heros();
		h1.seDeplacer("droite");
		Heros h2=new Heros();
		assertEquals("h2 doit etre a portee",true,h1.etreAPortee(h2));
	}
	@org.junit.Test
	public void test_etreAPortee_2(){
		Heros h1=new Heros();
		h1.seDeplacer("droite");
		h1.seDeplacer("droite");
		Heros h2=new Heros();
		assertEquals("h2 nne doit pas etre a portee",false,h1.etreAPortee(h2));
	}
	@org.junit.Test
	public void test_attaque_1(){
		Heros h1=new Heros();
		h1.seDeplacer("droite");
		Heros h2=new Heros();
		h1.attaquer(h2);
		assertEquals("h2 doit avoir 9pv",9,h2.getVie());
	}
	@org.junit.Test
	public void test_attaque_2(){
		Heros h1=new Heros();
		h1.seDeplacer("droite");
		h1.seDeplacer("droite");
		Heros h2=new Heros();
		h1.attaquer(h2);
		assertEquals("h2 doit avoir 10pv",10,h2.getVie());
	}
	@org.junit.Test
	public void test_attaque_3(){
		Heros h1=new Heros();
		h1.seDeplacer("droite");
		h1.subirDegat(10);
		Heros h2=new Heros();
		h1.attaquer(h2);
		assertEquals("h2 doit avoir 10pv",10,h2.getVie());
	}
	@org.junit.Test
	public void test_attaque_4(){
		Heros h1=new Heros();
		h1.seDeplacer("droite");
		h1.subirDegat(10);
		Heros h2=new Heros();
		h2.subirDegat(10);
		h1.attaquer(h2);
		assertEquals("h2 doit avoir 0pv",0,h2.getVie());
	}
	
	@org.junit.Test
	public void test_toString(){
		Heros h1=new Heros();
		String b = h1.toString();
		h1.seDeplacer("droite");
		assertEquals("Le toString doit �tre diff�rent",false,h1.toString()==b);
	}
}