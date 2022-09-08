package game;

import view.IGameObject;

public class Gegner implements IGameObject{

	private int velocity = 3;
	private String icon = "";
	private int x = 0;
	private int y = 0;
	private int height = 0;
	private int width = 0;
	
	public Gegner(int x) {
		this.x = x;
	}

	public Gegner(String icon, int x, int y, int height, int width) {
		this(x);
		this.icon = icon;
		this.y = y;
		this.height = height;
		this.width = width;
	}

	public void move() {
		x += velocity;
	}
	
	public int getVelocity() {
		return velocity;
	}

	public String getImagePath() {
		return icon;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getHeight() {
		return height;
	}

	public int getWidth() {
		return width;
	}

	public void setX(int x) {
		this.x = x;
	}
	
	
}
