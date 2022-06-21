import java.util.ArrayList;

public class EjemploArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int vector1[]=new int[10]; 
		vector1[0]=10;
		String []diasLaborables= {"Lunes", "Martes","Miercoles","Jueves","Vienes"};
		//ArrayList
		ArrayList<String>diasLaborables2= new ArrayList<String>();
		ArrayList<String>diasLaborables3= new ArrayList<String>();
		diasLaborables2.add("Lunes");
		//diasLaborables2.add("Martes");
		diasLaborables2.add("Miercoles");
		diasLaborables2.add("Jueves");
		diasLaborables2.add("Viernes");
		diasLaborables2.add(1, "Martes");
		//diasLaborables2.set(0, "Domingo");
		
		diasLaborables3=(ArrayList<String>) diasLaborables2.clone();
		
		System.out.println(diasLaborables2.toString());
		
		
		for (int i=0;i<diasLaborables2.size();i++) {
		  System.out.println(diasLaborables2.get(i)); 
		 } 
		
		diasLaborables2.clear();
		if(diasLaborables2.size()==0) 
		  { System.out.println("Lista vacia"); }
		 

	}

}
