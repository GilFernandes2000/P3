package aula2;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class SopaLetras {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[]args)throws IOException {
		String[] linhas = new String[10];
		String[] words = new String[6];
		int count = -1;
		
		System.out.print("Ficheiro: ");
		String s = sc.nextLine();
		
		File f = new File(s);
		
		Scanner scf = new Scanner(f);
		
		while(scf.hasNextLine()) {
			String t;
		
			while(linhas.length!=10) {
				count++;
				t = scf.nextLine();
				linhas[count] = t;
				
			}
				
		
		}
		
		scf.close();
		
		words[0] = "list";
		words[1] = "set";
		words[2] = "top";
		words[3] = "graph";
		words[4] = "stack";
		words[5] = "queue";
		
		
		
		
		ResolverSopa(linhas, words);
	}
	
	public static void ResolverSopa(String[] linhas, String[] words) {
		ArrayList<String> coluna = new ArrayList<String>();
		ArrayList<String> vertical = new ArrayList<String>();
		int count = 0;
		int c2 = -1;
		int x1;
		boolean b = false;
		while(count!=words.length) {
			
			for(int i=0; i<linhas.length; i++) {
				if(linhas[i].contains(words[count])) {
					x1 = linhas[i].indexOf(words[count]);
					System.out.print(words[count] + "	" + i + ", " + x1 + "	left");
					count++;
					b = true;
					break;
				}else if( linhas[i].contains(reverse(words[count]))){
					x1 = linhas[i].indexOf(words[count]);
					System.out.print(words[count] + "	" + i + ", " + x1 + "	right");
					count++;
					b = true;
					break;
				}
				
			}
			if(b = false) {
				vertical.add(words[count]);
				count++;
			}
		}
			count = 0;
			
			for(int j=0; j<linhas.length; j++) {
				String t = "";
				for(int i=0; i<linhas.length; i++) {
					t+= linhas[i].charAt(j);
				}
				coluna.add(t);
			}
			
			for(int i=0; i<linhas.length; i++) {
				if(linhas[i].contains(coluna.get(count))) {
					x1 = linhas[i].indexOf(coluna.get(count));
					System.out.print(coluna.get(count) + "	" + i + ", " + x1 + "	down");
					count++;
				}else if(linhas[i].contains(reverse(coluna.get(count)))){
					x1 = linhas[i].indexOf(coluna.get(count));
					System.out.print(coluna.get(count) + "	" + i + ", " + x1 + "	up");
					count++;
				}
			}
		
			
		
	}
	
	public static String reverse(String t) {
		String p = "";
		for(int i=t.length()-1; i>=0; i--) {
			p = p + t.charAt(i);
		}
		
		return p;
	}
}
