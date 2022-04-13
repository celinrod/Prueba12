import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio14 {
	
	private static int determinarsumadiv(int n) {
		int suma=0;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				System.out.println("El divisor: "+i);
				suma=suma+i;
			}
		}
		return suma;
	}
	
	/*
	 * Dado un numero natural N se desea conocer sus divisores y la suma de todos ellos. No
		considerar el 1 si mismo.*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer>lista=new ArrayList<Integer>();
		
		Scanner entrada= new Scanner(System.in);
		System.out.println("Ingrese un numero:");
		int n=entrada.nextInt(); //ingresamos el numero
		int suma=determinarsumadiv(n);
		System.out.println("La suma de los divisores es: "+suma);
		
	}

}
