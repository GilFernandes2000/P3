package aula1;
import java.util.*;

public class Ex13 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("val1- ");
		double val1 = sc.nextDouble();
		System.out.print("val2- ");
		double val2 = sc.nextDouble();
		System.out.println("Dando ao raio o valor de 0 esta a optar por um quadrado ou um retangulo");
		System.out.print("raio- ");
		double raio = sc.nextDouble();
		assert raio >=0 :"Invalid Number";
		
		if(raio==0) {
			assert val1>0 :"Invalid Number";
			assert val2>0 :"Invalid Number";
			if(val1 == val2) {
				System.out.println("É um quadrado");
				Quadrado q = new Quadrado(val1);
				System.out.println(q.toString());
				System.out.printf("Perimetro- %2.2f\n", q.periQua());
				System.out.printf("Area- %2.2f\n", q.areaQua());
			}
			else {
				System.out.println("É um retangulo");
				Retangulo r = new Retangulo(val1, val2);
				System.out.println(r.toString());
				System.out.printf("Perimetro- %2.2f\n", r.periRet());
				System.out.printf("Area- %2.2f\n", r.areaRet());
			}
		}
		else {
			Ponto p = new Ponto(val1, val2);
			Circulo c = new Circulo(p, raio);
			System.out.println(c.toString());
			System.out.printf("Perimetro- %2.2f\n", c.periCirc());
			System.out.printf("Area- %2.2f\n", c.areaCirc());
			System.out.println("Crie outro circulo");
			System.out.print("x- ");
			double x = sc.nextDouble();
			System.out.print("y- ");
			double y = sc.nextDouble();
			System.out.print("raio- ");
			double rai = sc.nextDouble();
			assert rai > 0 :"Raio tem de ser positivo";
			Circulo c1 = new Circulo(rai, x, y);
			System.out.println(c1.toString());
			System.out.println("1- Ver se dois circulos sao iguais");
			System.out.println("2- Ver se dois circulos se intersetam");
			System.out.print("op- ");
			int op = sc.nextInt();
			assert op > 0: "opcao invalida";
			do {
				if(op == 1) {
					if(c.circIgual(c1)) {
						System.out.println("Os circulos sao iguais");
					}
					else {
						System.out.println("Os circulos sao diferentes");
					}
				}
				if(op==2) {
					if(c.circInter(c1)) {
						System.out.println("Os circulos intersetam-se");
					}
					else {
						System.out.println("Os circulos nao se intersetam");
					}
				}
				System.out.print("op- ");
				op = sc.nextInt();
			}while(op <=2);
		}
	}
}
