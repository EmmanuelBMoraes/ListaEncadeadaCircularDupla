package listaDuplamenteEncadeadaCircular;



public class No {
	private int info;
	private No prox;
	private No anterior;
	
	public No(int info, No prox, No ant) {
		this.setInfo(info);
		this.setProx(prox);
		this.setAnterior(ant);
	}
	
	public int getInfo() {
		return info;
	}
	public void setInfo(int info) {
		this.info = info;
	}
	public No getProx() {
		return prox;
	}
	public void setProx(No prox) {
		this.prox = prox;
	}
	public No getAnterior() {
		return this.anterior;
	}
	public void setAnterior(No ant) {
		this.anterior = ant;
	}
	
	public String toString() {
		return "" + this.getInfo();
	}
}
