
/* 
    Autor: Matheus Reis Santana
    Data: 13/03/2025
    Turma: 2024.02
    Professor: Hélio
*/

package AED_2025;

import java.util.Random;
import AED_2025.utils.Operacoes;

class Main{

  public static void main(String args[]){
  
	  // Criando uma instancia da classe responsavel por gerar valores aleatorios
	  Random gerador = new Random();

	  // Criando uma instância do vetor responsavel por armazenar os dados
	  int[] vetor_dez_numeros = new int[10];

	  // Loop responsável por povoar o vetor
	  for(int i = 0; i<10;i++){
	  
	      vetor_dez_numeros[i] = gerador.nextInt(400);
	 
	  }
          
	  int maior_numero = Operacoes.retornaMaiorNumero(vetor_dez_numeros);	  
  }

}
