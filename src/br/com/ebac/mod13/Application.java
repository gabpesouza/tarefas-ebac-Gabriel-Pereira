package br.com.ebac.mod13;

public class Application {

	public static void main(String[] args) {
		
		Pessoa pessoa1 = new PessoaFisica();
		pessoa1.setNome("Gabriel");
		pessoa1.setSexo("Masculino");
		PessoaFisica pf = (PessoaFisica) pessoa1;
		pf.setCpf("33333333-33");
		
		Pessoa pessoa2 = new PessoaJuridica();
		pessoa2.setNome("Rafael");
		pessoa2.setSexo("Masculino");
		PessoaJuridica pj = (PessoaJuridica) pessoa2;
		pj.setCnpj("33333333-01001");
		
		pessoa1.imprimir(pessoa1);
		System.out.println("***************");
		pessoa2.imprimir(pessoa2);
		
		
	}

}
