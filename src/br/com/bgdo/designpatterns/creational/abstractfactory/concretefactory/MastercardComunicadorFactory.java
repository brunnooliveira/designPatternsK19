package br.com.bgdo.designpatterns.creational.abstractfactory.concretefactory;

import br.com.bgdo.designpatterns.creational.abstractfactory.abstractfactory.ComunicadorFactory;
import br.com.bgdo.designpatterns.creational.abstractfactory.abstractproduct.Emissor;
import br.com.bgdo.designpatterns.creational.abstractfactory.abstractproduct.Receptor;
import br.com.bgdo.designpatterns.creational.abstractfactory.creator.EmissorCreator;
import br.com.bgdo.designpatterns.creational.abstractfactory.creator.ReceptorCreator;

public class MastercardComunicadorFactory implements ComunicadorFactory {
	
	/**
	 * Utilizando o FactoryMethod para criação de Emissores e Receptores 
	 */
	private EmissorCreator emissorCreator = new EmissorCreator();
	private ReceptorCreator receptorCreator = new ReceptorCreator();

	public Emissor createEmissor() {
		return emissorCreator.create(EmissorCreator.MASTERCARD);
	}

	public Receptor createReceptor() {
		return receptorCreator.create(ReceptorCreator.MASTERCARD);
	}
}
