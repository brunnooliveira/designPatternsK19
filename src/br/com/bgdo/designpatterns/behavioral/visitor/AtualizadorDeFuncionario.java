package br.com.bgdo.designpatterns.behavioral.visitor;

public interface AtualizadorDeFuncionario {
	void atualiza(Gerente g);

	void atualiza(Telefonista t);
}
