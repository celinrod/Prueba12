import java.util.Scanner;

public class ejercicio2 {
	public static Scanner teclado=new Scanner(System.in);
	
	
	public static void cargardatos(double lista[]) {
		for(int i=0; i<lista.length;i++) {
			lista[i]=teclado.nextDouble();
		}
	}
	public static void mostrar(double lista[]) {
		double mayor,menor,suma;
		suma=0;
		mayor=lista[0];
		menor=lista[0];
		for(int i=1;i<lista.length;i++) {
			if(mayor<lista[i]) {
				mayor=lista[i];
				}
			if(menor>lista[i]) {
				menor=lista[i];
			}
			
			suma=suma+lista[i];
		}
		if(mayor<100) {
			System.out.println("No existe persona con un peso mayor a 100k");
		}
		else {
			System.out.println("Si existe persona con un peso mayor a 100k");
		}
		
		System.out.println("El peso menor es: "+menor);
		System.out.println("El peso mayor es: "+mayor);
		System.out.println("El peso medio es: "+suma/lista.length);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double lista[]= new double[6];
		cargardatos(lista);
		mostrar(lista);
		

	}

}
