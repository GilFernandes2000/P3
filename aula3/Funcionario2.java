package aula3;

public class Funcionario2 extends Cliente2 {
	
	private int nfunc;
	private int nif;
	
	public Funcionario2 (String nome, int cc, Data nasc, int nfunc, int nif, int numSocio, Data datainsc) {
		super(numSocio,datainsc, nome, cc, nasc);
		this.nfunc = nfunc;
		this.nif = nif;
	}
	public int nfunc() {
		return nfunc;
	}
	public int nif() {
		return nif;
	}
}
