import java.sql.Array;
import java.util.Arrays;

public class vetorArray{
  Object vetor[]; 
  Object replace;
  int capacidade, indice;

  public vetorArray(int cap){
    vetor = new Object[cap];
    capacidade = -1;
    indice = 0;
}

  public boolean tamanho(){
    return capacidade == vetor.length -1;
  }
  public boolean Vazio(){
    return capacidade == -1;
  } 

    /*public Object ini() {
        if (Vazio())
            System.out.println("inicio Vazio");
        return arr[ini];
    }*/

  public void compAtRank(int indice){
    System.out.println(vetor[indice]);
  }

  public Object trocarAtRank(int indice, Object novo ){
    Object change = vetor[indice];
    replace = vetor[indice];
    vetor[indice] = novo;
    return change;
    }

    public void inserirAtRank(int indice, Object objeto) {
    Object vetorAux[];
    if(tamanho()){
      vetorAux = new Object[vetor.length * 2];
      for(int j = 0; j < vetor.length; j++){
        vetorAux[j] = vetor[j];
      }
      vetor = vetorAux;
    } 
    for(int j = capacidade; j >= indice; j--){
      vetor[j + 1] = vetor[j];
    }
    vetor[indice] = objeto;
    capacidade++;
    }

    public Object removerAtRank(int indice){ Object remove = vetor[indice];
    for(int j = indice; j < vetor.length - 1; j++){
      vetor[j] = vetor[j + 1];
    }
    capacidade--;
    return remove;
    }

    /*public void mostrarVetor() {
	  String msg = "";
	  if(!Vazio()) {
		  for(int j = 0; j < capacidade; j++) {
			  msg = msg + vetor[j] + " | ";
		  	}
		  } else {msg = "vetor vazio"; }
		  //JOptionPane.showMessageDialog(null, msg);
	  System.out.println(msg);
	  }
  /*public String toString() {
		return Arrays.toString(cadeia);
	}*/
  public String toString() {
		return Arrays.toString(vetor);
	}
  }
