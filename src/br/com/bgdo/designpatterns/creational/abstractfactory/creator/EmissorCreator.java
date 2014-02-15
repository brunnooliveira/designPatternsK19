package br.com.bgdo.designpatterns.creational.abstractfactory.creator;

import br.com.bgdo.designpatterns.creational.abstractfactory.abstractproduct.Emissor;
import br.com.bgdo.designpatterns.creational.abstractfactory.concreteproduct.EmissorMastercard;
import br.com.bgdo.designpatterns.creational.abstractfactory.concreteproduct.EmissorVisa;

public class EmissorCreator {
	public static final int VISA = 0;
	public static final int MASTERCARD = 1;

	public Emissor create(int tipoDoEmissor) {
		if (tipoDoEmissor == EmissorCreator.VISA) {
			return new EmissorVisa();
		} else if (tipoDoEmissor == EmissorCreator.MASTERCARD) {
			return new EmissorMastercard();
		} else {
			throw new IllegalArgumentException(
					" Tipo de emissor não suportado ");
		}
	}
}
