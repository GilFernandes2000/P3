package Teste;
import java.time.LocalDate;

public class Emprestimo {
	
	private Item item;
	private LocalDate emprestimo;
	private LocalDate devolucao;
	private int nmec;
	
	public Emprestimo(Item item, LocalDate emprestimo, LocalDate devolucao) {
		this.item = item;
		this.emprestimo = emprestimo;
		this.devolucao = devolucao;
	}
	
	public Emprestimo(Item i, int nmec) {
		this.item = item;
		this.nmec = nmec;
	}
	public Item getItem() {
		return item;
	}
}
