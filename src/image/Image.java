package image;



import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 * 
 * @author Benjamin
 *
 */
public class Image{
	public static BufferedImage heros;
	
	public Image() throws IOException {
		heros = ImageIO.read(new File("photo/heros.png"));
	}

}
