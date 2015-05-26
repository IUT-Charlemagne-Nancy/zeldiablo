<<<<<<< HEAD
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
=======
package personnage;
public abstract class  Personnage {
	String nom;
	int posX;
	int posY;
	int vie;
	public Personnage(String n,int x,int y){
		this.nom=n;
		this.posX=x;
		this.posY=y;
		this.vie=10;
	}
	public abstract void attaquer();
	public abstract void subirDegat();
	public abstract void seDeplacer();
	public	int getVie(){
		return this.vie;
	}
	public int getPosX(){
		return this.posX;
	}
	public int getPosY(){
		return this.posY;
	}
	public String getNom(){
		return this.nom;
	}
}
>>>>>>> branch 'master' of git@bitbucket.org:CorentinL52/coo_zeldiablo_osty_legris_denys_parmentier.git
