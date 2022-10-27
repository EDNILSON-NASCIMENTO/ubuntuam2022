package entities;

public class Corrente  extends Conta{
	
	private int contadorTalao;

	public Corrente(int numero, int contadorTalao) {
		super(numero);
		this.contadorTalao = contadorTalao;
	}

	public Corrente(int numero, String cpf, int contadorTalao) {
		super(numero, cpf);
		this.contadorTalao = contadorTalao;
	}

	public Corrente(int numero, String cpf, double saldo, boolean ativo, int contadorTalao) {
		super(numero, cpf, saldo, ativo);
		this.contadorTalao = contadorTalao;
	}

	public int getContadorTalao() {
		return contadorTalao;
	}

	public void setContadorTalao(int contadorTalao) {
		this.contadorTalao = contadorTalao;
	}
	
	public void pediTalao(int qtdeTalao) {
		if(qtdeTalao<0) {
			System.out.println("Valor negativo n�o � possivel!!!");
		}
		else if(qtdeTalao==0) {
			System.out.println("Valor zerado!!!");
		}
		else if(qtdeTalao > this.contadorTalao) {
			System.out.println("Qtde de tal�es indisponivel!!!");
		} else {
			if((qtdeTalao*30)>super.getSaldo()) {
				System.out.println("Sem saldo em conta para emiss�o de tal�o");
			} else {
				super.debito((qtdeTalao*30));
				System.out.println("Emitindo tal�es...");
				this.contadorTalao = this.contadorTalao - qtdeTalao;
				System.out.println("Tal�es disponiveis : "+this.contadorTalao);
			}
		}
	}
	
}
