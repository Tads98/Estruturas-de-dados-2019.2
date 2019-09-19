//Classe filaligada
public class LinkedQueue {
    
    private N ini; //inicio == null
    
    //Construtor
    public LinkedQueue(){
    
    this.ini = null;
    
    }
    //Enfileirando a fila
    public void enQueue(Object Element){
        
        N n = new N();//Instancia No elemento
        n.setElement(Element);//Pegando novo No e instanciando o novo elemento  
        n.setNext(null); //Próximo No vazio
        
        //Se for vazio
        if (ini == null){
        
            ini = n;
        
        }else{
            N aux;//O inicio é atribuido ao No aux
            aux = ini;//aux passa a ser o inicio
            while(aux.getNext()!=null){//Se não for vazio, vá para o próximo
                aux = aux.getNext();
            }
            aux.setNext(n);//aponta para o próximo No
        
        }
    }
    //desinfileirar a fila
    public Object deQueue(){
    
    if(isEmpty()){//Se vazio
    
       throw new RuntimeException("Queue Empty");
    
    }
    //Se não, pega e vai para o próximo
    N aux = ini;
    Object o = aux.getElement();
    ini = aux.getNext();
    
     return o;//retorna o objeto
    
    }
    //Mostrar se vazia
    public void show(){
        
        if(ini == null){
        
            System.out.println("Queue Empty");
        
        }
        else{
         //Monstrar todos os elementos
            N aux = ini;
            while(aux != null){
            
            System.out.print( aux.getElement()+ " | ");
            aux = aux.getNext();
        
        }
            System.out.println("");
        
        }
    
    }
    //Confirmar se estiver vazio
  public boolean isEmpty(){
      
      return this.ini == null;
      
    }

 
}
    
    

