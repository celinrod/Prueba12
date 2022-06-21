package Parte2;

import java.util.Scanner;

public class Ejercicio17 {
	
	public static boolean esPar(int numero) {
		if(numero%2==0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static boolean digitosPares(int numero) {
		boolean band=false;
		int aux=numero;
		int contDigPares=0;
		int dig;
		while(aux!=0) {
			dig=aux%10;
			if(esPar(dig)) {
				contDigPares++;
			}
			aux/=10;
		}
		if(esPar(contDigPares)&& contDigPares!=0) {
			band=true;
		}
		else {
			band=false;
		}
		
		return band;
	}
	//22------2  1-----2----2
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Ingrese el tamaño de la lista");
		int n= sc.nextInt();
		int lista[]= new int[n];
		for (int i= 0; i<n;i++) {
			System.out.println("Ingrese un numero: ");
			lista[i]=sc.nextInt();
		}
		
		for (int i= 0; i<n;i++) {
			if(digitosPares(lista[i])) {
				System.out.println(lista[i]);
			}
			
		}
		
		
		
	}

}
