package aula3;
import java.util.*;

public class Film2 {
	private int ID;
	private String titulo;
	private String categoria;
	private	String idade;
	private boolean av;
	private int rateTotal;
	private int rateAv;
	private int numClients;
	
	public Film2(int ID, String titulo, String categoria, String idade) {
		this.ID = ID;
		this.titulo = titulo;
		this.categoria = categoria;
		this.idade = idade;
		assert idade == "ALL" || idade == "M6" || idade == "M12" || idade == "M16" || idade == "M18";
		this.av = true;
		this.rateTotal = 0;
		this.rateAv = 0;
		this.numClients = 0;
	}
	public int ID() {
		return ID;
	}
	public String titulo() {
		return titulo;
	}
	public String categoria() {
		return categoria;
	}
	public String idade() {
		return idade;
	}
	public boolean av() {
		return av;
	}
	public void rentFilm() {
		av = false;
		numClients++;
	}
	public void returnFilm(int r) {
		av = true;
		rate(r);
	}
	public int rateAv() {
		return rateAv;
	}
	public void rate(int r) {
		rateTotal += r;
		rateAv = Math.min(Math.max((int)Math.round((double)rateTotal/(double)numClients), 0), 10);
	}
}
