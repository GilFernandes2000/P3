package aula10;

public class Quadrado extends Figura {
	private double lado, area, perimetro;
	private Quadrado q;
	
	public Quadrado(double lado) {
		super(new Ponto(0,0));
		this.lado = lado;
		this.area = lado*lado;
		this.perimetro = lado*4;
		
	}
	
	public Quadrado(Quadrado q) {
		super(q.centro());
		this.q = q;
		this.area = q.area();
		this.perimetro = q.perimetro();
	}
	
	public Quadrado(double x, double y, double lado) {
		super(new Ponto(x,y));
		this.area = lado*lado;
		this.perimetro = lado*4;
	}
	
	public double area() {
		return area;
	}
	
	public double perimetro() {
		return perimetro;
	}
	
	public double lado() {
		return lado;
	}
	
	public String toString() {
		return super.toString() + " ";
	}
	
	public boolean equals(Quadrado q) {
		return this.lado == q.lado();
	}
	
	
}
