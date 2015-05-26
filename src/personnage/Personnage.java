
package personnage;
public abstract class  Personnage {

	int posX;
	int posY;
	boolean traverser; 


	public abstract void seDeplacer(String choix);
	
	public String toString(){
		System.out.println("Le personnage est en position"+posX+";"+posY);
		return null;
	}
}
