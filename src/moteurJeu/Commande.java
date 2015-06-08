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
			break;
		case 1:
			this.bas=true;
			break;
		case 3:
			this.gauche=true;
		case 4:
			this.droite=true;
		}

		
	}
	
}
