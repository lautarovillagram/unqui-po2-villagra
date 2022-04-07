package ar.edu.unq.po.tp3;

public class punto {
	public float getX() {
		return x;
	}
	public void setX(float x) {
		this.x = x;
	}
	public float getY() {
		return y;
	}
	public void setY(float y) {
		this.y = y;
	}
	public punto(float x, float y) {
		super();
		this.setXY(x, y);
	}
	private float x;
	private float y;
	
	
	public void setXY(float x, float y) {
		this.setX(x);
		this.setY(y);
	}
	
	
	

}
