package br.com.bgdo.designpatterns.creational.factorymethod.creator;

import br.com.bgdo.designpatterns.creational.factorymethod.concreteproduct.EmissorEmail;
import br.com.bgdo.designpatterns.creational.factorymethod.concreteproduct.EmissorJMS;
import br.com.bgdo.designpatterns.creational.factorymethod.concreteproduct.EmissorSMS;
import br.com.bgdo.designpatterns.creational.factorymethod.product.Emissor;

public class EmissorCreator {
	public static final int SMS = 0;
	public static final int EMAIL = 1;
	public static final int JMS = 2;

	public Emissor create(int tipoDeEmissor) {
		if (tipoDeEmissor == EmissorCreator.SMS) {
			return new EmissorSMS();
		} else if (tipoDeEmissor == EmissorCreator.EMAIL) {
			return new EmissorEmail();
		} else if (tipoDeEmissor == EmissorCreator.JMS) {
			return new EmissorJMS();
		} else {
			throw new IllegalArgumentException(
					" Tipo de emissor não suportado ");
		}
	}
}
