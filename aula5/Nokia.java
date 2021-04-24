package aula5;
import java.util.*;
import java.io.*;

public class Nokia implements AgendaFormat{
	
	public Pessoa[] lerFic(String fic) throws IOException{
		Scanner ler = new Scanner(new File(fic));
		ler.nextLine(); //salta primeira linha pois é o titulo
		ArrayList<Pessoa> lista = new ArrayList<>();
		while(ler.hasNextLine()) {
			String nome = ler.nextLine();
			int contacto = Integer.parseInt(ler.nextLine());
			String[] date = ler.nextLine().split("/");
			lista.add(new Pessoa(nome, contacto, new Data(Integer.parseInt(date[0]),Integer.parseInt(date[1]), Integer.parseInt(date[2]))));
			if(ler.hasNextLine()) {
				ler.nextLine();
			}
		}
		ler.close();
		return lista.toArray(new Pessoa[0]);
	}
	
	public void escreveFic(String fic, Pessoa[] pessoas) throws IOException{
		PrintWriter pw = new PrintWriter(new File(fic));
		pw.println("Nokia");
		for(int i = 0; i< pessoas.length; i++) {
			pw.println(pessoas[i].toString());
		}
		pw.close();
	}
}
