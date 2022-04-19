package ar.unq.po2.tp3.ej8;

public class Point {

	private int x;
	private int y;

	public Point() {
		this.setX(0);
		this.setY(0);
	}

	public Point(int x, int y) {
		this.setX(x);
		this.setY(y);
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

	public void move(int newX, int newY) {
		this.setX(newX);
		this.setY(newY);
	}

	public Point sum(Point p2) {
		int newPointX = this.getX() + p2.getX();
		int newPointY = this.getY() + p2.getY();

		return new Point(newPointX, newPointY);
	}
}
