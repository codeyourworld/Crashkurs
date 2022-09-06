package game;

public class Player {

	private String icon = "";
	private int x = 0;
	private int y = 0;
	private int height = 0;
	private int width = 0;
	private int shots = 0;
	private int points = 0;
	private int maxShots = 5;
	
	public Player(int shots) {
		this.shots = shots;
	}

	public Player(String icon, int x, int y, int height, int width, int shots, int points) {
		this(shots);
		this.icon = icon;
		this.x = x;
		this.y = y;
		this.height = height;
		this.width = width;
		this.points = points;
	}

	public void score() {
		points++;
	}
	
	public void reload() {
		if(shots == 0) {
			shots = maxShots;
		}
	}
	
	//TODO boolean return
	public void shoot() {
		if(shots < 0) {
			shots--;
		}
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

	public int getShots() {
		return shots;
	}

	public int getPoints() {
		return points;
	}
	
	
}
