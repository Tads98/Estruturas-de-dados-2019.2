
public class No {
	private Object componente;
	private No next;
	private No before;
	
		public Object getComponente() {
			return componente;
		}
		
		public void setComponente(Object componente) {
			this.componente = componente;
		}
		
		public No getNext() {
			return next;
		}
		
		public void setNext(No next) {
			this.next = next;
		}
		
		public void setProximo(No next) {
			this.next = next;
		}
		
		public No getBefore() {
			return before;
		}
		
		public void setBefore(No before) {
			this.before = before;
		}
}
