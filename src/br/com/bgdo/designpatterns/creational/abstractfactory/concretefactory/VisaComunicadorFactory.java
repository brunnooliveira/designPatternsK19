package br.com.bgdo.designpatterns.creational.abstractfactory.concretefactory;

import br.com.bgdo.designpatterns.creational.abstractfactory.abstractfactory.ComunicadorFactory;
import br.com.bgdo.designpatterns.creational.abstractfactory.abstractproduct.Emissor;
import br.com.bgdo.designpatterns.creational.abstractfactory.abstractproduct.Receptor;
import br.com.bgdo.designpatterns.creational.abstractfactory.creator.EmissorCreator;
import br.com.bgdo.designpatterns.creational.abstractfactory.creator.ReceptorCreator;

public class VisaComunicadorFactory implements ComunicadorFactory {
	private EmissorCreator emissorCreator = new EmissorCreator();
	private ReceptorCreator receptorCreator = new ReceptorCreator();

	public Emissor createEmissor() {
		return emissorCreator.create(EmissorCreator.VISA);
	}

	public Receptor createReceptor() {
		return receptorCreator.create(ReceptorCreator.VISA);
	}
}
