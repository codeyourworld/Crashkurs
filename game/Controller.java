package game;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import view.GameFrameWork;

public class Controller {

	Gegner [] gegner = new Gegner[4];
	
	public Controller() {
		GameFrameWork gui = new GameFrameWork();
		setFullScreen(gui);

		gegner[0] = new Gegner("assets\\ufo20.png", 100, 100, 40, 80);
		gegner[1] = new Gegner("assets\\ufo20.png", 250, 100, 40, 80);
		gegner[2] = new Gegner("assets\\ufo20.png", 500, 100, 40, 80);
		gegner[3] = new Gegner("assets\\ufo20.png", 750, 100, 40, 80);
		
		Player player = new Player("assets\\ship22.png", 100, 100, 100, 100, 5, 0);
		gui.addGameObject(player);
		
		for(Gegner g: gegner) {
			gui.addGameObject(g);
		}
	}


	private void getImageSize() {
		try {
			BufferedImage bimg = ImageIO.read(new File("assets\\ufo20.png"));
			int width          = bimg.getWidth();
			int height         = bimg.getHeight();
			System.out.println(width + ", " + height);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	private void setFullScreen(GameFrameWork gui) {
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int screenHeight = screenSize.height;
		int screenWidth = screenSize.width;
		gui.setSize(screenWidth, screenHeight);
	}
	
}
