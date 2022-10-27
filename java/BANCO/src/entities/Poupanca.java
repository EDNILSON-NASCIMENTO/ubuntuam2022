package entities;

public class Poupanca extends Conta {
	
	private int diaAniversarioPoupanca;

	public Poupanca(int numero, int diaAniversarioPoupanca) {
		super(numero);
		this.diaAniversarioPoupanca = diaAniversarioPoupanca;
	}

	public Poupanca(int numero, String cpf, int diaAniversarioPoupanca) {
		super(numero, cpf);
		this.diaAniversarioPoupanca = diaAniversarioPoupanca;
	}

	public Poupanca(int numero, String cpf, double saldo, boolean ativo, int diaAniversarioPoupanca) {
		super(numero, cpf, saldo, ativo);
		this.diaAniversarioPoupanca = diaAniversarioPoupanca;
	}

	public int getDiaAniversarioPoupanca() {
		return diaAniversarioPoupanca;
	}

	public void setDiaAniversarioPoupanca(int diaAniversarioPoupanca) {
		this.diaAniversarioPoupanca = diaAniversarioPoupanca;
	}
	
	
	public void correcao(int dia) {
		if(dia<0) {
			System.out.println("Não existe dia negativo");
		}
		else if(dia==0) {
			System.out.println("Não existe dia 0");
		} 
		else if (dia>31) {
			System.out.println("O limite de dias é de 1 a 31!!!");
		} 
		else {
			if(dia == this.diaAniversarioPoupanca) {
				super.credito((super.getSaldo()*0.005));
				System.out.println("Correção monetária executada com sucesso!");
			}
		}
	}
	
	
	
	
	
	
	
}
