import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int numero;
		
		System.out.println("Digite um numero : ");
		numero = leia.nextInt();
		if(numero<0) {
			System.out.println("Numero negativo");
		}
		else if(numero==0) {
			
		}
		else if((numero%2)==0){
			System.out.println("Numero par");
		} 
		else {
			System.out.println("Numero impar");
		}
		

	}

}
