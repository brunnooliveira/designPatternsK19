package br.com.bgdo.designpatterns.creational.builder.product;

import java.util.Calendar;

public interface Boleto {
	String getSacado();

	String getCedente();

	double getValor();

	Calendar getVencimento();

	int getNossoNumero();

	String toString();
}
