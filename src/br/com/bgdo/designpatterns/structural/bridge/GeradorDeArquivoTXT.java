package br.com.bgdo.designpatterns.structural.bridge;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class GeradorDeArquivoTXT implements GeradorDeArquivo {
	public void gera(String conteudo) {
		try {
			PrintStream saida = new PrintStream(" arquivo . txt ");
			saida.println(conteudo);
			saida.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
