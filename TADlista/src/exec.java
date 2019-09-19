
public class exec {

	public static void main(String[] args) {
		TADlista t = new TADlista();
		No no = new No();
		t.insertFirst("T");
		t.insertFirst(1);
		t.insertFirst("Thales");
		t.insertFirst("Victor");
		 //System.out.println(t.atRank(2).getComponente());
		    t.display();
		    t.remove(t.first());
		    t.display();
		    t.remove(t.last());
		    t.display();
		    t.insertAfter(t.first(), "Ismael");
		    t.display();
		    t.insertBefore(t.last(), "Simei");
		    t.display();
	}

}
