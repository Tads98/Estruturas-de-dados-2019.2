//Construindo No
class N {
	private Object El;//Instanciando variável elementos
	private N Prox; //Aponta para o próximo
	
	//Pega o objeto
	public void setEl(Object i) {
		
		El = i;
	}
	//joga no No
	public Object getEl() {
		return El;
	}
	//Aponta para o próximo elemento
	public void setProx(N Prox) {
		this.Prox = Prox;
	}
	//Pega o próximo elemento do No
	public N getProx() {
		return this.Prox;
	}
}