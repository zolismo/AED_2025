/*
 * Autor: Matheus
 * Data: 13/03/2025
 * Turma: 2024.02
 * Professor: Hélio
 * */

package AED_2025.utils;

//Classe responsável por armazenar os métodos responsável pelos calculos
public class Operacoes{

	//Metodo responsável por buscar o maior número dentro do vetor
	public static int retornaMaiorNumero(int[] vetor_dez_numeros){

		// Variavel responsavel por armazenar o maior número
                int maior_numero = 0;
          	//Loop responsável por encontrar maior numero
               for(int i = 0;i<10;i++){
                  if(maior_numero < vetor_dez_numeros[i]){
                     maior_numero = vetor_dez_numeros[i];
                  }
               }

	       // Retorno do maior número
	       return maior_numero;
	} 


	// Metodo responsável por retornar a soma dos números do vetor
	public static int somaNumeros(int[] vetor_dez_numeros){
		//Variavel responsavel por armazenar a soma dos números armazenados no vetor
		int soma_numeros = 0;
		for(int i=0;i<10;i++){
		    soma_numeros += vetor_dez_numeros[i];
		}

		return soma_numeros;
	}


	// Metódo responsável por retornar a média aritimética
	public static double mediaAritimetica(int soma_numeros){
	   // Variavel responsavel por armazenar a média aritimética
	   // Calculo da média aritimética
	   double media_aritimetica = soma_numeros/10;

	   //Retorno da media aritimetica
	   return media_aritimetica;

	}

	public static void imprimeDados(int[] vetor_dez_numeros, int soma_valores, double media_aritimetica) {
          	//String responsável por impressão dos valores obtidos
          	String resposta = " Maior valor obtido: " + soma_valores + " \n Media aritimética dos valores: " + media_aritimetica + "\n Valor dos vetores em ordem de inserção: ";
          	//Loop responsavel por imprimir por povoar a string resposta com os valores armazenados no vetor
          	for(int i=0;i<10;i++){
             	   resposta += "\n " + vetor_dez_numeros[i];
          	}

		// Saída em texto no console da resposta dos valores obtidos
		System.out.println(resposta);
	}
}
