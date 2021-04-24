package Teste;

import java.time.LocalDate;

public class Investigador extends Utilizador{
	
	private TipoUtil util;
	
	public Investigador(String nome, int nmec, LocalDate data) {
		super(nome,nmec,data);
		util = TipoUtil.Investigador;
	}

	@Override
	public String toString() {
		return util + ", " + super.toString();
	}
}
