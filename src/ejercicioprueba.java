import java.util.Scanner;

public class ejercicioprueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado= new Scanner(System.in);		
		double lista_peso[]=new double[5];
		double mayor, menor;
		System.out.println("Por favor ingrese un numero real para el peso: ");
		double x= teclado.nextDouble();
		lista_peso[0]=x;
		
		for(int i=1;i<lista_peso.length;i++) {
			System.out.println("Por favor ingrese un numero real para el peso");
			x= teclado.nextDouble();
			lista_peso[i]=x;
		}
		menor=lista_peso[0];
		mayor=lista_peso[0];		
		for(int i=0;i<lista_peso.length;i++) {
			if(lista_peso[i]<menor) {
				menor=lista_peso[i];
			}
		}
		System.out.println("El peso menor es: "+menor);
		double suma=0;
		for(int i=0;i<lista_peso.length;i++) {
			if(lista_peso[i]>mayor) {
				mayor=lista_peso[i];
			}
			suma=suma+lista_peso[i];
		}
		System.out.println("El peso mayor es: "+mayor);
		
		System.out.print("El peso medio de la es de: "+suma/lista_peso.length);
		teclado.close();


	}

}
