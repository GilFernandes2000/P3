package aula5;

public class AutomovelPolicia extends Automovel implements Policia{
	
	public AutomovelPolicia(Data ano, String matricula, String cor, int rodas, int cilindrada, int velo) {
		super(ano, matricula, cor, rodas, cilindrada, velo);
	}
	
	public ServicoEmergencia getTipo() {
		return ServicoEmergencia.GNR;
	}
	
	@Override
	public String toString() {
		return "Carro de Policia" + super.toString();
	}
}
