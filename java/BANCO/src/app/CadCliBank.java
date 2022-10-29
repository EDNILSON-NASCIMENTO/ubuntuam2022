package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Conta;
import entities.Corrente;
import entities.Empresa;
import entities.Especial;
import entities.Estudantil;
import entities.Poupanca;

public class CadCliBank {

	public static void main(String[] args) {
		
		
		Scanner leia = new Scanner(System.in);
		
		List <Conta> clientes = new ArrayList<>();
		
		//exemplo
		
		Poupanca cp1 = new Poupanca(1,"xxx.xxx.xxx-xx",0.00,true,1);
		char continua;
		do {
			System.out.println("Digite o tipo de conta :");
			System.out.print("1 - Conta Poupança\n2 - Conta Corrente\n3 - Conta Especial\n4 - Conta Empresa\n5 - Conta Esdutandil\nDigite opção: ");
			char op = leia.next().charAt(0);
			System.out.println("Digite o numero da conta : ");
			int numero = leia.nextInt();
			System.out.println("Digite o cpf da conta : ");
			String cpf = leia.next();
			if(op =='1') {
				System.out.print("Digite o dia de aniversário da conta : ");
				int diaAniversarioConta = leia.nextInt();
				clientes.add(new Poupanca(numero,cpf,diaAniversarioConta));
			}
			else if(op == '2') {
				System.out.println("Digite o limite de talões do seu banco :");
				int qtdeTalao = leia.nextInt();
				clientes.add(new Corrente(numero,cpf,qtdeTalao));
			}
			else if(op == '3') {
				System.out.println("Digite o valor do limite:");
				double limite = leia.nextDouble();
				clientes.add(new Especial(numero,cpf,limite));
			}
			else if(op == '4') {
				System.out.println("Digite o valor do limite emprestimo:");
				double limiteEmprestimo = leia.nextDouble();
				clientes.add(new Empresa(numero,cpf,limiteEmprestimo));
			}
			else if(op == '5') {
				System.out.println("Digite o valor do limite estudantil:");
				double limiteEstudantil = leia.nextDouble();
				clientes.add(new Estudantil(numero,cpf,limiteEstudantil));
			}

			System.out.print("Deseja cadastra mais contas S/N :");
			continua = leia.next().toUpperCase().charAt(0);
		} while (continua!='N');
		
		System.out.println("LISTAGE DE CONTAS");
		System.out.println("NUMERO\tCPF\tSALDO");
		for(Conta cli : clientes) {
			System.out.println(cli.getNumero()+"\t"+cli.getCpf()+"\t"+cli.getSaldo());
		}
		
		
				
		

	}

}
