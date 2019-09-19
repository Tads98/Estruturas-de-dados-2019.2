//Classe Pilhaligada
class pilha {
	private N top; //inicio == null
	
	//Construtor
	public pilha() {
		this.top = null;
	}
	//Enfileirando de pilha
	public void enP(Object el) {
		N n = new N(); //Instancia No elemento
		n.setEl(el); //Pegando novo No e instanciando o novo elemento  
		n.setProx(top); //Próximo No vazio
		top = n;
		
	}
	public Object deP() {
		 //Se for vazio
		if(isEmpty()) {
			throw new RuntimeException("Pilha vazia");
		}
		
		Object i = top.getEl();
		top = top.getProx();
		
		return i;
	}
	//Monstrar pilha vazia
	public void mostrar() {
		if(top == null) {
			System.out.println("pilha vazia");
		}
		//Monstrar pilha elementos
		else {
			N aux = top;
			while(aux != null) {
				
				System.out.print(aux.getEl()+ " | ");
				aux = aux.getProx();
			}
				System.out.println("");
		}
	}//verificar se a pilha está vazia
	public boolean isEmpty() {
		
		return this.top == null;
	}
}
