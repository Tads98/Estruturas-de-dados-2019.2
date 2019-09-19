//Definindo variaveis 
class StackArrayImplementation {
	int top;
	int capacity;
	Object[] stack;

//Construtor
	public StackArrayImplementation(int capacity){
		top = -1;
		stack = new Object[capacity];
	}

//Verifica se a pilha está vazia
	public boolean isEmpty() {
		return top == -1;
	}
//Retorna o tamanho da pilha
  public void StackN( StackArrayImplementation s){
    for(int i=0; i < stack.length; i++){
      System.out.println(s.stack[i]);
    }
  }
  //Verifica se a pilha está cheia
	public boolean isFull() {
		return top == capacity-1;
	}
	//Inclui os dados na pilha
	public Object push(Object data) {
	Object[] stack2; 
  //Duplica o tamanho da pilha
  	if(isFull()) {
      stack2 = new Object[stack.length * 2];
      for(int i = 0; i < stack.length; i++){
        stack2[i] = stack[i];
      }
      stack = stack2;
		//System.out.println("Pilha cheia");
	}
    //Empilha normal
		return stack[++top]=data;
}
//Se a pilha estiver vazia
	public Object pop() {
		if(isEmpty()) {
			System.out.println("Pilha vazia");
		}
    //Se não, retira o elemento
		return stack[top--];
	}
  //Escolhe um elemnto da pilha sem retirar
	public Object peek() {
		return stack[top];
	}
  
	/*public void display() {
		for(Object i:stack) {
			System.out.println(i);
		}*/
	}