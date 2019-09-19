
public class executa {

	public static void main(String[] args) {
		TADSeq t = new TADSeq();
		t.insertFirst("T");
		t.insertFirst(1);
		t.insertFirst("Thales");
		t.insertFirst("Victor");
		 System.out.println(t.atRank(2).getComponente());
		    t.display();
		    t.remove(t.atRank(2));
		    t.display();
		    t.removeAtRank(0);
		    t.display();
		    t.insertAfter(t.atRank(0), "Ismael");
		    t.display();
		    t.insertBefore(t.atRank(0), "Simei");
		    t.display();
	}

}
