import java.util.Scanner;

public class Tpractico3y4 {

	public static void main(String[] args) {
		
		Scanner entrada= new Scanner(System.in);
		System.out.println("Ingrese la cantidad de deportistas a cargar");
		int n=entrada.nextInt(); //indice
		int edad;
		float promedio;
		int suma=0;
		int menor=200;
		int mayor=0;
		for(int i=1;i<=n;i++) {
			System.out.println("Ingrese la edad del deportista");
			edad=entrada.nextInt();
			suma=suma+edad;
			if(edad>mayor) {
				mayor=edad;
			}
			if(edad<menor) {
				menor=edad;
			}
		}
		System.out.println("termino el ciclo for");
		promedio=(float)suma/n;
		System.out.println("La edad menor es: "+menor);
		System.out.println("La edad mayor es: "+mayor);
		System.out.println("El promedio es: "+promedio);

	}
	
	///MENOR= LA PRIMERA EDAD QUE ME INGRESE EL USUARIO
	//MENOR=200;

}
