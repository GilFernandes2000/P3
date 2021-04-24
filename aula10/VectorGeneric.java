package aula10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class VectorGeneric<T> {
	List<T> list;
	public VectorIterator iterator;
	public VectorGeneric() {
		list = new ArrayList<>();
		iterator = new VectorIterator();
	}
	
	public boolean addElem(T elem) {
		return list.add(elem);
	}
	
	public boolean removeElem(T elem) {
		return list.remove(elem);
	}
	
	public int totalPessoas() {
		return list.size();
	}
	public <T extends Figura> Double sumArea(List<T> list) {
		double sumArea = 0;
		for(int i = 0; i < list.size();i++) {
			sumArea = sumArea + list.get(i).area();
		}
		return sumArea;
	}
	public <T> void printSet(List<T> list) {
		for(int i = 0; i <list.size(); i++) {
			System.out.println(list.get(i).toString());
		}
	}
	public Iterator iterator(){
		return iterator;
	}
	
	private class VectorIterator implements Iterator<T>{
		public int indice;
		VectorIterator(){
			indice = 0;
		}
		
		public boolean hasNext() {
			return (indice < totalPessoas());
		}
		
		public T next() {
			if(hasNext()) {
				indice++;
				T r = list.get(indice);
				return r;
			}
			throw new IndexOutOfBoundsException("só "+ totalPessoas() + "elementos");
		}
		
		public void remove() {
			throw new UnsupportedOperationException("Operação nao suportada");
		}
	}
}
