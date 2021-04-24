package aula4;

public class Professor extends Pessoa{
	private int numfunc = 1;
	private Data Admissao;
	
	public Professor(String nome, int BI, Data dataNasc) {
		super(nome, BI, dataNasc);
		this.numfunc = numfunc++;
		this.Admissao = new Data();
	}
	
	public int numfunc() {
		return numfunc;
	}
	
	public Data Admissao() {
		return Admissao;
	}
	@Override
	public String toString() {
		return super.toString() + ", Numero de Funcionario: "+numfunc+", Data de admissao: "+Admissao;
	}
}
