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
	
	public static BufferedImage orcs ;
	
	public static BufferedImage mur;
	
	public static BufferedImage mort;
	

	
	public static BufferedImage talisman;
	
	public static BufferedImage fantomeg;

	public static BufferedImage ghost;
	
	
	public Image() throws IOException {
		this.heros = ImageIO.read(new File("photo/heros/heros.png"));
		this.herosgauche = ImageIO.read(new File("photo/heros/herosgauche.png"));
		this.herosdroite = ImageIO.read(new File("photo/heros/herosdroite.png"));
		this.herosbas = ImageIO.read(new File("photo/heros/herosbas.png"));
		this.heroshaut = ImageIO.read(new File("photo/heros/heroshaut.png"));
		this.herosmort = ImageIO.read(new File("photo/heros/herosmort.png"));
		this.orcs = ImageIO.read(new File("photo/orc.png"));
		this.mur = ImageIO.read(new File("photo/mur.png"));
		this.mort = ImageIO.read(new File("photo/mort.png"));
		this.talisman = ImageIO.read(new File("photo/Gemme.png"));
		this.fantomeg = ImageIO.read(new File("photo/FantomeGauche.png"));
	}

}
