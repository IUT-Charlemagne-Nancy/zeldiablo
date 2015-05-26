package personnage;
public abstract class  Personnage {

	int posX;
	int posY;

	public Personnage(int x,int y){

		this.posX=x;
		this.posY=y;

	}

	public void seDeplacer(int choix){
		if (choix == 1){
			this.posX = this.posX+10;
		}
		if (choix == 2){
			this.posX = this.posX-10;
		}
		if (choix == 3){
			this.posY = this.posY+10;
		}
		if (choix == 4){
			this.posY = this.posY-10;
		}
	}

}
