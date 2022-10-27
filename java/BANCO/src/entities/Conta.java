package entities;

public abstract class Conta {
	
	private int numero;
	private String cpf;
	protected double saldo;
	private boolean ativo;
	
	public Conta(int numero) {
		this.numero = numero;
	}

	public Conta(int numero, String cpf) {
		this.numero = numero;
		this.cpf = cpf;
	}

	public Conta(int numero, String cpf, double saldo, boolean ativo) {
		super();
		this.numero = numero;
		this.cpf = cpf;
		this.saldo = saldo;
		this.ativo = ativo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSaldo() {
		return saldo;
	}
/*
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
*/
	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	
	public void credito(double valor) {
		if(valor<0.00) {
			System.out.println("Valor negativo, credito não efetuado!");
		}
		else if(valor == 0.00) {
			System.out.println(("Valor zerado, credito não executado!"));
		}
		else {
			this.saldo = this.saldo + valor;
		}
		
	}
	
	public void debito(double valor) {
		if(valor<0.00) {
			System.out.println("Valor negativo, débito não efetuado!");
		}
		else if(valor == 0.00) {
			System.out.println(("Valor zerado, débito não executado!"));
		}
		else if(valor > this.saldo) {
			System.out.println("Saldo indisponivel");
		}
		else {
			this.saldo = this.saldo - valor;
		}
		
	}
	
}
