package aula4;

public class Estudante1 extends Pessoa{
	private int nmec = 100;
	private Data dataInsc;
	
	public Estudante1(String nome, int Bi, Data dataNasc, Data dataInsc) {
		super(nome, Bi, dataNasc);
		this.nmec = nmec++;
		this.dataInsc = dataInsc;
	}
	
	public Estudante1(String nome, int Bi, Data dataNasc) {
		this(nome, Bi, dataNasc, new Data());
	}
	
	public int nMec() {
		return nmec;
	}
	public Data dataInsc() {
		return dataInsc;
	}
	
	@Override
	public String toString() {
		return super.toString()+", nmec: "+nmec+", Data de inscricao: "+dataInsc;
	}
}
