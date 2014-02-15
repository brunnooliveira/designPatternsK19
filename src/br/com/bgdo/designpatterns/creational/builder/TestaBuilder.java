package br.com.bgdo.designpatterns.creational.builder;

import br.com.bgdo.designpatterns.creational.builder.builder.BBBoletoBuilder;
import br.com.bgdo.designpatterns.creational.builder.director.GeradorDeBoleto;
import br.com.bgdo.designpatterns.creational.builder.product.Boleto;

public class TestaBuilder {
	
	public static void main(String[] args) {
		GeradorDeBoleto gerador = new GeradorDeBoleto(new BBBoletoBuilder());
		Boleto boleto = gerador.geraBoleto();
		System.out.println(boleto.toString());
	}

}
