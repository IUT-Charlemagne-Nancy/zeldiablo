package personnage;

public class Jeu {

	public static void main(String[]args){
		Labyrinthe laby = new Labyrinthe();
		Personnage perso = new Heros(0,0);
		perso.seDeplacer("haut");
		perso.toString();
		perso.seDeplacer("bas");
		perso.toString();
		perso.seDeplacer("droite");
		perso.toString();
		perso.seDeplacer("gauche");
		perso.toString();
	}
}
