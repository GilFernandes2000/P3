package aula3;

public class PesadoPassageiros extends Veiculo{
	public PesadoPassageiros(Condutor c) {
		super(c, new Carta("D"), 30, 300, 400, 4000);
	}
	@Override
	public String toString() {
		return super.toString();
	}
}
