//Autor - Thales Azevedo Silva - TADS - 20172014040005

//Definindo a classe e variáveis
public class TADSeq {
	private No start;
	private No end;
	private int capacity;
	
//Iniciando o construtor
	public TADSeq() {
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
	
	//Função retorna o componente na posição 'C'
	public Object compAtRank(int c) {
		No no = new No();//Inicia um novo 'NO'
		no = atRank(c);//atRank 'C' pega o 'NO'
		Object o = new Object();//Inicia um novo Objeto
		o = no.getComponente();//NO pega componente e joga no Objeto
		return o;//Retornando o Objeto
	}
	
	//Retorna, recolocando o componente de 'c' pelo Objeto 'O'
	public Object replaceAtRank(int c, Object o) {
		No no = atRank(c);//Pega o componente em 'C' do atRank pro No
		Object oldComponente = no.getComponente();//Pega o componente e o coloca em OldComponente
		no.setComponente(o);//Seleciona o Componente
		return oldComponente;//returna o oldComponente
	}
	
	//Insere novo componente em 'O' na posicao 'C'
	public void insertAtRank(int c, Object o) {
		No old = atRank(c);//pega o NO na posicao 'C'
		No novo = new No();//Inicia um novo NO
		novo.setComponente(o);//Seleciona o novo componente do NO 
		novo.setNext(old);//O proximo do novo NO é o old
		novo.setBefore(old.getBefore());//O anterior do novo NO é o old do NO anterior
old.getBefore().setNext(novo);//O proximo do old é o novo do proximo
old.setBefore(novo);// O anterior do old é o novo NO
		capacity ++;//Inserindo mais um
	}
	
	
	public Object removeAtRank(int c) {
		return remove(atRank(c));//Remove o componente da posicao de 'C'
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
	public No atRank(int c) {//retorna o no do indice "c"
		No node = new No();//novo noR
		if(c <= size()/2) {//se o componente for menor quer o tamanho/2
			node = start.getNext();// o novo no é igual ao proximo do inicio
			for(int j = 0; j < c; j++) {//um for ate menor que o valor do componente
				node = node.getNext();//colocamos o proximo do no
			}
			// se ele nao for menor ou igual a metade do tamanho da sequencia

		}else {
			node = end.getBefore();//o novo no vai receber o anterior ao fim
			for(int j = 0; j < size()-c-1; j++) {//
				node = node.getBefore();// colocamos no anterior do no
			}
		}
		return node;//retorna o novo no
	}
	//retorna a posição do componente
	public int rankOf(No n) {//Retorna o NO de N
		No node = start.getNext();//Primeiro NO próximo
		int c = 0;//Contador
		while(node != n && n != end) {//Diferente de n e do end
			n = n.getNext();//igual ao próximo
			c++;
		}
		return c;
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
