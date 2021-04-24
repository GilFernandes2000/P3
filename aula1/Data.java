package aula1;

public class Data {
	private int dia; 
	private int mes;
	private int ano;
	
	public Data (int d, int m, int a) {
		assert d!=0 && m!=0 && a!=0: "Invalid data";
		d = this.dia;
		m = this.mes;
		a = this.ano;
	}
	public int dia() {
		return dia;
	}
	public int mes() {
		return mes;
	}
	public int ano() {
		return ano;
	}
	public String toString() {
		return dia+"/"+mes+"/"+ano;
	}
}
