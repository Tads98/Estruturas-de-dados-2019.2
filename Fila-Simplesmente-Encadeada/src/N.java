//Construindo No
public class N {
	private Object Element;//Instanciando variável elementos
	private N Next; //Aponta para o próximo
	
	//Pega o objeto
	public void setElement(Object o) {
		
		Element = o;
	}
	//joga no No
	public Object getElement() {
		return Element; //Retorna o elemento
	}
	
	//Aponta para o próximo elemento
	public void setNext(N Next) {
		this.Next = Next;
	}
	//Pega o próximo elemento do No
	public N getNext() {
		return this.Next;
	}
}
