package entities;

public class Estudantil extends Conta{

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
	
	
}
