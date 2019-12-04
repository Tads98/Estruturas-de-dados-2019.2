import java.lang.*; 
import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.Buffer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		FileReader fileR;
		BufferedReader buff;
		List<Integer> lista = new ArrayList<>();
		try{
			System.out.println("ler");
			String nome = new Scanner(System.in).nextLine();
			fileR = new FileReader(nome);
			buff = new BufferedReader(fileR);
			String dado = null;

			while((dado = buff.readLine()) != null){
				lista.add(Integer.parseInt(dado));
			}
			buff.close();
			fileR.close();

		} catch(Exception e){
			System.out.println(e.getMessage());
		}
		System.out.println("leu");

		Integer[] array = new Integer[lista.size()];
		int index = 0;
		for(Integer item : lista){
			array[index++] = item;
		}
		System.out.println("ordenar");
		
		//Merge b = new Merge();
		//b.mergeSort(array, 0, array.length);
		//Insert b = new Insert();
		//b.inserir(array);
		//System.out.println("ordenou");

	}

}

//Bubble-Sort
/*
class BS{
	public void ordenar(Integer[] ar ){	
		long tempoi = System.currentTimeMillis();	
		for (int p = ar.length-1; p > 0; p--){			
			for(int s = 0; s < p; s++){				
				if(ar[s] > ar[s+1]){					
					swap(ar, s, s+1);
				}			
			}
		}
		long tempof = System.currentTimeMillis();
		System.out.println("tempo " + (tempof-tempoi)+ " milisegundo");
		System.out.println("tempo " + ((tempof-tempoi)/1000)+ " segundos");
	}

	public void swap(Integer[] arr, int i, int j){
		if(i == j){
			return;
		}
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}*/



/*class Insert{
    public void inserir(Integer[] intArray){
    	long tempoi = System.currentTimeMillis();
    	
        for (int IndexNãoOrdenado = 1; IndexNãoOrdenado < intArray.length; IndexNãoOrdenado++){

            int novoElemento = intArray[IndexNãoOrdenado];

            int i;

            for(i = IndexNãoOrdenado; i > 0 && intArray[i - 1] > novoElemento; i--) {
                intArray[i] = intArray[i - 1];
            }

            intArray[i] = novoElemento;
        }
        
        long tempof = System.currentTimeMillis();
		System.out.println("tempo " + (tempof-tempoi)+ " milisegundo");
		System.out.println("tempo " + ((tempof-tempoi)/1000)+ " segundos");
		
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }
}*/


//Merge-Sort
/*class Merge{
    public void mergeSort(Integer[] entrada, int ini, int fim){

        //Verifica se o array possui um unico elem (sorted)
        if(fim - ini < 2){
            return;
        }
        
        //Divide o array
        int meio = (ini + fim) / 2;
        mergeSort(entrada, meio, ini);
        mergeSort(entrada, meio, fim);
        merge(entrada, ini, meio, fim);
    } 
    
    public void merge(Integer[] entrada, int ini, int meio, int fim){

        if (entrada[meio - 1] <= entrada[meio]){
            return;
        }

        int i = ini;
        int j = meio;
        int auxIndex = 0;

        int[] aux = new int[fim - ini];
        while (i < meio && j < fim) {
            aux[auxIndex++] = entrada[i] <= entrada[j] ? entrada[i++] : entrada[j++];
        }

        System.arraycopy(entrada, i, entrada, ini + auxIndex, meio - i);
        System.arraycopy(aux, 0, entrada, ini, auxIndex);
    }
}*/

//SelectionSort

/*
public class SelectionSort {
	public static void main(String [] args) {		
		int[] intArray = {20, 35, -15, 7, 55, 1, -22};
		
		for (int ultimo = intArray.length - 1; ultimo > 0; ultimo--) {			
			int maior = 0;
			for(int i = 1; i <= ultimo; i++) {
				if(intArray[i] > intArray[maior]) {
					maior = i;
				}				
			}			
			swap(intArray, maior, ultimo);
		}		
	}	
	
	public static void swap(int [] array, int i, int j) {
		if (i == j) {
			return;
		}
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}	
}//eoc    */


//QuickSort
/*
public class QuickSort {
	public static void main(String[] args) {
		
		int[] intArray = {20, 35, -15, 7, 55, 1 , -22};
		quickSort(intArray, 0, intArray.length);			
	}
	public static void quickSort (int [] input, int comeco, int fim) {
		if ( fim - comeco < 2) {
			return;
		}		
		int indexP = partition(input, comeco, fim);
		quickSort(input, comeco, indexP);
		quickSort(input, indexP + 1, fim);
	}
	
	public static int partition(int [] input, int comeco, int fim) {
		int pivo = input[comeco];
		int i = comeco;
		int j = fim;
		
		while(i < j) {
			
			while(i < j && input[--j] >= pivo);
			if(i < j) {
				input[i] = input[j];
			}
			
			while (i < j && input[++i] <= pivo);
			if(i < j) {
				input[j] = input[i];
			}
		}		
		input[j] = pivo;
		return j;
	}	
}//eoc   */




