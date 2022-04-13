import java.util.Scanner;

public class ejercicio16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada= new Scanner(System.in);
		System.out.println("Ingrese un numero");
		int n=entrada.nextInt(); //indice
		int dig;
		while(n!=0) {
			dig=n%10;
			System.out.println("Digito: "+dig);
			n=n/10;
		}
		
		/*
		 * n=256
		 * digito 6, 5 , 2
		 * n/10= 25  (n%10)resto es ult dig 6
		 * 256/10 resto 6
		 * 25/10  resto 5
		 * 2/10  resto 2
		 * */

	}

}
