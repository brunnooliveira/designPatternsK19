package br.com.bgdo.designpatterns.creational.abstractfactory.concreteproduct;

import br.com.bgdo.designpatterns.creational.abstractfactory.abstractproduct.Emissor;

public class EmissorVisa implements Emissor {
	public void envia(String mensagem) {
		System.out.println(" Enviando a seguinte mensagem para a Visa : ");
		System.out.println(mensagem);
	}
}
