package aula5;
import java.util.*;
import java.io.*;

public class Agenda {
	
	private ArrayList<Pessoa> agenda = new ArrayList<>();
	
	public void load(String fic) throws IOException{
		Scanner ler  = new Scanner(new File(fic));
		String format = ler.nextLine();
		ler.close();
		AgendaFormat form = null;
		if(format.equals("Nokia")) {
			form = new Nokia();
		}
		else if(format.equals("vCard")) {
			form = new vCard();
		}
		else if(format.equals("CSV")) {
			form = new CSV();
		}
		addCont(form.lerFic(fic));
	}
	
	public void addCont(Pessoa[] pessoas) {
		for(Pessoa p: pessoas) {
			addContacto(p);
		}
	}
	
	public void addContacto(Pessoa p) {
		agenda.add(p);
	}
	
	public void escreveFic(String fic, AgendaFormat format) throws IOException{
		format.escreveFic(fic, agendaToArray());
	}
	
	public Pessoa[] agendaToArray() {
		return agenda.toArray(new Pessoa[0]);
	}
	
	public boolean removeContact(Pessoa p) {
		if(!agenda.contains(p)) {
			return false;
		}
		return agenda.remove(p);
	}
	
	@Override
	public String toString() {
		return agenda.toString();
	}
}
