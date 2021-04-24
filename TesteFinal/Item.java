package Teste;

import java.util.*;

public class Item {
	
	private String ISBN;
	private String titulo;
	private int prazo;
	private int copias;
	
	public Item(String ISBN, String titulo, int prazo, int copias) {
		this.ISBN = ISBN;
		this.titulo = titulo;
		this.prazo = prazo;
		this.copias = copias;
	}
	
	public Item(String ISBN, String titulo) {
		this.ISBN = ISBN;
		this.titulo = titulo;
		prazo = 7;
		copias = 1;
	}
	
	public String getISBN() {
		return ISBN;
	}
}
