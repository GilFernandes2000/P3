package Teste;

import java.time.LocalDate;

public class Professor extends Utilizador{
	
	private TipoUtil util;
	
	public Professor(String nome, int nmec, LocalDate data) {
		super(nome,nmec,data);
		util = TipoUtil.Professor;
		
	}
	
	@Override
	public String toString() {
		return util + ", " + super.toString();
	}
}
