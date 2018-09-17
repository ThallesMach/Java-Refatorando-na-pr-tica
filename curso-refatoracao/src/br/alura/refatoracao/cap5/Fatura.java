package br.alura.refatoracao.cap5;

public class Fatura {

	private double valorMensal;
	private String cliente;

	public Fatura() {}

	public Fatura(double valorMensal, String cliente) {
		this.valorMensal = valorMensal;
		this.cliente = cliente;
	}
	public double getValorMensal() {
		return valorMensal;
	}
	public void setValorMensal(double valorMensal) {
		this.valorMensal = valorMensal;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	
	public double convertValor(double taxa) {
		return valorMensal * taxa;
	}
	
	public double emDolar() {
		return convertValor(2.7);
	}
	
	public double emReal() {
		return convertValor(1.0);
	}
	
}
