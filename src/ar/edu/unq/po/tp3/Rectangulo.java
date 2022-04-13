package ar.edu.unq.po.tp3;

public class Rectangulo {
	private Point esquinaSuperiorIzquierda;
	private int longitudY;
	private int longitudX;

	public Rectangulo(Point puntoInicial, int alto, int ancho) {
		esquinaSuperiorIzquierda = puntoInicial;
		longitudY = alto;
		longitudX = ancho;

	}

	public int getLongitudX() {
		return longitudX;
	}

	public int getLongitudY() {
		return longitudY;
	}

	public Point esquinaSuperiorDerecha() {

		return new Point(esquinaSuperiorIzquierda.getX() + this.getLongitudX() - 1, esquinaSuperiorIzquierda.getY());
	}

	public Point esquinaInferiorIzquierda() {
		return new Point(esquinaSuperiorIzquierda.getX(), esquinaSuperiorIzquierda.getY() - this.getLongitudY() - 1);
	}

	public Point esquinaInferiorDerecha() {
		return new Point(esquinaSuperiorIzquierda.getX() + this.getLongitudX() - 1,
				esquinaSuperiorIzquierda.getY() - this.getLongitudY() - 1);
	}

	public boolean esVertical() {
		return longitudX < longitudY;
	}

	public boolean esHorizontal() {
		return longitudX > longitudY;
	}

	public int perimetro() {
		return this.getLongitudX() * 2 + this.getLongitudY() * 2;
	}

	public int superficie() {
		return this.getLongitudX() * this.getLongitudY();
	}

}
