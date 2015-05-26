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
