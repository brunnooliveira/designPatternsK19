package br.com.bgdo.designpatterns.behavioral.visitor;

public class Gerente extends Funcionario {
	private String senha;

	public Gerente(String nome, double salario, String senha) {
		super(nome, salario);
		this.senha = senha;
	}

	public String getSenha() {
		return senha;
	}

	@Override
	public void aceita(AtualizadorDeFuncionario atualizador) {
		atualizador.atualiza(this);
	}
}
