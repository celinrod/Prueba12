import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
public class ClaseArray{

	
	public static Scanner teclado=new Scanner(System.in);
	
	/*
	Ejercicio N.º 1
	Crear un array de 10 de números enteros, con valores solicitados por teclado. Mostrar por
	consola el índice y el valor de cada elemento. Realizar dos métodos, uno para el ingreso de
	datos y otro para la salida de datos.
	   
	  */
	
	public static void ejercicio1() {
		/*int [] vector=new int[10];
		CargarDatos(vector);
		MostrarDatos(vector);
		*/
		
		ArrayList<Integer> list=new ArrayList<>();
		CargarDatos(list);
		MostrarDatos(list);
		
		
	}
	/*public static void CargarDatos(int []a) {
		
		for(int i=0;i<a.length;i++) {
			System.out.println("Ingrese el elemento : "+i);	
			a[i]=teclado.nextInt();
		}
		
	}
	public static void MostrarDatos(int []a) {
		
		for(int i=0;i<a.length;i++) {
			System.out.println("Elemento: "+i +" :" +a[i]);	
				
		}
	}
	*/
	//---Solucion con ArrayList---
	
	public static void CargarDatos(ArrayList<Integer>a) {
		
		for(int i=0;i<10;i++) {
			System.out.println("Ingrese el elemento : "+i);	
			a.add(teclado.nextInt());
		}
	}
	
	public static void MostrarDatos(ArrayList<Integer>a) {
		for(int i=0;i<a.size();i++) {
			System.out.println("Elemento " +i+": "+a.get(i));	
			
		}
	}
	
	/*
	 Ejercicio N.º 2
	Crear un vector de 20 números reales correspondientes a los pesos de 20 personas. Obtener el
	peso mayor, el menor, el peso medio y visualizar un mensaje si hay alguna persona con un peso
	mayor de 100 kg. 
	  
	  */
	
	
	public static void ejercicio2() {
		double []vector=new double[5];
		CargarDatosDouble(vector);
		MostrarDatosDouble(vector);
		
		
	}
	public static void CargarDatosDouble(double[]a) {
		for(int i=0;i<a.length;i++) {
			System.out.println("Ingrese el elemento : "+i);	
			a[i]=teclado.nextDouble();
		}
	}
	public static void MostrarDatosDouble(double []a) {
		
		double suma=0;
		double menor=0;
		double mayor=0;
		int bandera=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]>=100) {
				bandera=1;
			}
			System.out.println("Elemento: "+i +" :" +a[i]);
			suma= suma+a[i];//Para el promedio
			if(i==0) { //si es el primer elemento
				menor=a[i];
				mayor=a[i];
			}else {
				if(a[i]<menor) {
					menor=a[i];
				}else {
					if(a[i]>mayor) {
						mayor=a[i];
					}
				}
			}
		}
		System.out.println("El peso mayor: "+mayor);
		System.out.println("El peso menor: "+menor);
		System.out.println("El peso medio: "+(suma/a.length));
		if(bandera==1) {
			System.out.println("Existe persona con un peso mayor o igual a 100");
		}
	}
	
	
	/*
	Ejercicio N.º 3
	Crear un vector de 10 números reales, con valores solicitados al usuario. Por otro lado solicitar
	una posición entre 0 y 9. Eliminar el elemento situado en esa posición sin dejar hueco. Visualizar
	el vector resultante. 
	*/
	
	public static void ejercicio3() {
		/*int tamaño=5;
		double []vector=new double[tamaño];
		CargarDatosDouble(vector);
		EliminarVecPos(3,vector);
		tamaño=tamaño-1;
		MostrarDatosD2(vector,tamaño);
		
		*/
		ArrayList<Double> lis=new ArrayList<>();
		cargar(lis,5);
		eliminar(lis,3);
		mostrar(lis);
	}
	public static void EliminarVecPos(int pos,double []a) {
		for(int i=pos;i<a.length-1;i++) {
			a[i]=a[i+1];
		}
		
	}
	public static void MostrarDatosD2(double[]a,int tamaño) {
		for(int i=0;i<tamaño;i++) {
			System.out.println("Elemento " +i+": "+a[i]);	
			
		}
	}
	
	//----solucion con ArrayList---
	
	public static void cargar(ArrayList<Double>a,int tamaño) {
		
		for(int i=0;i<tamaño;i++) {
			System.out.println("Ingrese el elemento: "+i);
			a.add(teclado.nextDouble());
		}
	}
	public static void eliminar(ArrayList<Double>a,int pos){
		a.remove(pos);
	}
	public static void mostrar(ArrayList<Double>a) {
		System.out.print(a.toString());
	}
	
	
	/*
	 Ejercicio N.º 4
	Generar 20 números enteros entre 1 y 100 de forma aleatoria 
	y contar cuántos de esos números
	enteros son divisibles entre 5. 
	  */
	
	public static void ejercicio4() {
		ArrayList<Integer>list=new ArrayList<>();
		CargarDatosR(list,5);
		System.out.println(list.toString());
		int result=cantDivisible(list,5);
		System.out.println("Cantidad de numeros divisibles entre 5 son:  "+result);
	}
	public static void CargarDatosR(ArrayList<Integer>a,int tam) {
		Random r=new Random();
		for(int i=0;i<tam;i++) {
			
			a.add(r.nextInt()*100+1);
		}
	}

	public static int cantDivisible(ArrayList<Integer>a,int c) {
		int contador=0;
		for(int i=0;i<a.size();i++) {
			if(a.get(i)%c==0) {
				contador++;
			}
		}
		
		
		return contador;
	}
	
	
	/*
	 Ejercicio N° 6
Escriba un programa que determine si una palabra es palíndromo. 
Palíndromo: palabra o expresión
que es igual si se lee de izquierda a derecha 
que de derecha a izquierda, por ejemplo, arenera. 
	 */
	public static void ejercicio6() {
		System.out.println("Ingrese la palabra a verificar");
		String palabra=teclado.next();
		char[]c=palabra.toCharArray();
		espalindromo(c);
		
	}
	public static void espalindromo(char[]cad) {
		
		char[]cad2=new char[cad.length];
		int j=0;
		for(int i=cad.length-1;i>=0;i--) {//formo cadena invertida
			cad2[j]=cad[i];
			j++;
		}
		if(compararCadena(cad,cad2)) {
			System.out.print("Es palindromo");
		}
		else {
			System.out.print("No es palindromo");
		}
		
	}
	public static boolean compararCadena(char[]c,char[]c1) {
		int i=0;
		int b=0;
		if(c.length!=c1.length) {
			return false;
		}
		else {
			while(i<c.length && b==0) {
				
				if(c[i]==c1[i]) {
					i++;
				}
				else {
					b=1;
				}
			}
			if(b==0) {
				return true;
			}
			else {
				return false;
			}
		}
		
	
	}
	
	
	
	/*
	 Ejercicio N° 7
	Escriba un programa que determine la cantidad de vocales
 	y consonantes de una palabra.
	  
	  */
	
	public static void ejercicio7() {
		System.out.println("Ingrese la cadena");
		String cadena=teclado.next();
		int cantV=0;
		int cantC=0;
		char [] vocales= {'a','e','i','o','u','A','E','I','O','U'};
		char [] caracterEspecial= {'#','"','$'};
		
		for(int i=0;i<cadena.length();i++) {
		
			if(pertenece(vocales,cadena.charAt(i))) {
				cantV++;
			}
			else {
				if(pertenece(caracterEspecial,cadena.charAt(i))==false) {
					cantC++;
				}
			}
		}
		System.out.println("Cantidad vocales : "+cantV);
		System.out.println("Cantidad consonantes : "+cantC);
	}
	public static boolean pertenece(char[]a,char c) {
		int i=0;
		int b=0;
		while(i<a.length && b==0) {
			
			if(a[i]==c) {
				b++;
			}
			else {
				i++;
			}
		}
		if(b==1) {
			return true;
		}else {
			return false;
		}
		
		
	}
	
	
	/*
	 
	  Ejercicio N° 8
	Ingrese 10 nombres de personas en un vector, luego ingrese un nombre cualquiera y búsquelo en el
	vector, si el nombre aparece en el vector mostrar "Nombre encontrado" en caso contrario "Nombre
	no encontrado".
	  */
	
	
	public static void ejercicio8() {
		
		String [] nombres= new String[4];
		String buscado;
		for(int i=0;i<nombres.length;i++ ) {
			System.out.println("Ingrese el nombre de la persona: "+i);
			nombres[i]=teclado.next();
		}
		System.out.println("Ingrese el numbre a buscar");
		buscado=teclado.next();
		
		System.out.print(busPalabra(nombres,buscado));
		
	}
	public static boolean busPalabra(String[]a,String nombre) {
		
		int i=0;
		int b=0;
		while(i<a.length && b==0) {
			if(a[i].equals(nombre)) {
				b=1;
			}
			else {
				i++;
			}
		}
		if(b==1) {
			return true;
		}else {
			return false;
		}
			
	}
	
	
	/*
	 Ejercicio N° 9
	Crear una matriz de 3×3 con los números del 1 al 9. 
	Mostrar por pantalla, tal como aparece en la matriz.
	  
	  */
	
	public static void ejercicio9() {
		
		
		int cantFila=3;
		int cantColum=3;
		int [][]matriz = new int[cantFila][cantColum];
		crearMatriz(matriz,cantFila,cantColum);
		mostrarMatriz(matriz,cantFila,cantColum);
	}
	
	public static  void crearMatriz(int [][] a,int f,int c) {
		
	
		for(int i=0;i<f;i++) {
			for(int j=0;j<c;j++) {
				System.out.println("Ingrese elemento :"+i+","+j);
				a[i][j]=teclado.nextInt();
			}
		}
	}
	public static void mostrarMatriz(int[][]a,int f, int c) {
		for(int i=0;i<f;i++) {
			System.out.print("\n");
			for(int j=0;j<c;j++) {
				
				System.out.print("\t"+a[i][j]);
			}
		}
	}
	
	
	/*
	 
	  Ejercicio N° 10
	Crear dos matrices de mxn y sumar sus valores, los resultados se deben almacenar en otra matriz.
	Los valores y la longitud, serán insertados por el usuario. Mostrar las matrices originales y el
	resultado.
	  */
	public static void ejercicio10() {
		
		int tamF=0;
		int tamC=0;
		int[][]matriz1;
		int [][]matriz2;
		int [][]matrizSuma;
		System.out.println("Ingrese el tamaño de la fila");
		tamF=teclado.nextInt();
		System.out.println("Ingrese el tamaño de la columna");
		tamC=teclado.nextInt();
		matriz1=new int[tamF][tamC];
		matriz2=new int[tamF][tamC];
		matrizSuma=new int[tamF][tamC];
		crearMatriz(matriz1,tamF,tamC);
		crearMatriz(matriz2,tamF,tamC);
		sumarMatriz(matriz1,matriz2,matrizSuma,tamF,tamC);
		mostrarMatriz(matriz1,tamF,tamC);
		System.out.print("\n");
		mostrarMatriz(matriz2,tamF,tamC);
		System.out.print("\n");
		mostrarMatriz(matrizSuma,tamF,tamC);
		
	}
	
	public static void sumarMatriz(int[][]m1,int[][]m2,int[][]result,int f, int c) {
		
		for(int i=0;i<f;i++) {
			for(int j=0;j<c;j++) {
				result[i][j]=m1[i][j]+m2[i][j];
			}
		}
	}
	
	public static void main(String[] args) {
		ejercicio10();
		
	
	}

}
