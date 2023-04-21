package docarmo.filastring;

public class Fila {
	
	No inicio;
	No fim;
	
	public Fila() {
		inicio = null;
		fim = null;
	}
	
	public boolean isEmpty() {
		if (inicio == null && fim == null) {
			return true;
		}else {
			return false;
		}
	}
	
	public void insert (String valor) {
		No elemento = new No();
		elemento.dado = valor;
		
		//Verificar se é o primeiro elemento
		if(inicio == null) {
			inicio = elemento;
			fim = elemento;
			elemento.proximo = null;
		}else {
			//Verificar se é o segundo elemento
			if(inicio == fim && inicio != null) {
				fim = elemento;
				inicio.proximo = fim;
				fim.proximo = null;
			}else {
				fim.proximo = elemento;
				elemento.proximo = null;
				fim = elemento;
			}
		}
	}
	
	public String remove() throws Exception{
		if(isEmpty()) {
			throw new Exception("Fila Vazia");
		}
		No auxiliar = inicio;
		if(inicio == fim && inicio != null) {
			inicio = null;
			fim = null;
		}else {
			inicio = inicio.proximo;
		}
		return auxiliar.dado;
	}
	
	public void list() throws Exception{
		if(isEmpty()) {
			throw new Exception("Fila Vazia");
		}
		No auxiliar = inicio;
		while (auxiliar != null) {
			System.out.println(auxiliar);
			auxiliar = auxiliar.proximo;
		}
	}
	
	public int size() {
		int cont = 0;
		if(!isEmpty()) {
			No auxiliar = inicio;
			while(auxiliar != null) {
				cont++;
				auxiliar = auxiliar.proximo;
			}
		}
		return cont;
	}
}
