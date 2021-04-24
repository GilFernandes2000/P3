package aula3;

public class Estudante2 extends Cliente2 {
	
	private int nmec;
	private String curso;
	
	public Estudante2 (String nome, int cc, Data nasc , int nmec, String curso, int numSocio, Data datainsc) {
		super(numSocio, datainsc, nome, cc, nasc);
		this.nmec = nmec;
		this.curso = curso;
	}
	
	public int nmec() {
		return nmec;
	}
	public String curso() {
		return curso;
	}
}
