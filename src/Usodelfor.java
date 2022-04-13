import java.util.Scanner;
//TP DE LA CLASE 3-4
public class Usodelfor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Scanner entrada= new Scanner(System.in);
		System.out.println("Ingrese un numero:");
		int numero=entrada.nextInt();	
		while(numero>0 ) {
			int digito=numero%10;
			System.out.println("El Digito es: "+digito);
			numero=numero/10;
		}*/
		
		//tp2 Ejercicio 14
		Scanner entrada= new Scanner(System.in);
		System.out.println("Ingrese un numero:");
		/*int n=entrada.nextInt();
		int pd=2;
		int suma=0;
		//System.out.println("1 es divisor");
		while(pd<=n/2) {
			if(n%pd==0) {
				suma=suma+pd;
				System.out.println(pd+" es divisor");			}
			pd+=1;
		}
		//System.out.println(n+" es divisor");
		System.out.println("LA SUMA ES: "+suma);*/
		
		
		/*int ini=k*(-1);
		for(int i=ini;i<=k;i++) {
			if (i%2==0) {
				System.out.println(i);
			}*/
		
		
		//Dado un numero natural N. Determinar si este es primo.
		
		/*int n=entrada.nextInt();
		int pd=2;
		int cont=0;
		while(pd<=n/2) {
			if(n%pd==0) {
				cont+=1;}
			pd+=1;
		}
		if(cont==0) {
			System.out.println("El numero es primo");
		}
		else {
			System.out.println("El numero no es primo");

		}*/
		
		//Dada un lista de numero naturales mostrar aquellos que tengan una cantidad par de
		//digitos pares
		/*int n=entrada.nextInt();
		int dig;
		int cont=0;
		
		while(n!=0) {
			
			dig=n%10;
			if(dig%2==0) {
				System.out.println(dig);
				cont++;
			}
			n=n/10;
		}
		System.out.println("La cantidad de digitos pares es: " +cont);*/
		
		//Dado un numero natural K determinar si es capicua.
		int n=entrada.nextInt();
		
		int dig;
		int aux=n;
		int inverso=0;
		//aux=53 inverso 35
		while(aux!=0) {
			dig = aux%10; //scamos el ult dig --->3--->5
			inverso = inverso * 10 + dig; //0*10+3= 3 --->3*10+5=35		
			aux=aux/10; //53/10= 5---->5/10=0
		}
		
		if(n == inverso) {
			System.out.println("es capicua");
		}
		else {
			System.out.println("no es capicua");
		}
		
	}
	
	/*INVERSO=0;
	 * 181 DIGITOS 
	 * 181
	 * 
	 * 55
	 * 
	 * 232   232  entonces es capicua...
	 * 
	 * inverso=0;
	 * 
	 * 
	 * inverso=inverso*10+ultDig;
	 *
	 * 
	 * 0*10+1=1 (inverso)
	 * 1*10+8 =18 (inverso)
	 * 18*10+1= 181 (inverso)
	 * 
	 * 
	 * */
	
	
	
}

