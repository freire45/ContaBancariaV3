package br.com.erickfreire.contabancaria;

public class ContaBancaria {
	
	private String nome;
	private double saldo;
	
	
	
	public ContaBancaria(String nome, double saldo) {		
		this.nome = nome;
		
		if(saldo > 0.0)
		   this.saldo = saldo;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSaldo() {
		return saldo;
	}
	
	public void deposita(double deposito) {
		if(deposito > 0.0) {
			saldo = saldo + deposito;
		}		
	}	
	

}
