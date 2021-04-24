package aula1;

public class Circulo {
	private double raio;
	private Ponto centro;
	final double PI = 3.1416;
	
	public Circulo(double raio, double x, double y) {
		this.raio = raio;
		centro = new Ponto(x,y);
	}
	public Circulo(Ponto centro, double raio) {
		this.raio = raio;
		this.centro = centro;
	}
	public double raio() {
		return raio;
	}
	public Ponto centro() {
		return centro;
	}
	public String toString() {
		return "Raio- "+raio+" Centro- ("+ centro.x() + "," + centro.y() + ")";
	}
	public boolean circIgual(Circulo c) {
		if(raio == c.raio){
			return true;
		}
		return false;
	}
	public double periCirc() {
		double peri = 2 * raio * PI;
		return peri;
	}
	public double areaCirc() {
		double ar = raio * raio * PI;
		return ar;
	}
	public boolean circInter(Circulo c) {
		double somRai = raio + c.raio;
		double distCent = centro.distPontos(c.centro);
		if(somRai > distCent) {
			return true;
		}
		return false;
	}
}
