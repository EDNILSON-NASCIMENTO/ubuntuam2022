package entities;

public class Empresa extends Conta{
	private double emprestimoEmpresa;

	public Empresa(int numero, double emprestimoEmpresa) {
		super(numero);
		this.emprestimoEmpresa = emprestimoEmpresa;
	}
	
	

	public Empresa(int numero, String cpf, double emprestimoEmpresa) {
		super(numero, cpf);
		this.emprestimoEmpresa = emprestimoEmpresa;
	}




	public double getEmprestimoEmpresa() {
		return emprestimoEmpresa;
	}

	public void setEmprestimoEmpresa(double emprestimoEmpresa) {
		this.emprestimoEmpresa = emprestimoEmpresa;
	}
	
	@Override
	public void debito(double valor) {
		if(valor<0.00) {
			System.out.println("Valor negativo, d�bito n�o efetuado!");
		}
		else if(valor == 0.00) {
			System.out.println(("Valor zerado, d�bito n�o executado!"));
		}
		else if(valor > (this.saldo+this.emprestimoEmpresa)) {
			System.out.println("Saldo indisponivel");
		}
		else if (valor > this.saldo && valor < (this.saldo+this.emprestimoEmpresa)){
			this.emprestimoEmpresa = (this.saldo+emprestimoEmpresa)-valor;
			this.saldo = 0.00;
		} else {
			this.saldo = this.saldo - valor;
		}
	
	}
	
	public void pedirEmprestimo(double valor) {
		if(valor<0.00) {
			System.out.println("Valor negativo, credito n�o efetuado!");
		}
		else if(valor == 0.00) {
			System.out.println(("Valor zerado, credito n�o executado!"));
		}
		else if (emprestimoEmpresa==0.00) {
			System.out.println("Voc� n�o tem saldo de emprestimo disponivel!!!");
		}
		else if(valor> emprestimoEmpresa) {
			System.out.println("Valor solicitador maior que o disponivel para emprestimo!!!");
		}
		else {
			this.emprestimoEmpresa = this.emprestimoEmpresa-valor;
			super.credito(valor);
		}
	}
	
	
}
