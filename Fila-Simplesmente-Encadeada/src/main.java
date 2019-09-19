
public class main {

	public static void main(String[] args) {
		
		LinkedQueue l = new LinkedQueue();
		
		l.enQueue("t");
		l.enQueue("8");
		l.enQueue("d");
		l.enQueue("7");
		
		l.show();
		
		l.deQueue();
		
		l.show();
		l.deQueue();
		l.show();
	}

}
