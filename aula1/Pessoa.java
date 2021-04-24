package aula1;

public class Pessoa {
	private String nome;
	private int cc;
	private Data dataNasc;
	
	public Pessoa(String nom, int cc, int dia, int mes, int ano) {
		nom = this.nome;
		cc = this.cc;
		dataNasc = new Data(dia, mes, ano);
	}
	public String nome(){
		return nome;
	}
	public int cc() {
		return cc;
	}
	public Data dataNasc() {
		return dataNasc;
	}
	public String toString() {
		return nome+" - "+cc+" - "+dataNasc;
	}
}
