package paint;

public class Circle extends Shape {
	private int x;
	private int y;
	private double r;
	
	public double getR() {
		return r;
	}
	public void setR(double r) {
		this.r = r;
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
	
	@Override
	public void draw() {
		System.out.println("원 그렸습니다.");
	}
}
