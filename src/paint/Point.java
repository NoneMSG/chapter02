package paint;

public class Point implements Drawable {
	private int x;
	private int y;
	
	public Point(){}
	public Point(int x, int y){
		this.x = x;
		this.y = y;
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
	public void show(){
		System.out.println("[x="+x+", y="+y+"]에 점이 생겼다.");
	}
	
//	public void disapear(){
//		System.out.println("[x="+x+", y="+y+"]에 점이 지워졌다.");
//	}
	
	public void show(boolean visiable){
		if(visiable==true){
			show(); //show를 썼기때문에 자식클래스에서 한번만 오버라이드 하면 된다.
			//System.out.println("[x="+x+", y="+y+"]에 점이 지워졌다.");
		}else{
			System.out.println("[x="+x+", y="+y+"]에 점이 지워졌다.");
		}
	}
	public void draw(){
		show();
	}
}
