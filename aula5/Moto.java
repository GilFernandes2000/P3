package aula5;

public class Moto extends Veiculo{
	public Moto(Data ano, String matr, String corB, int rodas, int cilindrada, int veloMax) {
		super(ano,matr,corB,rodas,cilindrada,veloMax);
	}
	
	@Override
	public String toString() {
		return "Moto!\n" + super.toString();
	}
}
