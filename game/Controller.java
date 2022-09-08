package game;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import view.GameFrameWork;

public class Controller {
	
	private Gegner [] gegner = new Gegner[4];
	private int screenHeight = 0;
	private int screenWidth = 0;
	
	
	public Controller() {
		GameFrameWork gui = new GameFrameWork();
		setFullScreen(gui);
		
		createPlayer(gui);
		createGegner(gui);
		
	}


	private void createGegner(GameFrameWork gui) {
		int width = screenHeight / 12;
		for(int i = 0; i < gegner.length; i++) {
			gegner[i] = new Gegner("assets\\ufo20.png", screenWidth-2*width - i*width*10, width, width/2, width);
		}
		
		for(Gegner g: gegner) {
			gui.addGameObject(g);
		}
	}


	private void createPlayer(GameFrameWork gui) {
		int width = screenHeight / 8;
		Player player = new Player("assets\\ship22.png", screenWidth/2 - width/2, screenHeight - 2*width, width, width, 5, 0);
		gui.addGameObject(player);
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
		this.screenHeight = screenSize.height;
		this.screenWidth = screenSize.width;
		gui.setSize(screenWidth, screenHeight);
	}
	
}
