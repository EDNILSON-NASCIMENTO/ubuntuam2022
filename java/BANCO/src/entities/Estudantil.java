package entities;

public class Estudantil extends Conta {

	private double limiteEstudantil;

	public Estudantil(int numero, double limiteEstudantil) {
		super(numero);
		this.limiteEstudantil = limiteEstudantil;
	}

	public Estudantil(int numero, String cpf, double limiteEstudantil) {
		super(numero, cpf);
		this.limiteEstudantil = limiteEstudantil;
	}

	public Estudantil(int numero, String cpf, double saldo, boolean ativo, double limiteEstudantil) {
		super(numero, cpf, saldo, ativo);
		this.limiteEstudantil = limiteEstudantil;
	}

	public double getLimiteEstudantil() {
		return limiteEstudantil;
	}

	public void setLimiteEstudantil(double limiteEstudantil) {
		this.limiteEstudantil = limiteEstudantil;
	}
	
	
	@Override
	public void debito(double valor) {
		if(valor<0.00) {
			System.out.println("Valor negativo, débito não efetuado!");
		}
		else if(valor == 0.00) {
			System.out.println(("Valor zerado, débito não executado!"));
		}
		else if(valor > (this.saldo+this.limiteEstudantil)) {
			System.out.println("Saldo indisponivel");
		}
		else if (valor > this.saldo && valor < (this.saldo+this.limiteEstudantil)){
			System.out.println("Usando valor do limite...");
			this.limiteEstudantil = (this.saldo+limiteEstudantil)-valor;
			this.saldo = 0.00;
		} else {
			this.saldo = this.saldo - valor;
		}
	
	}
	
	public void usarLimite(double valor) {
		if(valor<0.00) {
			System.out.println("Valor negativo, credito não efetuado!");
		}
		else if(valor == 0.00) {
			System.out.println(("Valor zerado, credito não executado!"));
		}
		else if (limiteEstudantil==0.00) {
			System.out.println("Você não tem saldo de emprestimo disponivel!!!");
		}
		else if(valor> limiteEstudantil) {
			System.out.println("Valor solicitador maior que o disponivel para emprestimo!!!");
		}
		else {
			this.limiteEstudantil = this.limiteEstudantil-valor;
			super.credito(valor);
		}
	}
	
	
	
	
}
