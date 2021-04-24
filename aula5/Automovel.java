package aula5;

public class Automovel extends Veiculo{
	public Automovel(Data ano, String matr, String corB, int rodas, int cilindrada, int veloMax) {
		super(ano,matr,corB,rodas,cilindrada,veloMax);
	}
	
	@Override
	public String toString() {
		return "Automovel!\n" + super.toString();
	}
}
