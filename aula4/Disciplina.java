package aula4;
import java.util.*;

public class Disciplina{
	private String nomDis;
	private String areaCi;
	private int ects;
	private Professor responsavel;
	private ArrayList<Estudante1> alunos;
	
	public Disciplina(String nomDis, String areaCi, int ects, Professor responsavel){
		this.responsavel = responsavel;
		this.nomDis = nomDis;
		this.areaCi = areaCi;
		this.ects = ects;
		alunos = new ArrayList<>();
	}
	
	
	public boolean addAluno(Estudante1 est) {
		if(alunos.contains(est)) {
			return false;
		}
		return alunos.add(est);
	}
	
	public boolean delAluno(int Nmec) {
		for(Estudante1 estudante : getAlunos()) {
			if(estudante.nMec() == Nmec) {
				return alunos.remove(estudante);			}
		}
		return false;
	}
	
	public boolean alunoInscrito(int Nmec) {
		for(Estudante1 estudante : getAlunos()) {
			if(estudante.nMec() == Nmec) {
				return true;
			}
		}
		return false;
	}
	
	public int numAlunos() {
		return alunos.size();
	}
	public String toString() {
		return "Disciplina: "+nomDis+", Area cientifica: "+areaCi+", ECTs: "+ ects +responsavel.toString();
	}
	public Estudante1[] getAlunos() {
		return alunos.toArray(new Estudante1[0]);
	}
	public Estudante1[] getAlunos(String tipo) {
		ArrayList<Estudante1> al = new ArrayList<>();
		for(Estudante1 estudante : getAlunos()) {
			if(estudante.getClass().toString().contains(tipo)) {
				al.add(estudante);
			}
		}
		return al.toArray(new Estudante1[0]);
	}
}
