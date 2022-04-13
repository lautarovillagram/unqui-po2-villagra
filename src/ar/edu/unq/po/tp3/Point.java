package ar.edu.unq.po.tp3;

public class Point {

	private int x;
	private int y;


	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public Point(int puntox, int puntoy) {
		x = puntox;
		y = puntoy;
	}

	public Point() {
		x = 0;
		y = 0;
	}
	
	
	public void moverPunto(int puntox, int puntoy) {
		this.x = puntox;
		this.y = puntoy;
	}
	
	public void sumarConOtroPunt(Point puntoASumar) {
		this.y = this.y + puntoASumar.getY();
		this.x = this.x + puntoASumar.getX();
		
		
		
	}

}
