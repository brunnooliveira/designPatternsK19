package br.com.bgdo.designpatterns.creational.abstractfactory.concreteproduct;

import br.com.bgdo.designpatterns.creational.abstractfactory.abstractproduct.Receptor;

public class ReceptorMastercard implements Receptor {
	public String recebe() {
		System.out.println(" Recebendo mensagem da Mastercard . ");
		String mensagem = " Mensagem da Mastercard ";
		return mensagem;
	}
}
