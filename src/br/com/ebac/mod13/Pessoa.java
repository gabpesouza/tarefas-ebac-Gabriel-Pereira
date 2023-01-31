package br.com.ebac.mod13;

public abstract class Pessoa {

	private String nome;
	private String sexo;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public void imprimir(Pessoa pessoa) {
		if(pessoa instanceof PessoaFisica) {
			PessoaFisica pessoaFisica = (PessoaFisica) pessoa;
			System.out.println("Imprimindo dados de pessoa fisica....");
			System.out.println("Nome: " + pessoaFisica.getNome());
			System.out.println("Sexo: "+ pessoaFisica.getSexo());
			System.out.println("Cpf: "+ pessoaFisica.getCpf());
		}else {
			PessoaJuridica pessoaJuridica = (PessoaJuridica) pessoa;
			System.out.println("Imprimindo dados de pessoa juridica....");
			System.out.println("Nome: " + pessoaJuridica.getNome());
			System.out.println("Sexo: "+ pessoaJuridica.getSexo());
			System.out.println("Cnpj: "+ pessoaJuridica.getCnpj());
			
		}
	}
	
}
