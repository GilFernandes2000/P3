package aula4;

public class Pessoa {
	private String nome;
	private Data dataNasc;
	private int Bi;
	
	public Pessoa(String nome,int Bi, Data dataNasc) {
		this.nome = nome;
		this.Bi = Bi;
		this.dataNasc = dataNasc;
	}
	public String nome() {
		return nome;
	}
	public int Bi() {
		return Bi;
	}
	public Data dataNasc() {
		return dataNasc;
	}
	@Override public String toString() {
		return nome + ", BI: " + Bi + ", Data: " + dataNasc.toString();
	}
	
}
