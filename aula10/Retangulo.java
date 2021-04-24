package aula10;

public class Retangulo extends Figura {
	private double largura,comprimento, area, perimetro;
	private Retangulo r;
	
	public Retangulo(double comprimento, double largura) {
		super(new Ponto(0,0));
		this.comprimento = comprimento;
		this.largura = largura;
		this.area = comprimento*largura;
		this.perimetro = comprimento*2 + largura*2;
	}	
	
	public Retangulo(Retangulo r) {
		super(r.centro());
		this.r = r;
		this.largura = r.l();
		this.comprimento = r.c();
		this.area = r.area();
		this.perimetro = r.perimetro();
	}
	
	public Retangulo(double x, double y, double comprimento, double largura) {
		super(new Ponto(x,y));
		this.comprimento = comprimento;
		this.largura = largura;
		this.area = comprimento*largura;
		this.perimetro = comprimento*2 + largura*2;
	}
	
	public double c() {
		return comprimento;
	}
	
	public double l() {
		return largura;
	}
	
	public double area() {
		return area;
	}
	
	public double perimetro() {
		return perimetro;
	}
	
	public String toString() {
		return super.toString() + " ";
	}
	
	public boolean equals(Retangulo r) {
		return this.comprimento == r.c() && this.largura == r.l();
	}
	

}
