package br.com.ebac.mod12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		List<String> pessoas = new ArrayList<>();
		List<String> masculino = new ArrayList<>();
		List<String> feminino = new ArrayList<>();

		
		
		System.out.println("************* PARTE 1 *************");
		
		System.out.println("Digite o nome das pessoas separado por virgula!");
		
		String nomes = scan.next();
		
		
	
		String[] arrayNomes = nomes.split(",");
		
		for(String nome : arrayNomes) {
			pessoas.add(nome);
		}
		
		Collections.sort(pessoas);
		
		System.out.println(pessoas);
		
		System.out.println("************* PARTE 2 *************");
		
		System.out.println("Digite o nome das pessoas e o sexo ex:gabriel-m,gabriela-f separados  por virgula!");
		
		String nomes2 = scan.next();
		
		String[] arrayNomes2 = nomes2.split(",");
		for(String string : arrayNomes2) {
			if(string.split("-")[1].equalsIgnoreCase("m") || string.split("-")[1].equalsIgnoreCase("masculino")) {
				masculino.add(string.split("-")[0]);
			}else {
				feminino.add(string.split("-")[0]);
			}
		}
		
		
		System.out.println("*** exibindo lista do sexo masculino***");
		
		masculino.forEach(nome -> System.out.println(nome));
		
		System.out.println("*** exibindo lista do sexo feminino***");
		
		feminino.forEach(nome -> System.out.println(nome));
		
		
		scan.close();
			
			
		}
		
		
	}


