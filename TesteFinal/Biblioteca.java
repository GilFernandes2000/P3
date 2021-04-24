package Teste;

import java.util.*;
import java.time.LocalDate;
import java.util.Iterator;


public class Biblioteca {
	
	private String nome;
	Set<Utilizador> utilizadores;
	Set<Item> items;
	
	public Biblioteca (String nome) {
		this.nome = nome;
		utilizadores = new HashSet<>();
		items = new HashSet<>();
	}
	
	public boolean empresta(Item item, Utilizador u, LocalDate devol) {
		Set<Emprestimo> uItems= u.getItems();
		if(items.contains(item)) {
			items.remove(item);
			return uItems.add(new Emprestimo(item, LocalDate.now(), devol));
		}
		return false;
	}
	
	public boolean empresta(String ISBN, int nmec) {
		
	}
	
	public boolean novoUtilizador(Utilizador u) {
		return utilizadores.add(u);
	}
	
	public boolean novoItem(Item item) {
		return items.add(item);
	}
	
	public boolean devolve(Item item, Utilizador u) {
		if(utilizadores.contains(u)) {
			Set<Emprestimo> uItems= u.getItems();
			if(uItems.contains(new Emprestimo(item, u.getNmec()))) {
				uItems.remove(new Emprestimo(item, u.getNmec()));
				return items.add(item);
			}
			return false;
		}
		return false;
	}

	public Iterator<Utilizador> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
}
