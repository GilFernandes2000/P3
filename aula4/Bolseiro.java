package aula4;

public class Bolseiro extends Estudante1 {
	private int bolsa;
	
	public Bolseiro(String nome, int Bi, Data dataNasc, Data dataInsc) {
		super(nome, Bi, dataNasc, dataInsc);
	}
	public Bolseiro(String nome, int Bi, Data dataNasc) {
		super(nome, Bi, dataNasc);
	}
	public int bolsa() {
		return bolsa;
	}
	public void setBolsa(int bolsa) {
		this.bolsa = bolsa;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", Bolsa: " + bolsa;
	}
}
