package aula1;

public class Retangulo {
	private double comprimento;
	private double largura;
	
	public Retangulo(double c, double l) {
		this.comprimento = c;
		this.largura = l;
	}
	public double comprimento() {
		return comprimento;
	}
	public double largura() {
		return largura;
	}
	public String toString() {
		return "Retangulo de comprimento " + comprimento + "e largura " + largura;
	}
	public double periRet() {
		return comprimento*2 + largura*2;
	}
	public double areaRet() {
		return comprimento*largura;
	}
}
