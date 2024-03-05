package listaDuplamenteEncadeadaCircular;

//o prox do ultimo � o primeiro e o anterior do primeiro � o ultimo
public class ListaDuplaCircular {
	//para lista dupla precisa-se de: ref, n� tenha anterior
		private No ref;
		private int size = 0;
		
		public ListaDuplaCircular() {}
				
		
		//insere no inicio
		public void inserir(int info) {
			if(this.isEmpty()) {
				No novo = new No(info, null, null);
				novo.setAnterior(novo);
				novo.setProx(novo);
				ref = novo;
				size++;
				return;
			}

			if(this.size == 1) {
				No novo = new No(info, ref, ref);
				ref.setAnterior(novo);
				ref.setProx(novo);
				size++;
				return;
			}
			No novo = new No(info, null, null);
			for(No p = ref.getProx(); p != ref; p = p.getProx()) {
				if(p.getAnterior() == ref) {
					p.setAnterior(novo);
					novo.setProx(p);
					ref.setProx(novo);
					novo.setAnterior(ref);
					size++;
					return;
				}
			}
		}
		
		
		public void delete(int info) {
			if(this.isEmpty()) {
				System.out.println("Lista vazia!");
				return;
			}
			for(No p = ref.getProx(); p != ref; p = p.getProx()) {
				if(p.getAnterior() == ref && p.getInfo() == info) {
					
					p.getProx().setAnterior(ref);
					ref.setProx(p.getProx());
					size--;
					return;
				}
				else if(p.getProx() == ref && p.getProx().getInfo() == info) {
					
					p.setProx(ref.getProx()); 
					ref.getProx().setAnterior(p);
					ref = ref.getProx();
					size--;	
					return;
				}
				else if(p.getInfo() == info) {
					No ant = p.getAnterior();
					p.getAnterior().setProx(p.getProx());
					p.getProx().setAnterior(ant);;
					size--;
					return;
				}
			}
		}
		
		
		public void print() {
			if(this.isEmpty()) {
				System.out.println("Lista vazia!");
				return;
			}
			if(this.size == 1) {
				System.out.println("Atual => "+ref.getInfo() + " anterior -> " + ref.getAnterior() + " prox -> " + ref.getProx() + "; size atual -> "+ this.size);
				return;
			}
			for(No p = ref.getProx(); p != ref; p = p.getProx()) {
				System.out.println("Atual => "+p.getInfo() + " anterior -> " + p.getAnterior() + " prox -> " + p.getProx() + "; size atual -> "+ this.size);
			}
			System.out.println("Atual => "+ref.getInfo() + " anterior -> " + ref.getAnterior() + " prox -> " + ref.getProx() + "; size atual -> "+ this.size);
		}
		
		public boolean isEmpty() {
			return ref == null;
		}
}
