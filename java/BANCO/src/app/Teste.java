package app;

import java.util.Locale;
import java.util.Scanner;

import entities.Corrente;
import entities.Especial;
import entities.Poupanca;

public class Teste {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		Poupanca cp1 = new Poupanca(100,1);
		Corrente cc1 = new Corrente(233,3);
		Especial ce1 = new Especial(467,1000.00);
		char tipo=' ';
		double valor=0.00;
		char op=' ';
		int auxQtde=0;
		char tipoConta=' ';
		int auxDia=0;	
		
		System.out.println("ESCOLHA O TIPO DE CONTA");
		System.out.print("1 - Conta Poupança\n2 - Conta Corrente\n3 - Conta Especial\nDigite opção: ");
		tipoConta = leia.next().charAt(0);
		if(tipoConta == '1') {
			System.out.println("MOVIMENTAÇÃO BANCARIA");
			for(int x=1; x<=10; x++) {
				System.out.println("SALDO CONTA R$ "+cp1.getSaldo());
				System.out.println("MOVIMENTO :"+x);
				System.out.print("[D]ébito ou [C]rédito :");
				tipo = leia.next().toUpperCase().charAt(0);
				System.out.print("Qual o valor R$ : ");
				valor = leia.nextDouble();
				if(tipo=='D') {
					cp1.debito(valor);
				} else if(tipo =='C') {
					cp1.credito(valor);
				} else {
					System.out.println("Opção incorreta!!!");
				}
				System.out.print("Continua S/N :");
				op = leia.next().toUpperCase().charAt(0);
				if(op=='N') {
					break;
				}
			}
			System.out.println("Saldo R$ : "+cp1.getSaldo());
			System.out.println("Digite o numero do dia de hoje: ");
			auxDia = leia.nextInt();
			cp1.correcao(auxDia);
			System.out.println("Saldo final R$ : "+cp1.getSaldo());		
			
		} 
		else if (tipoConta == '2') {
			System.out.println("MOVIMENTAÇÃO BANCARIA");
			for(int x=1; x<=10; x++) {
				System.out.println("SALDO CONTA R$ "+cc1.getSaldo());
				System.out.println("MOVIMENTO :"+x);
				System.out.print("[D]ébito ou [C]rédito :");
				tipo = leia.next().toUpperCase().charAt(0);
				System.out.print("Qual o valor R$ : ");
				valor = leia.nextDouble();
				if(tipo=='D') {
					cc1.debito(valor);
				} else if(tipo =='C') {
					cc1.credito(valor);
				} else {
					System.out.println("Opção incorreta!!!");
				}
				System.out.print("Continua S/N :");
				op = leia.next().toUpperCase().charAt(0);
				if(op=='N') {
					break;
				}
			}
			System.out.println("Saldo final R$ : "+cc1.getSaldo());
			System.out.print("Deseja talão de cheque S/N: ");
			op = leia.next().toUpperCase().charAt(0);
			if(op=='S') {
				System.out.println("Quantidade de talos [1 a 3 cada um é R$ 30.00] :");
				auxQtde = leia.nextInt();
				cc1.pediTalao(auxQtde);
				System.out.println("Saldo atual conta R$ :"+cc1.getSaldo());
			}

		}
		else if (tipoConta == '3') {
			System.out.println("MOVIMENTAÇÃO BANCARIA");
			for(int x=1; x<=10; x++) {
				System.out.println("SALDO CONTA R$ "+ce1.getSaldo()+" Limite atual :"+ce1.getLimite());
				System.out.println("MOVIMENTO :"+x);
				System.out.print("[D]ébito ou [C]rédito :");
				tipo = leia.next().toUpperCase().charAt(0);
				System.out.print("Qual o valor R$ : ");
				valor = leia.nextDouble();
				if(tipo=='D') {
					
					ce1.debito(valor);
					
				} else if(tipo =='C') {
					ce1.credito(valor);
				} else {
					System.out.println("Opção incorreta!!!");
				}
				System.out.print("Continua S/N :");
				op = leia.next().toUpperCase().charAt(0);
				if(op=='N') {
					break;
				}
			}
			System.out.println("Saldo final R$ : "+ce1.getSaldo());
		}
				
	}

}
