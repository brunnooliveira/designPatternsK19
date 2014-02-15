package br.com.bgdo.designpatterns.structural.proxy;

public interface Conta {
	void deposita(double valor);

	void saca(double valor);

	double getSaldo();
}
