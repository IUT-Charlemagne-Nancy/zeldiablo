package jeu;

import java.util.Scanner;

import personnage.Heros;
import personnage.Labyrinthe;



public class Jeu {
	public boolean run;
	public Jeu(){
		run=true;
		Scanner sc=new Scanner(System.in);
		Labyrinthe laby = new Labyrinthe();
		Heros perso = new Heros();
		System.out.println(perso.toString());
		while(run){
		System.out.println("Veuillez vous deplacer haut/droite/bas/gauche");
		String deplacement=sc.nextLine();
		while(!deplacement.equals("droite")&&!deplacement.equals("gauche")&&!deplacement.equals("haut")&&!deplacement.equals("bas")){
			System.out.println("entrez un message approprier haut/droite/bas/gauche");
			deplacement=sc.nextLine();
		}
		perso.seDeplacer(deplacement);
		System.out.println(perso.toString());
		
	}
}
	public static void main(String[]args){
		Jeu j1=new Jeu();
	}
}
