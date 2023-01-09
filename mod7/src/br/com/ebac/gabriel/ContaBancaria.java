package br.com.ebac.gabriel;

/**
 * Classe simples que representa uma conta bancária
 * @author Gabriel
 *
 */



public class ContaBancaria {
	
	private String titular;
	private int numeroDaConta;
	private int agenciaBancaria;
	private double saldo;
	private double limite;
	
	
	public ContaBancaria(String titular, int numeroDaConta, int agenciaBancaria, double saldo, double limite) {
		super();
		this.titular = titular;
		this.numeroDaConta = numeroDaConta;
		this.agenciaBancaria = agenciaBancaria;
		this.saldo = saldo;
		this.limite = limite;
	}


	public String getTitular() {
		return titular;
	}


	public void setTitular(String titular) {
		this.titular = titular;
	}


	public int getNumeroDaConta() {
		return numeroDaConta;
	}


	public void setNumeroDaConta(int numeroDaConta) {
		this.numeroDaConta = numeroDaConta;
	}


	public int getAgenciaBancaria() {
		return agenciaBancaria;
	}


	public void setAgenciaBancaria(int agenciaBancaria) {
		this.agenciaBancaria = agenciaBancaria;
	}


	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


	public double getLimite() {
		return limite;
	}


	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	public void sacar(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
		}
		else {
			throw new IllegalArgumentException("Valor a sacar maior que o saldo da conta");
		}
		
	}
	
	
	
	
	
	
	

}
