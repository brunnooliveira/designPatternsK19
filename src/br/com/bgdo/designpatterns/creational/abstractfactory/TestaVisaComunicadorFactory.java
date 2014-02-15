package br.com.bgdo.designpatterns.creational.abstractfactory;

import br.com.bgdo.designpatterns.creational.abstractfactory.abstractfactory.ComunicadorFactory;
import br.com.bgdo.designpatterns.creational.abstractfactory.abstractproduct.Emissor;
import br.com.bgdo.designpatterns.creational.abstractfactory.abstractproduct.Receptor;
import br.com.bgdo.designpatterns.creational.abstractfactory.concretefactory.VisaComunicadorFactory;

public class TestaVisaComunicadorFactory {
	public static void main(String[] args) {
		ComunicadorFactory comunicadorFactory = new VisaComunicadorFactory();
		String transacao = " Valor =560; Senha =123 ";
		Emissor emissor = comunicadorFactory.createEmissor();
		emissor.envia(transacao);
		Receptor receptor = comunicadorFactory.createReceptor();
		String mensagem = receptor.recebe();
		System.out.println(mensagem);
	}
}
