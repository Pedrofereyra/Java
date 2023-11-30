package Default;
import java.util.Scanner;
public class A5_9 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String[] nombres= new String [5];
	int primer[]= new int [5];
	int segundo[]= new int [5];
	int tercero[]= new int [5];
	
	for (int i=0; i<5;i++) {
		System.out.println("ingrese el nombre del alumno numero "+(i+1));
		nombres[i]=sc.next();
	}
	for (int i=0; i<5;i++) {
		System.out.println("ingrese la nota del primer trimestre del alumno "+nombres[i]);
		primer[i]=sc.nextInt();
	}
	for (int i=0; i<5;i++) {
		System.out.println("ingrese la nota del segundo trimestre del alumno "+nombres[i]);
		segundo[i]=sc.nextInt();
	}
	
	for (int i=0; i<5;i++) {
		System.out.println("ingrese la nota del tercer trimestre del alumno "+nombres[i]);
		tercero[i]=sc.nextInt();
	}
	System.out.println("el promedio del primer trimestre es: "+((primer[0]+primer[1]+primer[2]+primer[3]+primer[4])/5));
	System.out.println("el promedio del primer trimestre es: "+((segundo[0]+segundo[1]+segundo[2]+segundo[3]+segundo[4])/5));
	System.out.println("el promedio del primer trimestre es: "+((tercero[0]+tercero[1]+tercero[2]+tercero[3]+tercero[4])/5));
	
	for (int i = 0; i<5;i++) {
		System.out.println("el promedio de "+nombres[i]+" es "+((primer[i]+segundo[i]+tercero[i])/3));
	}

	}

}
