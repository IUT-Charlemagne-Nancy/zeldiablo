package personnage;

public class Heros extends Personnage{

	public Heros(int x, int y) {
		super();
		this.posX = 0;
		this.posY = 0;
		this.traverser = false;
	}
	
	public void seDeplacer(String  choix){
		if (choix == "droite"){
			this.posX = this.posX+10;
		}
		if (choix =="gauche" ){
			this.posX = this.posX-10;
		}
		if (choix == "haut"){
			this.posY = this.posY+10;
		}
		if (choix == "bas"){
			this.posY = this.posY-10;
		}
		
	}


}
