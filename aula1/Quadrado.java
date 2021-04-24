package aula1;

public class Quadrado {
	private double lado;
	
	public Quadrado(double lado) {
		this.lado = lado;
	}
	public double lado(){
		return lado;
	}
	public String toString() {
		return "Quadrado de lado" + lado;
	}
	public double periQua() {
		return lado*4;
	}
	public double areaQua() {
		return lado*lado;
	}
}
