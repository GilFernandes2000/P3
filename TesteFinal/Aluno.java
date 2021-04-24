package Teste;

import java.time.LocalDate;

public class Aluno extends Utilizador{
	
	private TipoUtil util;
	
	public Aluno(String nome, int nmec, LocalDate data) {
		super(nome,nmec,data);
		util = TipoUtil.Aluno;

	}
	
	@Override
	public String toString() {
		return util + ", " + super.toString();
	}
}
