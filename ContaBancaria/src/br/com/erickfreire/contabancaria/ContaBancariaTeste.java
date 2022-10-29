package br.com.erickfreire.contabancaria;

import java.util.Scanner;

public class ContaBancariaTeste {

	public static void main(String[] args) {
		ContaBancaria conta1 = new ContaBancaria("Joao Silva", 50.00);
		ContaBancaria conta2 = new ContaBancaria("Maria Fernandes", -7.53);
		
		Scanner entrada = new Scanner(System.in);
		double valorDeposito;
		
		System.out.printf("O saldo do Cliente %s é de %.2f%n", conta1.getNome(), conta1.getSaldo());
		System.out.printf("O saldo da Cliente %s é de %.2f%n", conta2.getNome(), conta2.getSaldo());
		
		System.out.print("Informe um valor para despositar na conta 1: ");
		valorDeposito = entrada.nextDouble();		
		
		System.out.printf("Despositando o valor %.2f na conta 1%n", valorDeposito);
		
		conta1.deposita(valorDeposito);
		
		System.out.printf("O saldo do Cliente %s é de %.2f%n", conta1.getNome(), conta1.getSaldo());
		System.out.printf("O saldo da Cliente %s é de %.2f%n", conta2.getNome(), conta2.getSaldo());
		
		System.out.print("Informe um valor para despositar na conta 2: ");
		valorDeposito = entrada.nextDouble();		
		
		System.out.printf("Despositando o valor %.2f na conta 2%n", valorDeposito);
		
		conta2.deposita(valorDeposito);
		
		System.out.printf("O saldo do Cliente %s é de %.2f%n", conta1.getNome(), conta1.getSaldo());
		System.out.printf("O saldo da Cliente %s é de %.2f%n", conta2.getNome(), conta2.getSaldo());	
		
		
		
	}

}
