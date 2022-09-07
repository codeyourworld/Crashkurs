package wdh;

public class Ball implements IMovable, IKickable {

	//alt + shift + s
	
	private int x = 6;
	private int y = 42;
	private int xVelocity = 4;
	private int yVelocity = 7;
	private boolean isMoved = false;
	
	public Ball() {	
	}
	
	public Ball(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Ball(int x, int y, int xVelocity, int yVelocity) {
		this(x, y);
		this.xVelocity = xVelocity;
		this.yVelocity = yVelocity;
	}
	
	@Override
	public void move() {
		x += xVelocity;
		y -= yVelocity;
		isMoved = true;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getxVelocity() {
		return xVelocity;
	}

	public void setxVelocity(int xVelocity) {
		this.xVelocity = xVelocity;
	}

	public int getyVelocity() {
		return yVelocity;
	}

	public void setyVelocity(int yVelocity) {
		this.yVelocity = yVelocity;
	}

	@Override
	public boolean kick() {
		boolean isKicked = isMoved;
		isMoved = false;
		return isKicked;
	}

	@Override
	public float velocity() {
		y = z;
		return 0;
	}


	
}
