package graphics;

import java.awt.Font;
import java.awt.image.BufferedImage;

public class Assets {
	
	public static BufferedImage player1,player2,player3,player4,tablero,imagenFondo;
	
	public static Font fontBig;
	public static Font fontMed;
	
	public static BufferedImage blueBtn;
	public static BufferedImage greyBtn;
	
	public static void init()
	{
		player1 = Loader.ImageLoader("/players/player1.png");
		player2 = Loader.ImageLoader("/players/player2.png");
		player3 = Loader.ImageLoader("/players/player3.png");
		player4 = Loader.ImageLoader("/players/player4.png");
		tablero= Loader.ImageLoader("/Tablero.png");
		imagenFondo=Loader.ImageLoader("/Fondo.png");
		
		greyBtn = Loader.ImageLoader("/button/grey_button.png");
		blueBtn = Loader.ImageLoader("/button/blue_button.png");
		
		//fontBig = loadFont("/fonts/futureFont.ttf", 42);
		
		//fontMed = loadFont("/fonts/futureFont.ttf", 20);

	}
	
	
	
}
