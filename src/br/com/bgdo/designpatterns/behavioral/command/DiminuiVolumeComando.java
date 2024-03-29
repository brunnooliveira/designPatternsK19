package br.com.bgdo.designpatterns.behavioral.command;

public class DiminuiVolumeComando implements Comando {
	private Player player;
	private int levels;

	public DiminuiVolumeComando(Player player, int levels) {
		this.player = player;
		this.levels = levels;
	}

	public void executa() {
		this.player.decreaseVolume(this.levels);
	}
}
