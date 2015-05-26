package personnage;

public class Heros extends Personnage{

	public Heros() {
		super(0,0,1,1,10);
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
	public void attaquer(Personnage victime){
		if(!this.etreMort()){
			if (!victime.etreMort()){

				if(this.etreAPortee(victime)){
					victime.subirDegat(this.attaque);
				}
			}
		}
	}

	@Override
	public void subirDegat(int x) {
		if (!this.etreMort()){
			this.vie=this.vie-x;
			if (this.vie<0){
				this.vie=0;
			}
		}
		
	}
}