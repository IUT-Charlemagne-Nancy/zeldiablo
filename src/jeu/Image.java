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
	
	public static BufferedImage orcs ;
	
	public static BufferedImage mur;
	
	public static BufferedImage mort;
	
	public static BufferedImage mortpj;
	
	public static BufferedImage talisman;
	
	public static BufferedImage fantomeg;

	public static BufferedImage ghost;
	
	
	public Image() throws IOException {
		this.heros = ImageIO.read(new File("photo/heros.png"));
		this.orcs = ImageIO.read(new File("photo/orc.png"));
		this.mur = ImageIO.read(new File("photo/mur.png"));
		this.mort = ImageIO.read(new File("photo/mort.png"));
		this.mortpj = ImageIO.read(new File("photo/mortpj.png"));
		this.talisman = ImageIO.read(new File("photo/Gemme.png"));
		this.fantomeg = ImageIO.read(new File("photo/FantomeGauche.png"));
	}

}
