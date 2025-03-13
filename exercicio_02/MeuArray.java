
/*
 * Autor:Matheus Reis Santana
 * Turma: 2024.01
 * Professor:Hélio
 * Data: 13/03/2025
 * */

package exercicio_02;

// Classe responsável por implementar o metodo de adicionar mais um
public class MeuArray{

  // Variavel que verifica se o valor já foi ordenado
  public boolean ordenou = false;

  // método responsável por adicionar um novo elemento ao array
  public int[] NovoElementoArray(int[] array, int novo_elemento) {
    // Variavel responsável por armazenar a quantidade de elementos de um array
    int tamanho_array = array.length;
    
    // Novo vetor que vai armazenar de maneira atualizada o array com novos campos
    int[] novo_array = new int[tamanho_array+1];

    //Looping responsavel por inserir os elementos no novo array
    for(int i = 0;i<tamanho_array;i++){
    	novo_array[i] = array[i];
    }
    //Adicionando o novo elemento no array novo
    novo_array[tamanho_array] = novo_elemento;
  }

  //Metodo responsável por ordenar o vetor 
  public int[] ArrayOrdenado(int[] vetor){
  
    // Armazena tamanho do vetor
    int tamanho_vetor = vetor.length;
    
    // Faz o bubble sort para ordenar o vetor
    for(int i = 0;i<tamanho_vetor-1;i++){
        for(int j = 0;j<tamanho_vetor-i-1;j++{
          if(vetor[j] > vetor[j+1]){
             // Variavel intermédiaria que irá armazenar temporáriamente o menor valor do vetor
             int temp = vetor[j];
             vetor[j] = vetor[j+1];
             vetor[j+1] = temp;
          }	
	} 
   }

    //Confirma que o vetor foi ordenado
    ordenou = true;

    // retorna ordenado
    return vetor;
  }

  // Método responsável por verificar se o elemento existe no vetor
  public void buscaElemento(int[] vetor,int valor){
   if(ordenou==true){
    // Variavel que armazena tamanho do vetor
    int tamanho_vetor = vetor.lenght;

    // Sentinela do loop while
    boolean sentinela = false;

    // Limites maximos, minimos e médio respectivamente
    int limMax = tamanho_vetor;
    int limMin = 0;
    int limMed = (limMax+limMin)/2;

    // Algoritimo de busca binária
    // Minha vontade era colocar while(true), mas sempre me tiram ponto por isso
    while(sentinela=false){
       
	 if(valor < vetor[limMed]){
	   limMax = limMed;
	 }else if(valor > vetor[limMed]){
	   limMin = limMed;
	 }
	
	if (limMed == limMax || limMed == limMin){
	   valor = vetor[limMed];
	   System.out.println("O valor foi encontrado "+valor);
	   sentinela = false;
	   break;
	}

        if(limMin > limMax){
	  System.out.println("O valor não está presente no vetor");
	  sentinela = false;
	  break;
	}

	limMed = (limMax+limMed)/2;
	
    }
   }else{
     System.out.println("O vetor para realizar a busca binária necessita passar por uma ordenação antes");
   }  
  }


  public void imprimeVetor(int[] vetor){
    for(int numero: vetor){
      System.out.print("\n " + numero);
    }
  }
  

}


