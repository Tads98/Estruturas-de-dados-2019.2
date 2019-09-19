public class FilaCircular{
    Object arr[];
    int ini, fim;
  
    public FilaCircular(int tam){
      arr = new Object[tam];
      ini = 0;
      fim = 0;
  }
  
    public int tamanho(){
      return (arr.length - ini + fim)% arr.length;
    }
    public boolean Vazio(){
      return (ini == fim);
    } 
  
      public Object ini() {
          if (Vazio())
              System.out.println("inicio Vazio");
          return arr[ini];
      }
  
    public void enfileirar(Object o){
      if(tamanho() == arr.length - 1){
        int j;
        Object aux[] = new Object[arr.length*2];
          for(j = 0; j < arr.length; j++){
            aux[j] = arr[(j + ini)% arr.length];
          } 
          ini = 0;
          fim = j++;
          arr = aux;
      }
      arr[fim] = o;
      fim = (fim + 1) % arr.length;
    }
  
      public Object desinfileirar(){
      if(Vazio()){
        throw new RuntimeException("Fila vazia");
      }else{
        Object o = arr[ini];
        arr[ini] = null; 
        ini = (ini + 1) % arr.length;
        return o;
      } 
      }
      
      public void mostrar() {
        for(int j = 0; j < arr.length; j++){
          System.out.println("["+ arr[j]+"]");
        }
        System.out.println("");
      }
  }
  