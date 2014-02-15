package br.com.bgdo.designpatterns.creational.abstractfactory.concreteproduct;

import br.com.bgdo.designpatterns.creational.abstractfactory.abstractproduct.Receptor;

public class ReceptorVisa implements Receptor {
	public String recebe() {
		System.out.println(" Recebendo mensagem da Visa . ");
		String mensagem = " Mensagem da Visa ";
		return mensagem;
	}
}
