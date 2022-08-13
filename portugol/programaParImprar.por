programa
{
	
	funcao inicio()
	{
		//variavies
		inteiro totalPares=0
		inteiro totalImpares=0
		inteiro contadorPrimos=0
		inteiro totalPrimos=0

		//entradas +processamentos
		para(inteiro x=1; x<=100; x++)
		{

			se(x%2==0)
			{
				totalPares = totalPares + x
			}
			senao {
				totalImpares = totalImpares + x
			}
			// descobrir se é primo
			
			
			
		}
		escreva("\nTotal de numeros pares é ", totalPares)
		escreva("\nTotal de numeros impares é ", totalImpares)
		//saidas
		
	}
	
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 357; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */