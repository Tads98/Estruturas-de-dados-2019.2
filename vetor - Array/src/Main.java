//Fila-Ligada por Thales Azevedo Silva(20172014040005)
//Código e descrição de montagem de fila-circular
import java.sql.Array;
import java.util.Arrays;
public class Main {
	public static void main(String[] args) {
		vetorArray v = new vetorArray(3);
		v.inserirAtRank(0,1);
		v.inserirAtRank(1,'t');
		v.inserirAtRank(2,'a');
		v.inserirAtRank(0,'d');
		v.inserirAtRank(1,'s');
		//v.mostrarVetor();
    System.out.println(v);
	}
}