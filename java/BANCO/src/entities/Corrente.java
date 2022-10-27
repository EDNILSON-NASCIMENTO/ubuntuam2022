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
			System.out.println("Valor negativo não é possivel!!!");
		}
		else if(qtdeTalao==0) {
			System.out.println("Valor zerado!!!");
		}
		else if(qtdeTalao > this.contadorTalao) {
			System.out.println("Qtde de talões indisponivel!!!");
		} else {
			if((qtdeTalao*30)>super.getSaldo()) {
				System.out.println("Sem saldo em conta para emissão de talão");
			} else {
				super.debito((qtdeTalao*30));
				System.out.println("Emitindo talões...");
				this.contadorTalao = this.contadorTalao - qtdeTalao;
				System.out.println("Talões disponiveis : "+this.contadorTalao);
			}
		}
	}
	
}
