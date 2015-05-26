package personnage;


public class Heros{
	private int posX;
	private int posY;

	public Heros() {
		this.posX = 0;
		this.posY = 0;
	}
	
	public void seDeplacer(String  choix){
		if (choix.equals("droite")){
			this.posX++;
		}
		if (choix.equals("gauche") ){
			this.posX--;
		}
		if (choix.equals("haut")){
			this.posY++;
		}
		if (choix.equals("bas")){
			this.posY--;
		}
		if (this.posX<0){
			this.posX = 0;
		}
		if (this.posX>Labyrinthe.tailleX){
			this.posX =Labyrinthe.tailleX;
		}
		if (this.posY<0){
			this.posY = 0;
		}
		if (this.posY>Labyrinthe.tailleY){
			this.posY =Labyrinthe.tailleY;
		}
		
	}
	public String toString(){
		return("le personnage est en position: x:"+this.posX+" y: "+this.posY);
	}


}
