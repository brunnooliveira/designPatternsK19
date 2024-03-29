package br.com.bgdo.designpatterns.structural.decorator;

public class TesteEmissorDecorator {
	public static void main(String[] args) {
		String mensagem = "Testando Decorator...";
		Emissor emissorCript = new EmissorDecoratorComCriptografia(
				new EmissorBasico());
		emissorCript.envia(mensagem);
		Emissor emissorCompr = new EmissorDecoratorComCompressao(
				new EmissorBasico());
		emissorCompr.envia(mensagem);
		Emissor emissorCriptCompr = new EmissorDecoratorComCriptografia(
				new EmissorDecoratorComCompressao(new EmissorBasico()));
		emissorCriptCompr.envia(mensagem);
	}
}
