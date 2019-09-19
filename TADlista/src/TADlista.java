//Autor - Thales Azevedo Silva - TADS - 20172014040005

//Definindo a classe e variáveis
public class TADlista {
	private No start;
	private No end;
	private int capacity;
	
//Iniciando o construtor
	public TADlista() {
		start = new No();//Inicio do No
		end = new No(); //Fim do No
start.setNext(end);//Proximo
end.setBefore(start);//Anterior
		capacity = 0;
	}
	
	public int size() { 
		return capacity; //Retorna tamanho da TAD 
	}
	
	//Retorna se a TAD está vazia
	public boolean isEmpty() {
		return capacity == 0;
	}
	
	public boolean isFirst(No n) {
		return start.getNext().equals(n);
	}
	
	public boolean isLast(No n) {
		return end.getBefore().equals(n);
	}
	
	public No first() {
		return start.getNext();//Retorna o proximo (primeiro no)
	}
	
	public No last() {
		return end.getBefore();//Retorna o anterior(ultimo no)
	}
	
	
	public No before(No n) {
		return n.getBefore();//Retorna um NO anterior ao NO
	}
	
	public No after(No n) {
		return n.getNext();//Retorna o próximo do NO
	}
	
	public void replaceComp(No n, Object o) {
		n.setComponente(o);//Troca o componente de um NO
	}
	
	public void swapComp(No n, No q) {
		Object novo = new Object();//Inicia um novo objeto 
		novo = n.getComponente();//Insere o componente no NO
		n.setComponente(q.getComponente());//O componente de n é o de q
		q.setComponente(novo);//Retorna a troca do no
	}
	
	//Insere antes de um NO
	public void insertBefore(No n, Object o) {
		No v = new No();//Inicia o novo NO em 'v'
		v.setComponente(o);//Inserindo o componente no NO 'v'
		v.setNext(n);//O proximo de 'v' é o de 'n'
		v.setBefore(n.getBefore());//O anterior do NO 'v' é o de 'n'
		(n.getBefore()).setNext(v);//O anterior de 'n' é o de 'v'
		n.setBefore(v);//o anterior de 'n' é 'v'
	}
	
	//insere depois de um no
	public void insertAfter(No n, Object o) {
		No v = new No();//um novo no "v"
		v.setComponente(o);//passamos o componente do paramento para este novo no "v"
		v.setBefore(n);//o anterior desse no é o no "n"
		v.setNext(n.getNext());//o proximo desse no é o proximo do no "n"
		(n.getNext()).setBefore(v);//modificamos o valor do proximo do no "n" passando o novo no "v"
		n.setNext(v);	
	}
	
	//insere no inicio
	public void insertFirst(Object o) {
		No novo = new No();//novo no
		No old_start = new No();
		old_start = start.getNext();//No para guardar o proximo do inicio
		novo.setComponente(o);//novo componente inserido no novo no
		novo.setBefore(start);//o anterior desse novo no é o inicio
		novo.setNext(old_start);//o proximo dele é o antigo inicio
old_start.setBefore(novo);//o anterior do antigo inicio agora é o novo no
	start.setNext(novo);//o proximo do inicio vai ser o novo no
	if(this.capacity == 0) {// se o tamanho for igual a zero o anterior do fim e o novo componente
		end.setBefore(novo);
	}
	this.capacity++;//aumentar o tamanho da TAD
	
}
	//insere no final
	public void insertLast(Object o) {
		No novo = new No();//novo no
		No old_end = end.getBefore();//no para guardar o anterior do fim
		novo.setComponente(o);//inserimos o componente "o" no novo no
		novo.setNext(end);//o proximo desse novo no aponta para o fim da sequencia
		novo.setBefore(old_end);//o anterior do novo componente era o antigo fim
old_end.setNext(novo);//o proximo do antigo fim é o novo
		end.setBefore(novo);//o anterior do fim é o novo componente
		end.setBefore(novo);//se o tamanho da sequencia for igual a 0 o proximo do inicio é tambem o novo no
		if(this.capacity == 0) {
			start.setNext(novo);
		}
		this.capacity++;//incrementa o tamanho da sequencia
		
	}
	
	//remove o no
	public Object remove(No n) {
		Object t = n.getComponente();//declaramos um objecto e passamos o valor do componente do no passado por parametro
		(n.getBefore()).setNext(n.getNext());//o proximo do anterior do no "n" vai ser igual ao proximo de "n"
		(n.getNext()).setBefore(n.getBefore());//o anterior do proximo do no "n" vai ser igual ao anterior de "n"
		n.setBefore(null);//o anterior de n agora é null
		n.setNext(null);//o proximo de n agora é null
		capacity --;//decrementa o tamanho da sequencia
		return t;
	}
	
	//Mostra a TAD
  public void display(){
    No novo = start.getNext();
    System.out.print("inicio -> ");
    while(novo!=end){
      System.out.print(novo.getComponente()+" -> ");
      novo = novo.getNext();
    }
    System.out.println("final");
  }
}
