package aula5;

public class Veiculo {
	private Data ano;
	private String matricula;
	private String corBase;
	private int numRodas;
	private int cilindrada;
	private int veloMax;
	private int ID = 1;
	
	public Veiculo(Data ano, String matricula, String corBase, int numRodas, int cilindrada, int veloMax) {
		this.ano = ano;
		this.matricula = matricula;
		this.corBase = corBase;
		this.numRodas = numRodas;
		this.cilindrada = cilindrada;
		this.veloMax = veloMax;
		ID++;
	}
	public Data ano() {return ano;}
	public String matricula() {return matricula;}
	public String corBase() {return corBase;}
	public int numRodas() {return numRodas;}
	public int cilindrada() {return cilindrada;}
	public int veloMax() {return veloMax;}
	public int getId() {return ID;}
	
	@Override
	public String toString() {
		return "Ano: "+ano+", Matricula: "+matricula+", cor base: "+corBase+", Numero de Rodas: "+numRodas+", Cilindrada: "+cilindrada+", Velocidade Maxima: "+veloMax;
	}
}
