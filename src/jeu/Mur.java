package jeu;



public class Mur extends Case {

	public Mur(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}
	public boolean etreTraversable(){
		return false;
	}
	@Override
	public String toString() {
		return "Mur [etreTraversable()=" + etreTraversable() + "]";
	}
}
