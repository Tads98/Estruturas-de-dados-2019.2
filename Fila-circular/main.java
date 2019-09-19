//Fila-Ligada por Thales Azevedo Silva(20172014040005)
//Código e descrição de montagem de fila-circular
class Main {
	public static void main(String[] args) {
		FilaCircular fc = new FilaCircular(3);
		fc.enfileirar(1);
		fc.enfileirar('t');
		fc.enfileirar('a');
		fc.enfileirar('d');
		fc.enfileirar('s');
		fc.mostrar();
	}
}