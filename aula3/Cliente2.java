package aula3;
import java.time.LocalDate;
import java.util.*;

public class Cliente2 {
	private int numSocio;
	private Data insc;
	private String nome;
	private int cc;
	private Data dataNasc;
	private ArrayList<Film2> historico;
	
	public Cliente2 (int numSocio, Data insc, String nome, int cc, Data dataNasc) {
		this.numSocio = numSocio;
		this.insc = insc;
		this.nome = nome;
		this.cc = cc;
		this.dataNasc = dataNasc;
		historico = new ArrayList<>();
	}
	public int numSocio() {
		return numSocio;
	}
	public Data insc() {
		return insc;
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
	public int getIdade() {
		LocalDate localDate = LocalDate.now();
		int year = localDate.getYear();
		int idade = year - dataNasc.ano();
		return idade;
	}
	public Film2[] historico() {
		return historico.toArray(new Film2[0]);
	}
}
