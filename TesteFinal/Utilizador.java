package Teste;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
public class Utilizador {
	
	private int nmec;
	private String nome;
	private LocalDate data;
	private Set<Emprestimo> items;
	
	
	public Utilizador(String nome, int nmec, LocalDate data) {
		this.nome = nome;
		this.nmec = nmec;
		this.data = data;
		items = new HashSet<>();
	}
	
	public Set<Emprestimo> getItems(){
		return items;
	}
	
	public int getNmec() {
		return nmec;
	}
	
	@Override
	public String toString() {
		return nome +", inscrito em " + data +  items.size() +" emprestimos correntes";
	}
}
