import java.util.Scanner;

public class Capicua {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada= new Scanner(System.in);
		System.out.println("Ingrese un numero: ");
		int numero= entrada.nextInt();
		if(esCapicua(numero)) {
			System.out.println(numero+ " Es capicua");
		}
		else {
			System.out.println(numero+ " No es capicua");
		}
		

	}
	//454 ---> 454/10 = 45 resto 4
	//152---->251
	
	public static boolean esCapicua(int numero) {
		int aux=numero;
		int dig;
		int inverso=0;
		while(aux!=0) {
			dig=aux%10;
			inverso= inverso*10+dig;
			aux=aux/10;
		}
		
		if(numero==inverso) {
			return true;
		}
		else {
			return false;
		}
	}

}
