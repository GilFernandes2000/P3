package aula10;
import java.util.Iterator;
import java.lang.Comparable;
import java.util.*;

public class BinarySearchTree<T extends Comparable<? super T>> implements Iterable<T> {
	private static class BTSNode<T>{
		T element;
		BTSNode<T> left;
		BTSNode<T> rigth;
		BTSNode(T theElement){
			element = theElement;
			left = rigth = null;
		}
	}
	private BTSNode<T> root;
	private int numNodes;
	
	public BinarySearchTree() {
		root = null;
		numNodes = 0;
	}
	
	public void insert(T value) {
		root = insert(value,root);
	}
	
	private BTSNode<T> insert(T value, BTSNode<T> root2) {
		if(root2 == null) {
			return new BTSNode<T>(value);
		}
		int compareResult = value.compareTo(root2.element);
		if(compareResult < 0) {
			root2.left = insert(value, root2.left);
		}
		else if(compareResult > 0) {
			root2.rigth = insert(value, root2.rigth);
		}
			return root2;
	}

	public void remove(T value) {
		root = remove(value,root);
	}
	
	private BTSNode<T> remove(T value, BTSNode<T> root2) {
		if(root2 == null) {
			return new BTSNode<T>(value);
		}
		int compareResult = value.compareTo(root2.element);
		if(compareResult < 0) {
			root2.left = remove(value, root2.left);
		}
		else if(compareResult > 0) {
			root2.rigth = remove(value, root2.rigth);
		}
		else {
			if(root2.left == null && root2.rigth == null) {
				return null;
			}
			else if(root2.rigth == null) {
				return root2.left;
			}
			else if(root2.left == null) {
				return root2.rigth;
			}
			else {
				root.element = findMax(root.left);
				root.left = remove(root.element, root.left);
			}
		}
		return root;
	}
	
	private T findMax(BTSNode<T> root) {
		while(root.rigth != null) {
			root = root.rigth;
		}
		return root.element;
	}

	public boolean contains(T value) {
		return valueOf(find(value,root)) != null;
	}
	
	private Object valueOf(Object find) {
		// TODO Auto-generated method stub
		return null;
	}

	private Object find(T value, BTSNode<T> root2) {
		if(root2 == null) {
			return null;
		}
		int compareResult = value.compareTo(root2.element);
		if(compareResult < 0) {
			return find(value, root2.left);
		}
		else if(compareResult > 0) {
			return find(value, root2.rigth);
		}
		else {
			return root2.element;
		}
	}
	
	public int size() {
		return numNodes;
	}

	public Iterator<T> iterator(){
		return new BTSIterator<T>(root);
	}
	
	public class BTSIterator<T> implements Iterator<T>{
		Stack<BTSNode<T>> stack;
		
		public BTSIterator(BTSNode<T> root) {
			stack = new Stack<BTSNode<T>>();
			while(root != null) {
				stack.push(root);
			}
		}
		
		public boolean hasNext() {
			return !stack.isEmpty();
		}
		
		public T next() {
			BTSNode<T> node = stack.pop();
			T result = node.element;
			if(node.rigth != null) {
				node = node.rigth;
				while(node != null) {
					stack.push(node);
					node = node.left;
				}
			}
			return result;
		}
	}
}
