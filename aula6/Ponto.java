package aula6;

public class Ponto {

	private double x,y;
	public Ponto(double x, double y) {
		this.y = y;
		this.x = x;
	}
	
	public double x() {
		return x;
	}
	
	public double y() {
		return y;
	}
	
	public String toString() {
		return "(" + x + "," + y + ")";
	}


}
