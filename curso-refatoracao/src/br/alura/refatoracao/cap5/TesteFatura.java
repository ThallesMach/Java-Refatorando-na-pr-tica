package br.alura.refatoracao.cap5;

public class TesteFatura {

	public static void main(String[] args) {
		
		Fatura fatura = new Fatura();
		double valor1 = fatura.emReal();
		double valor2 = fatura.emDolar();
		
		System.out.println("Em Dolar "+ valor1);
		System.out.println("Em Real "+ valor2);
	}

}
