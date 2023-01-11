package br.com.ebac.mod10;

import java.util.Locale;
import java.util.Scanner;

public class Notas {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.ENGLISH);
		
		
		double somaNotas = 0;
		
		
		
		for(int i = 1; i <= 4; i++) {
			System.out.println("Digite a "+i+" nota!");
			double nota = scan.nextDouble();
			somaNotas += nota;
			
			
		}
		
		scan.close();
		
		
		double media = somaNotas/4;
		
		System.out.println(media);
		
		if(media >= 7) {
			System.out.println("Voce está aprovado!");
		}else if(media >= 5) {
			System.out.println("Voce está de recuperacao!");
		}else {
			System.out.println("Voce está reprovado!");
		}
		
		
		
	}

}
