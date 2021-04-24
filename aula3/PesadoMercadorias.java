package aula3;

public class PesadoMercadorias extends Veiculo{
	public PesadoMercadorias(Condutor c) {
		super(c, new Carta("C"), 2, 40, 400, 4000);
	}
	@Override
	public String toString() {
		return super.toString();
	}
}
