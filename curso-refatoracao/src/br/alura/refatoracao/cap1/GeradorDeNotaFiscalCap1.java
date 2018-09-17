package br.alura.refatoracao.cap1;


//import br.alura.refatoracao.cap1.EnviadorDeEmail;

public class GeradorDeNotaFiscalCap1 {

	public NotaFiscal gera(Fatura fatura) {

		NotaFiscal nf = geraNF(fatura);

		new enviadorDeEmailCap1().enviaEmail(nf);	// enviaEmail(nf);
		
		new NFDao().salvaNoBanco(nf);	// salvaNoBanco(nf);

		return nf;
	}



	private NotaFiscal geraNF(Fatura fatura) {

		double valor = fatura.getValorMensal();
		double imposto = 0;
		if(valor < 200) {
			imposto = valor * 0.03;
		}
		else if(valor > 200 && valor <= 1000) {
			imposto = valor * 0.06;
		}
		else {
			imposto = valor * 0.07;
		}
		
		NotaFiscal nf = new NotaFiscal(valor, imposto);
		return nf;
	}
}