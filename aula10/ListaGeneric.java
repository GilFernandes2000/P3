package aula10;
import java.util.*;

public class ListaGeneric<T> {
	List<T> list = new LinkedList<T>();
	
	public boolean addElem(T elem) {
		return list.add(elem);
	}
	
	public boolean removaElem(T elem) {
		return list.remove(elem);
	}
	
	public int totalElem() {
		return list.size();
	}
	
	public Iterator iterator() {
		return list.iterator();
	}

	public void addElem(Quadrado quadrado) {
		list.add((T) quadrado);
		
	}
}
