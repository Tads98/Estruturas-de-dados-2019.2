import java.util.*;
class Main {
  public static void main(String[] args) {
	ArvoreGenerica  a = new ArvoreGenerica(1);

	a.addChild(a.root(), 6);
	a.addChild(a.root(), 5);
	a.addChild(a.root(), 4);
	a.addChild(a.root(), 3);
	a.addChild(a.root(), 2);
	a.addChild(a.root(), 1);
	a.addChild(a.root(), -1);
	a.addChild(a.root(), -2);
    
    /*try{
		Iterator i = a.root().children();
		a.remove((No) i.next());
	}catch(InvalidNoException e){
		System.out.println(e.getMessage());
	}
	Iterator i = a.nos(a.root());*/

	while(i.hasNext()){
		No temp = (No)i.next();
		System.out.println(temp.element());
	}
	System.out.println("Acabei");
	//System.out.println(a.profundidadeArvore(a.root()));
	//System.out.println(a.height(a.root()));
	//a.mostrarArvore();
  }
}
