package game;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

import view.GameFrameWork;
import view.IKeyboardListener;
import view.ITickableListener;

public class Controller implements ITickableListener, IKeyboardListener {
	
	private ArrayList<Kugel> kugeln = new ArrayList();
	private Gegner [] gegner = new Gegner[4];
	private Player player;
	private int screenHeight = 0;
	private int screenWidth = 0;
	private int gegnerGap = 0;
	private GameFrameWork gui = new GameFrameWork();
	
	public Controller() {
		setFullScreen(gui);
		gegnerGap = screenHeight * 5/6;
		
		Background background = new Background("assets\\space12.jpg");
		gui.setBackground(background);
		
		createPlayer(gui);
		createGegner(gui);

			
		
		gui.addTick(this);
		gui.addIKeyInput(this);
		
	}


	private void createGegner(GameFrameWork gui) {
		int width = screenHeight / 12;
		for(int i = 0; i < gegner.length; i++) {
			gegner[i] = new Gegner("assets\\ufo20.png", screenWidth-2*width - i*gegnerGap, width, width/2, width);
		}
		
		for(Gegner g: gegner) {
			gui.addGameObject(g);
		}
	}


	private void createPlayer(GameFrameWork gui) {
		int width = screenHeight / 8;
		player = new Player("assets\\ship22.png", screenWidth/2 - width/2, screenHeight - 2*width, width, width, 5, 0);
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


	@Override
	public void tick(long elapsedTime) {
		for(Gegner g : gegner) {
			g.move();
			resetEnemy(g);
		}
		for(Kugel k : kugeln) {
			k.move();			
		}
		if(!kugeln.isEmpty()) {
			if(kugeln.get(0).getY() + kugeln.get(0).getHeight() < 0) {
				gui.removeGameObject(kugeln.get(0));
				kugeln.remove(0);
			}
		}
		
	}
	
	private void resetEnemy(Gegner g) {
		if(g.getX() > screenWidth) {
			int smallest = screenWidth;
			for(Gegner gTemp : gegner) {
				if(smallest >= gTemp.getX()) {
					smallest = gTemp.getX();
				}
			}
			g.setX(smallest - gegnerGap);
		}
	}


	@Override
	public int[] getKeys() {
		
//		int [] keys = new int[1];
//		keys[0] = KeyEvent.VK_SPACE;
		
		int [] keys = {KeyEvent.VK_SPACE, KeyEvent.VK_R};		
		
		return keys;
	}


	@Override
	public void keyDown(int key) {
		if(key == KeyEvent.VK_SPACE) {
			player.shoot();
			kugeln.add(new Kugel("assets\\projectile06.png", 
					player.getX() + player.getWidth()/4, 
					player.getY() - player.getWidth()/2, 
					player.getWidth()/2, 	
					player.getWidth()/2));	
			gui.addGameObject(kugeln.get(kugeln.size()-1));
		}
	}
	
}
