package br.com.bgdo.designpatterns.creational.factorymethod.concreteproduct;

import br.com.bgdo.designpatterns.creational.factorymethod.product.Emissor;

public class EmissorSMS implements Emissor {
	public void envia(String mensagem) {
		System.out.println(" Enviando por SMS a mensagem : ");
		System.out.println(mensagem);
	}
}
