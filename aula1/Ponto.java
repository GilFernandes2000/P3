package aula1;

public class Ponto {
	private double x;
	private double y;
	
	public Ponto(double x, double y) {
		this.x = x;
		this.y = y;
	}
	public double x() {
		return x;
	}
	public double y() {
		return y;
	}
	public String toString() {
		return "Abcissa - "+x+" Ordenada- "+x;
	}
	public double distPontos(Ponto p) {
		return Math.sqrt((p.x - x)*(p.x - x) + (p.y - y)*(p.y - y));
	}
}
