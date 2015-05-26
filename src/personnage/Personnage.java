package personnage;

public abstract class Personnage {
	protected int posX,posY,attaque,portee,vie;
	private boolean mort;
	public  Personnage(int x,int y,int attack,int porte,int pv) {
		this.posX=x;
		this.posY=y;
		this.attaque=attack;
		this.portee=porte;
		this.vie=pv;
		this.mort = false;
	}

	public abstract void seDeplacer(String  choix);
	public abstract String toString();
	public void attaquer(Personnage victime){
		if(!this.etreMort()){
			if (!victime.etreMort()){

				if(this.etreAPortee(victime)){
					victime.subirDegat(this.attaque);
				}
			}
		}
	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	public int getPortee() {
		return portee;
	}

	public void setPortee(int portee) {
		this.portee = portee;
	}

	private boolean etreAPortee(Personnage victime) {
		// TODO Auto-generated method stub
		return false;
	}

	private boolean etreMort() {
		// TODO Auto-generated method stub
		return mort;
	}

	public void subirDegat(int x) {
		if (!this.etreMort()){
			this.vie=this.vie-x;
			if (this.vie<0){
				this.vie=0;
			}
		}
		
	}
}
