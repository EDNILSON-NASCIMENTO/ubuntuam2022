import java.util.Scanner;

public class Terceiro {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numeroInteiro = 0;
		double numeroReal = 0.0;
		char caracter =' ';
		String cadeiaCaracter = "";
		
		System.out.print("Digite um Numero Inteiro: ");
		numeroInteiro = leia.nextInt();
		System.out.print("Digite um Numero Real: ");
		numeroReal = leia.nextDouble();
		System.out.print("Digite um Caracter: ");
		caracter = leia.next().charAt(0);
		System.out.print("Digite uma String: ");
		cadeiaCaracter = leia.next();

		
		System.out.println("O Numero Inteiro digitado foi: "+ numeroInteiro);
		System.out.println("O Numero Real digitado foi: "+ numeroReal);
		System.out.println("O Caracter digitado foi: "+ caracter);
		System.out.println("A String digitada foi: "+ cadeiaCaracter);

	}

}
