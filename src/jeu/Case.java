package jeu;


public class Case {
	private int posX;
	private int posY;
	
	public Case(int x,int y){
		posX=x;
		posY=y;
	}
	@Override
	public String toString() {
		return "Case [posX=" + posX + ", posY=" + posY + "]";
	}
	public boolean etreTraversable(){
		return true;
	}
	public int getPosX(){
		return posX;
	}
	public int getPosY(){
		return posY;
	}
}
