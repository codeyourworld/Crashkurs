package game;

public class Kugel {

	private int velocity = 6;
	private String icon = "";
	private int x = 0;
	private int y = 0;
	private int height = 0;
	private int width = 0;
	
	
	public Kugel(String icon, int x, int y, int height, int width) {
		super();
		this.icon = icon;
		this.x = x;
		this.y = y;
		this.height = height;
		this.width = width;
	}


	public void move() {
		this.y -= velocity;
	}
	
	public int getVelocity() {
		return velocity;
	}


	public String getIcon() {
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

	

}
