package moteurJeu;

/**
 * permet de representer une commande de l'utilisateur
 * 
 * @author vthomas
 *
 */
public class Commande {

	/**
	 * boolean representant la commande de l'utilisateur
	 */
	public boolean gauche;
	public boolean droite;
	public boolean haut;
	public boolean bas;

	public Commande()
	{
		
	}
	
	/**
	 * constructeur par copie
	 * copie la commande pour en creer une nouvelle
	 * @param commandeACopier
	 */
	public Commande(Commande commandeACopier)
	{
		this.bas=commandeACopier.bas;
		this.haut=commandeACopier.haut;
		this.gauche=commandeACopier.gauche;
		this.droite=commandeACopier.droite;		
	}
	public  Commande (int i){
		switch(i){
		case 0:
			this.haut=true;
			this.bas=false;
			this.gauche=false;
			this.droite=false;
			break;
		case 1:
			this.bas=true;
			this.haut=false;
			this.gauche=false;
			this.droite=false;
			break;
		case 3:
			this.gauche=true;
			this.haut=false;
			this.bas=false;
			this.droite=false;
			break;
		case 4:
			this.droite=true;
			this.haut=false;
			this.gauche=false;
			this.bas=false;
			break;
		case 5:
			this.droite=true;
			this.haut=false;
			this.gauche=false;
			this.bas=true;
			break;
		case 6:
			this.droite=true;
			this.haut=true;
			this.gauche=false;
			this.bas=false;
			break;
		case 7:
			this.droite=false;
			this.haut=true;
			this.gauche=true;
			this.bas=false;
			break;
		case 8:
			this.droite=false;
			this.haut=false;
			this.gauche=true;
			this.bas=true;
			break;
		}

		
	}
	
}
