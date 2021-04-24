package aula5;
import java.util.*;
import java.io.*;

public class CSV implements AgendaFormat{
	
	public Pessoa[] lerFic(String fic) throws IOException{
		Scanner ler = new Scanner(new File(fic));
		ArrayList<Pessoa> lista = new ArrayList<>();
		ler.nextLine();
		while(ler.hasNextLine()) {
			String[] linha= ler.nextLine().split("\t");
			String[] date = linha[2].split("/");
			lista.add(new Pessoa(linha[1], Integer.parseInt(linha[2]), new Data(Integer.parseInt(date[0]), Integer.parseInt(date[1]), Integer.parseInt(date[2]))));
		}
		ler.close();
		return lista.toArray(new Pessoa[0]);
	}
	
	public void escreveFic(String fic, Pessoa[] pessoas) throws IOException{
		PrintWriter pw = new PrintWriter(new File(fic));
		pw.println("CSV");
		for(int i = 0; i<pessoas.length; i++) {
			pw.println(pessoas[i].toString());
		}
	}
}
