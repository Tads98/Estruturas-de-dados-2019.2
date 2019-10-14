import java.util.ArrayList;

import javax.lang.model.element.Element;

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

	public int Height(){
		if(raiz != null){
			return raiz.Height();
		}else{
			return 0;
		}
	}
	
	/*
	//Método para inserir elemento no No
	public void Insert(int element){
		No temp = search(raiz, element);
		if(temp != null){
			System.out.println("Elemento já existente");
		}else{
			if(isExternal(temp)){
				No novo = new No();
				if(temp < element){
					novo.setelement(element);
					novo.setpai(pai);
				}else{
					
				}
			}
        }
        
    }*/ 

	//Método para buscar um No na esquerda ou na direita
	public No search(No no, int element){
		int temp = (int) no.getelement();
		if(temp == element){
			return no;
		}else{
			if(isInternal(no)){
				if(temp < element){
					No search = search(no.getleftChild(), element);
					return search;
				}else{
					No search = search(no.getrightChild(), element);
					return search;
				}				
			}
			return null;
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
	
	//Troca elemento do filho
	public Object replace(No v, Object o){
		Object up = v.element();
		v.setelement(o);
		return up;
	}
	
	public void preOrder(No no){
		if(no != null){
			System.out.println(no.getelement());
			preOrder(no.getleftChild());
			preOrder(no.getrightChild());
		}
	}
	
	public void postOrder(No no){
		if(no != null){
			postOrder(no.getleftChild());
			postOrder(no.getrightChild());
			System.out.println(no.getelement());
		}
	}

	public void inorder(No no){
		if(no != null){
			inorder(no.getleftChild());
			System.out.println(no.getelement());
			inorder(no.getrightChild());
		}
	}

	//printExpression(v)

	//evalExpr(v)
}
