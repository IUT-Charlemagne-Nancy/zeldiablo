package coo_zeldiablo_osty_legris_denys_parmentier;

import java.util.Scanner;

public class Jeu {

	public static void main(String[]args){
		System.out.println("Bonjour bienvenue dans Zeldiablo");
		String nom="";
		Scanner sc=new Scanner(System.in);
		boolean valide=false;
		while (valide==false){
			System.out.println("Veuiller choisir un nom de personnage :");
			nom=sc.nextLine();
			System.out.println("Vous vous appeler donc : "+nom +"v/f" );
			String valider=sc.nextLine();
			if(valider.equals("v")){
				valide=true;
			}
			
		}
	
		
	}
}
