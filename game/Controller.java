package game;

import java.awt.Color;

import view.GameFrameWork;
import view.Message;

public class Controller {

	
	public Controller() {
		GameFrameWork gui = new GameFrameWork();
		gui.setSize(800, 600);
		gui.setBackgroundColor(Color.GREEN);
		Message m1 = new Message("Wo ist mein Kaffee???", 50, 250, 40, Color.WHITE);
		gui.addMessage(m1);
		Message m2 = new Message("Keksööööö", 200, 400, 20, Color.BLACK);
		gui.addMessage(m2);
		
	}
}
