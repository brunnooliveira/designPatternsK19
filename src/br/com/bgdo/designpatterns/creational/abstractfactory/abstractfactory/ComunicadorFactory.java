package br.com.bgdo.designpatterns.creational.abstractfactory.abstractfactory;

import br.com.bgdo.designpatterns.creational.abstractfactory.abstractproduct.Emissor;
import br.com.bgdo.designpatterns.creational.abstractfactory.abstractproduct.Receptor;

public interface ComunicadorFactory {
	Emissor createEmissor();

	Receptor createReceptor();
}
