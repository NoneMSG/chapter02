package paint;

public abstract class Shape implements Drawable,Resizable {
	private String fillColor;
	private String lineColor;
	
	public String getFillColor() {
		return fillColor;
	}
	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}
	public String getLineColor() {
		return lineColor;
	}
	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}
	@Override
	public void resize(double rate){
		
	}
	//abstract public void draw();
}
