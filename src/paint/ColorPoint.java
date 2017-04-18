package paint;

public class ColorPoint extends Point {
	private String color ;
	
	public ColorPoint(int x, int y, String color){
		super(x,y);
		this.color =color;
	}
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

//	@Override
//	public void test(){} //error!
	
	@Override
	public void show() {
		//완전 재정의
		System.out.println("[x="+getX()+", y="+getY()+", color: "+color+ "]에 점이 생겼다.");
	}
	
}
