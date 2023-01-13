package br.com.ebac.mod11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		List<String> masculino = new ArrayList<>();
		List<String> feminino = new ArrayList<>();
		
		System.out.println("Digite o numero de pessoas que vai informar o sexo e o nome.");
		int n = scan.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Digite o nome e o sexo da "+ i + " pessoa, separado por virgula!");
			String informacao = scan.next();
			String[] informacoes = informacao.split(",");
			
			if(informacoes[1].equalsIgnoreCase("feminino")) {
				feminino.add(informacoes[0]);
			}else {
				masculino.add(informacoes[0]);
			}
		}
		
		scan.close();
		System.out.println("Lista do genero masculino");
		System.out.println(masculino);
		
		System.out.println("Lista do genero feminino");
		System.out.println(feminino);
		
		
	}

}
