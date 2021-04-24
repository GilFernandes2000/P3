package aula10;

import java.util.*;

public class VectorPessoas {
	List<Pessoa> list;
	public VectorIterator iterator;
	public VectorPessoas() {
		list = new ArrayList<>();
		iterator = new VectorIterator();
	}
	
	public boolean addPessoa(Pessoa p) {
		return list.add(p);
	}
	
	public boolean removePessoa(Pessoa p) {
		return list.remove(p);
	}
	
	public int totalPessoas() {
		return list.size();
	}
	
	public Iterator iterator(){
		return iterator;
	}
	
	private class VectorIterator implements Iterator<Object>{
		public int indice;
		VectorIterator(){
			indice = 0;
		}
		
		public boolean hasNext() {
			return (indice < totalPessoas());
		}
		
		public Object next() {
			if(hasNext()) {
				indice++;
				Object r = list.get(indice);
				return r;
			}
			throw new IndexOutOfBoundsException("só "+ totalPessoas() + "elementos");
		}
		
		public void remove() {
			throw new UnsupportedOperationException("Operação nao suportada");
		}
	}
}
