package br.com.bgdo.designpatterns.structural.bridge;

public class TesteRecibo {
	public static void main(String[] args) {
		GeradorDeArquivo geradorDeArquivoTXT = new GeradorDeArquivoTXT();
		Documento recibo = new Recibo(" K19 Treinamentos ", " Marcelo Martins ",
				1000, geradorDeArquivoTXT);
		recibo.geraArquivo();

	}
}
