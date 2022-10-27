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

	public Empresa(int numero, String cpf, double saldo, boolean ativo, double emprestimoEmpresa) {
		super(numero, cpf, saldo, ativo);
		this.emprestimoEmpresa = emprestimoEmpresa;
	}

	public double getEmprestimoEmpresa() {
		return emprestimoEmpresa;
	}

	public void setEmprestimoEmpresa(double emprestimoEmpresa) {
		this.emprestimoEmpresa = emprestimoEmpresa;
	}
	
	
	
}
