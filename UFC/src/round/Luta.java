package round;

import java.util.Random;

public class Luta {
	private Lutador desafiado;
	private Lutador desafiante;
	private int rounds;
	private boolean aprovada;
	
	public void marcarLuta(Lutador l1 ,Lutador l2) {
		if(l1.getCategoria() == l2.getCategoria() && l1 != l2) {
			this.aprovada = true;
			this.desafiado = l1;
			this.desafiante = l2;
		}else {
			this.aprovada = false;
			this.desafiado = null;
			this.desafiante = null;
		}
	}
	public void lutar() {
		if(this.aprovada) {
			System.out.println("### DESAFIADO ###");
			this.desafiado.apresentar();
			System.out.println("### DESAFIANTE ###");
			this.desafiante.apresentar();
			
			Random aleatorio = new Random();
			
			
			int vencedor = aleatorio.nextInt(3);
			System.out.println();
			System.out.print("RESULTADO DA LUTA: ");
			switch(vencedor) { 
			case 0://empate
				System.out.println("Empatou!");
				this.desafiado.empatarLuta();
				this.desafiante.empatarLuta();
				break;
			case 1://desafiado vence
				System.out.println("vit�ria do "+this.desafiado.getNome());
				this.desafiado.ganharLuta();
				this.desafiante.perderLuta();
				break;
			case 2://desafiante vence
				System.out.println("vit�ria do "+this.desafiante.getNome());
				this.desafiado.perderLuta();
				this.desafiante.ganharLuta();
				
				break;
			}
			
		}else {
			System.out.println("A luta n�o poder� acontecer!");
		}
	}
	private Lutador getDesafiado() {
		return desafiado;
	}
	private void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}
	private Lutador getDesafiante() {
		return desafiante;
	}
	private void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}
	private int getRounds() {
		return rounds;
	}
	private void setRounds(int rounds) {
		this.rounds = rounds;
	}
	private boolean getAprovada() {
		return aprovada;
	}
	private void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}
		
	
	
}
