package moteurJeu;


public class Case {
	private int posX;
	private int posY;
	
	public Case(int x,int y){
		posX=x;
		posY=y;
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
