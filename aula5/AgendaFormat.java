package aula5;
import java.io.*;

public interface AgendaFormat {
	
	public Pessoa[] lerFic(String Fic) throws IOException;
	public void escreveFic(String fic, Pessoa[] pessoas) throws IOException;
}
