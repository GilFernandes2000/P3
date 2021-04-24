package aula3;
import java.time.*;
import java.util.*;

public class Ex22 {
	public static int numSocio = 0;
	static Scanner sc = new Scanner(System.in);
	static ArrayList<Cliente2> cli = new ArrayList<>();
	static ArrayList<Film2> filmes = new ArrayList<>();
	
	public static void main(String[] args) {
		
		while(true)	{
			int op = -1;
			System.out.println("		Menu:		");
			System.out.println("1- Adicionar cliente");
			System.out.println("2- Remover cliente");
			System.out.println("3- Pesquisar videos para cliente");
			System.out.println("4- Adicionar filme");
			System.out.println("5- Remover filme");
			System.out.println("6- Disponibilidade de filme");
			System.out.println("7- Alugar filme");
			System.out.println("8- Devolver filme");
			System.out.println("9- Print do Catalogo de filmes");
			System.out.println("10- Print do catalago por rating");
			System.out.println("11- Historico de filmes do cliente");
			System.out.println("0- sair do programa");
			System.out.println("Opcao: ");
			op = sc.nextInt();
			if(op == 1) addCliente();
			if(op == 2) removeCli();
			if(op == 3) { 
				System.out.print("CC do cliente: ");
				int clicc = sc.nextInt();
				videosVer(clicc);
			}
			if(op == 4) addFilm();
			if(op == 5) removeFilm();
			if(op == 6) {
				System.out.print("ID do filme: ");
				int filmid = sc.nextInt();
				filmAv(filmid);
			}
			if(op == 7) checkIn();
			if(op == 8) checkOut();
			if(op == 9) printCat();
			if(op == 10) printPorRat();
			if(op == 11) cliHistory();
			if(op == 0) break;
			
		}
	}

	
	public static void addCliente() {
		numSocio++;
		System.out.print("Estudante ou Funcionario?");
		String fe = sc.nextLine();
		if(fe.toUpperCase()=="E") {
			addEst();
		}
		else if(fe.toUpperCase()=="F"){
			addFunc();
		}
	}
	public static void addEst(){
		System.out.print("Nome: ");
		String nom = sc.nextLine();
		System.out.print("CC: ");
		int cc = sc.nextInt();
		System.out.print("Data de Nascimento: ");
		String dn = sc.nextLine();
		System.out.print("Nmec: ");
		int nm = sc.nextInt();
		System.out.print("Curso: ");
		String cur = sc.nextLine();
		LocalDate localDate = LocalDate.now();
		Data d = new Data(localDate.getDayOfMonth(), localDate.getMonth().getValue(), localDate.getYear());
		Estudante e = new Estudante(nom, cc, dn, nm, cur, numSocio, d);
		cli.add(e);
	}
	
	public static void addFunc(){
		System.out.print("Nome: ");
		String nom = sc.nextLine();
		System.out.print("CC: ");
		int cc = sc.nextInt();
		System.out.print("Data de Nascimento: ");
		String dn = sc.nextLine();
		System.out.print("Numero de funcionario: ");
		int nf = sc.nextInt();
		System.out.print("NIF: ");
		int nif = sc.nextInt();
		LocalDate localDate = LocalDate.now();
		Data d = new Data(localDate.getDayOfMonth(), localDate.getMonth().getValue(), localDate.getYear());
		Funcionario f = new Funcionario(nom, cc, dn, nf, nif, numSocio, d);
		cli.add(f);
	}
	
	public static void addFilm() {
		System.out.print("ID: ");
		int id = sc.nextInt();
		System.out.print("Titulo: ");
		String ti = sc.nextLine();
		System.out.print("Categoria: ");
		String cat = sc.nextLine();
		System.out.print("Idade: ");
		String idade = sc.nextLine();
		Film2 f = new Film2(id, ti, cat, idade);
		filmes.add(f);
	}
	
	public static void removeFilm() {
		System.out.print("ID do film:");
		int id = sc.nextInt();
		for(int i = 0; i<filmes.size();i++) {
			if(filmes.get(i).ID() == id ) {
				filmes.remove(filmes.get(i));
			}
		}
	}
	public static void removeCli() {
		System.out.print("CC do cliente: ");
		int cc = sc.nextInt();
		for(int i = 0; i<cli.size();i++) {
			if(cli.get(i).cc() == cc ) {
				cli.remove(cli.get(i));
			}
		}
	}
	public static void videosVer(int cc) {
		for(int j = 0; j<cli.size();j++) {
			if(cli.get(j).cc() == cc ) {
				int idade = cli.get(j).getIdade();
				for(int i = 0; i<filmes.size(); i++) {
					if(filmes.get(i).idade()=="ALL") {
						System.out.println(filmes.get(i));
					}
					if(filmes.get(i).idade()=="M6" && idade > 6) {
						System.out.println(filmes.get(i));
					}
					if(filmes.get(i).idade()=="M12" && idade > 12) {
						System.out.println(filmes.get(i));
					}
					if(filmes.get(i).idade()=="M16" && idade > 16) {
						System.out.println(filmes.get(i));
					}
					if(filmes.get(i).idade()=="M18" && idade > 18) {
						System.out.println(filmes.get(i));
					}
				}
			}
		}
	}
	public static void filmAv(int id) {
		for(int i = 0; i<filmes.size(); i++) {
			if(filmes.get(i).ID() == id) {
				if(filmes.get(i).av()) {
					System.out.print("Filme disponivel");
				}
				else {
					System.out.print("Filme aao disponivel");
				}
			}
		}
	}
	
	public static void checkOut() {
		System.out.print("Id do film: ");
		int id = sc.nextInt();
		for(int i = 0; i<filmes.size(); i++) {
			if(filmes.get(i).ID() == id) {
				filmes.get(i).rentFilm();
			}
		}
	}
	
	public static void checkIn() {
		System.out.print("Id do film: ");
		int id = sc.nextInt();
		for(int i = 0; i<filmes.size(); i++) {
			if(filmes.get(i).ID() == id) {
				System.out.print("Avalia o filme: ");
				int r = sc.nextInt();
				assert r > 0 && r <=10;
				filmes.get(i).returnFilm(r);
			}
		}
	}
	
	public static void printCat() {
		for(int i = 0; i<filmes.size(); i++) {
			System.out.println(filmes.get(i));
		}
	}
	public static Film2[] arrFilm() {
		return filmes.toArray(new Film2[0]);
	}
	public static void printPorRat() {
		Film2[] sortedFilms = arrFilm().clone();
		Arrays.sort(sortedFilms, new Comparator<Film2>() {

			@Override
			public int compare(Film2 o1, Film2 o2) {
				int i = -2;
				if(o1.rateAv() > o2.rateAv()) {
					i = -1;
				}
				else if(o1.rateAv() > o2.rateAv()) {
					i = 1;
				}
				else {
					i = 0;
				}
				return i;
			}
			
		});
		for(Film2 filmes : sortedFilms) {
			System.out.println(filmes);
		}
	}
	public static void cliHistory() {
		System.out.print("CC do cliente: ");
		int cc = sc.nextInt();
		for(int i = 0; i<cli.size();i++) {
			if(cli.get(i).cc() == cc ) {
				cli.get(i).historico();
			}
		}
	}
}
