package aula5;

public class Bicicleta extends Veiculo{
	public Bicicleta(Data ano, String matr, String corB, int rodas, int cilindrada, int veloMax) {
		super(ano,matr,corB,rodas,cilindrada,veloMax);
	}
	
	@Override
	public String toString() {
		return "Bicicleta!\n" + super.toString();
	}
}
