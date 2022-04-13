
public class EsPalindromo {

	public static void main(String[] args) {
		String texto="arenera";
		esPalindromo(texto);
		
		
		

	}
	public static void esPalindromo(String texto) {
		char aux[]=texto.toCharArray();
		mostrar(aux);
		mostrar(invierte(texto));
		/*if(aux.equals(invierte(texto))) {
			System.out.println("Es palindromo");
		}
		else {
			System.out.println("NO es palindromo");
		}*/
	}
	public static void mostrar(char vector[]) {
		for (int i=0;i<vector.length;i++){
			System.out.print(vector[i]+", ");
		}
		System.out.println("");
	}
	
	public static char[] invierte(String texto) {
		char vector[]=texto.toCharArray();
		//mostrar(vector);
		char aux[] = new char[vector.length];
		int j=0;
		for(int i=vector.length-1;(i>=0 && j<aux.length);i--) {
			aux[j]=vector[i];
			j++;
		}
		
		
		return aux;
	}

}
