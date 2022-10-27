package entities;

public class Especial extends Conta{
	
	private double limite;

	public Especial(int numero, double limite) {
		super(numero);
		this.limite = limite;
	}

	public Especial(int numero, String cpf, double limite) {
		super(numero, cpf);
		this.limite = limite;
	}

	public Especial(int numero, String cpf, double saldo, boolean ativo, double limite) {
		super(numero, cpf, saldo, ativo);
		this.limite = limite;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	public void usarLimite() {
		
	}
	
	@Override
	public void debito(double valor) {
		if(valor<0.00) {
			System.out.println("Valor negativo, débito não efetuado!");
		}
		else if(valor == 0.00) {
			System.out.println(("Valor zerado, débito não executado!"));
		}
		else if(valor > (this.saldo+this.limite)) {
			System.out.println("Saldo indisponivel");
		}
		else if (valor > this.saldo && valor < (this.saldo+this.limite)){
			System.out.println("Usando valor do limite...");
			this.limite = (this.saldo+limite)-valor;
			this.saldo = 0.00;
		} else {
			this.saldo = this.saldo - valor;
		}
		
	}
	
	
	
}
