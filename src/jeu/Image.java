package jeu;



import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 * 
 * @author Benjamin Denys
 *
 */
public class Image{
	public static BufferedImage heros;
	public static BufferedImage herosgauche;
	public static BufferedImage herosdroite;
	public static BufferedImage herosbas;
	public static BufferedImage heroshaut;
	public static BufferedImage herosmort;
	public static BufferedImage herosattaque;
	public static BufferedImage herosprendre;
	
	public static BufferedImage ghost;
	public static BufferedImage ghostgauche;
	public static BufferedImage ghostdroite;
	public static BufferedImage ghostbas;
	public static BufferedImage ghosthaut;
	public static BufferedImage ghostattaque;
	public static BufferedImage ghostmort;
	
	public static BufferedImage orcs ;
	public static BufferedImage orcsgauche;
	public static BufferedImage orcsdroite ;
	public static BufferedImage orcsbas ;
	public static BufferedImage orcshaut ;
	public static BufferedImage orcsattaque ;
	public static BufferedImage orcsmort ;
	
	public static BufferedImage mur;
	
	public static BufferedImage talisman;
	public static  BufferedImage potion;
	




	
	
	public Image() throws IOException {
		// Images des animations du heros
		this.heros = ImageIO.read(new File("photo/heros/heros.png"));
		this.herosgauche = ImageIO.read(new File("photo/heros/herosgauche.png"));
		this.herosdroite = ImageIO.read(new File("photo/heros/herosdroite.png"));
		this.herosbas = ImageIO.read(new File("photo/heros/herosbas.png"));
		this.heroshaut = ImageIO.read(new File("photo/heros/heroshaut.png"));
		this.herosmort = ImageIO.read(new File("photo/heros/herosmort.png"));
		this.herosattaque = ImageIO.read(new File("photo/heros/herosattaque.png"));
		this.herosprendre = ImageIO.read(new File("photo/heros/herosprendre.png"));
		
		this.ghost = ImageIO.read(new File("photo/ghost/ghost.png"));
		this.ghostgauche = ImageIO.read(new File("photo/ghost/ghostgauche.png"));
		this.ghostdroite = ImageIO.read(new File("photo/ghost/ghostdroite.png"));
		this.ghostbas = ImageIO.read(new File("photo/ghost/ghostbas.png"));
		this.ghosthaut = ImageIO.read(new File("photo/ghost/ghosthaut.png"));
		this.ghostmort = ImageIO.read(new File("photo/ghost/ghostmort.png"));
		this.ghostattaque = ImageIO.read(new File("photo/ghost/ghostattaque.png"));
		
		this.orcs = ImageIO.read(new File("photo/orcs/orcs.png"));
		this.orcsgauche = ImageIO.read(new File("photo/orcs/orcsgauche.png"));
		this.orcsdroite = ImageIO.read(new File("photo/orcs/orcsdroite.png"));
		this.orcsbas = ImageIO.read(new File("photo/orcs/orcsbas.png"));
		this.orcshaut = ImageIO.read(new File("photo/orcs/orcshaut.png"));
		this.orcsmort = ImageIO.read(new File("photo/orcs/orcsmort.png"));
		this.orcsattaque = ImageIO.read(new File("photo/orcs/orcsattaque.png"));
		
		this.mur = ImageIO.read(new File("photo/mur.png"));

		this.talisman = ImageIO.read(new File("photo/objets/talisman.png"));
		this.potion = ImageIO.read(new File("photo/objets/potion.png"));

	}

}
