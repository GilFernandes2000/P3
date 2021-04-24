package aula10;

public class Circulo extends Figura{
	private double raio, x, y, area, perimetro;
	private Circulo c;
	
	public Circulo(double raio) {
		super(new Ponto(0,0));
		this.raio = raio;
		this.area = 3.14*raio*raio;
		this.perimetro = 2*3.14*raio;
	}
	
	public Circulo(double x, double y, double raio) {
		super((new Ponto(x,y)));
		this.raio = raio;
		this.area = 3.14*raio*raio;
		this.perimetro = 2*3.14*raio;
	}
	
	public Circulo(Circulo c) {
		super(c.centro());
		this.c = c;
		this.raio = c.raio();
		this.area = 3.14*c.raio()*c.raio();
		this.perimetro = 2*3.14*c.raio();
	}
	
	public double raio() {
		return raio;
	}
	
	
	public double area() {
		return area;
	}
	
	public double perimetro() {
		return perimetro;
	}
	
	public String toString() {
		return super.toString() + " " + "Raio: " + raio + " ";
	}
	
	public boolean equals(Circulo c) {
		return this.raio == c.raio();
	}

}
