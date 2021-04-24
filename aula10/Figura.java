package aula10;

public abstract  class Figura implements Comparable<Figura> {
	private Ponto c;
	
	public Figura(Ponto c) {
		this.c = c;
	}
	
	public Ponto centro() {
		return c;
	}
	
	public String toString() {
		return "Centro: " + c.toString();
	}
	public abstract double area();
	public abstract double perimetro();
	
	public int compareTo(Figura figura) {
		return (int)(this.area()-figura.area());
	}
}
