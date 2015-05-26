package personnage;

public class Personnage {
	protected int posX,poxY,attaque,portee,vie;
	public Heros(int x,int y,int attack,int porte,int pv) {
		this.posX=x;
		this.posY=y;
		this.attaque=attack;
		this.portee=porte;
		this.vie=pv;
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
