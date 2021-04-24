package aula5;


public class Pessoa {
	private String nome;
	private Data dataNasc;
	private int Bi;
	private int contacto;
	
	public Pessoa(String nome,int Bi, Data dataNasc, int contacto) {
		this.nome = nome;
		this.Bi = Bi;
		this.dataNasc = dataNasc;
		this.contacto = contacto;
	}
	public Pessoa(String nome, int contacto, Data dataNasc) {
		this.nome = nome;
		this.dataNasc = dataNasc;
		this.contacto = contacto;
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
	public int contacto() {
		return contacto;
	}
	@Override 
	public String toString() {
		return nome + ", Contacto: " + contacto + ", Data: " + dataNasc.toString();
	}
	
}
