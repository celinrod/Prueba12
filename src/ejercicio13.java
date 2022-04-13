import java.util.Scanner;

public class ejercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada= new Scanner(System.in);
		System.out.println("Ingrese un numero");
		int n=entrada.nextInt(); //indice
		int cont=0; //contamos los divisores
		for (int i=2;i<=n/2;i++) {
			if(n%i==0) {
				System.out.println(i+" Es divisor");
				cont=cont+1;
			}
		}
		if(cont==0) {
			System.out.println("Es primo");
		}
		else {
			System.out.println("NO es primo");
		}
		
		

	}

}
