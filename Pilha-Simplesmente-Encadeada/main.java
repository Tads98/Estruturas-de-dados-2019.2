//Pilha-Ligada por Thales Azevedo Silva(20172014040005)
//Código e descrição de montagem de pilha-ligada
class Main {

	public static void main(String[] args) {
		
		pilha p = new pilha();
		
		p.enP("t");
		p.enP("8");
		p.enP("d");
		p.enP("7");
		
		p.mostrar();
		
		p.deP();
		
		p.mostrar();
		p.deP();
		p.mostrar();
	}

}