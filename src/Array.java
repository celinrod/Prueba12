import java.util.ArrayList;
import java.util.Scanner;

public class Array {
	public static Scanner teclado= new Scanner(System.in);
	
	public static void cargardatos(int lista[] ) {
		
		
		for(int i=0;i<lista.length;i++) {
			System.out.println("Ingrese un numero: ");
			lista[i]=teclado.nextInt();
		}
	}
	public static void mostrardatos(int lista[]) {
		
		for(int i=0;i<lista.length;i++) {
			System.out.print(i+": "+lista[i]+", ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int lista[]=new int[3];
		cargardatos(lista);
		mostrardatos(lista);
		
		

	}

}
