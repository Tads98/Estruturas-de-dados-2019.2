import java.util.ArrayList;

class ArvoreBinaria{
	
	No raiz;
	int tamanho;

	public ArvoreBinaria(Object o){
		raiz = new No(o);
		tamanho = 1;
	}
	//Num raiz
	public No root(){
		return raiz;
	}

	//Retorna Deus
	public No parent(No v){
		return (v.parent());		
	}

	//Retorna o tamanho
	public int size(){
		return this.tamanho;
	}

	//Verifica se está vazio
	public boolean isEmpty(){
		return raiz == null;
	}

	//testa se o nó é a raiz
	public boolean isRoot(No v){
		return v  == raiz;
	}

	//Verifica a profundidade do nó
	public int depth(No v){
		int profundidade = profundidade(v);
		return profundidade;
	}
	private int profundidade(No v){
		if(v == raiz){
			return 0;
		}else{
			return 1 + profundidade(v.parent());
		}

	}

	public boolean isInternal(No v){
		ArrayList filhos = Children(v);
		return(filhos.size() > 0);
		
		//return(v.childrenNumber() > 0);
	}

	public boolean isExternal(No v){
		ArrayList filhos = Children(v);
		return(filhos.size() == 0);
	}
	//Retorna os comunistas 
	public No leftChild(No v){
		return v.getleftChild();
	}	

	//Retorna os patriotas
	public No rightChild(No v){
		return v.getrightChild();
	}
	
	//Verifica se tem comunistas
	public boolean hasLeft(No v){
		return v.getleftChild() != null;
	}

	//Verifica se tem patriotas
	public boolean hasRight(No v){
		return v.getrightChild() != null;
	}

	//Adicionando ao ArrayList filho (Direito e Esquerdo) 
	public ArrayList Children(No v){
		ArrayList<No> Children = new ArrayList();
		if(hasLeft(v)){
			Children.add(v.getleftChild());
		}
		if(hasRight(v)){
			Children.add(v.getrightChild());
		}
		return Children;
	}
	
	//
	public Object replace(No v, Object o){
		Object up = v.element();
		v.setelement(o);
		return up;
	}
	
}