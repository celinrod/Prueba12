import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		Scanner entrada= new Scanner(System.in);
		System.out.println("Por favor ingrese 3 numeros");
        System.out.print("Ingrese numero 1: ");
        a = entrada.nextInt();
        System.out.print("Ingrese numero 2: ");
        b = entrada.nextInt();
        System.out.print("Ingrese numero 3: ");
        c = entrada.nextInt();      
		
		if(a>b) {
            if(a>c) {
                if(b>c) {
                    System.out.println("Orden Ascendente: " + c + " " + b + " " + a);
                    System.out.println("Orden descendente: " + a + " " + b + " " + c);                 
                }else {
                    System.out.println("Orden Descendente: " + a + " " + c + " " + b);
                    System.out.println("Orden Ascendente: " + b + " " + c + " " + a);
                }
            }else {
                System.out.println("Orden Ascendente: " + b + " " + a + " " + c);
                System.out.println("Orden descendente: " + c + " " + a + " " + b);
            }
        }else {
            if(b>c) {
                if(a>c) {
                    System.out.println("Orden Ascendente: " + c + " " + a + " " + b);
                    System.out.println("Orden descendente: " + b + " " + a + " " + c);
                }else {
                    System.out.println("Orden Ascendente: " + a + " " + c + " " + b);
                    System.out.println("Orden descendente: " + b + " " + c + " " + a);
                }              
            }else {
                System.out.println("Orden Ascendente: " + a + " " + b + " " + c);
                System.out.println("Orden descendente: " + c + " " + b + " " + a);
            }
        }

	}

}
