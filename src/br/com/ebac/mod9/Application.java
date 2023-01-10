package br.com.ebac.mod9;

public class Application {

	public static void main(String[] args) {
		
		long codigo = 12314325l;
		
		
		System.out.println("O codigo é: " + codigo);
		System.out.println("Convertendo  para wrapper...");
		
		Long codigoWrapper = Long.valueOf(codigo);
		
		System.out.println("Conversao para wrapper finalizada, codigo : " + codigoWrapper);
		
		System.out.println("Agora vamos fazer um casting para double");
		
		double casting = codigo;
		
		System.out.println("Casting finalizado: " + casting);
		
		
		

	}

}
