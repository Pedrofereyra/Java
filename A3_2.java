package Default;
import java.util.Scanner;
public class A3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int edad = 0, contador=0, total=0, m=0;
		float promedio=0;
		while (edad>=0) {
			System.out.println("Ingrese la edad de un alumno");
			edad = sc.nextInt();
			if (edad>=0){
				total=total+edad;
				contador++;
				if (edad>=18) {
					m++;
				}
			}
		}
		promedio = total/contador;
		System.out.println("El promedio de edad es: "+ promedio);
		System.out.println("El total de edad es: "+ total);
		System.out.println("El total de alumnos es: "+ contador);
		System.out.println("El total de alumnos mayores a 18 es: "+ m);
	}

}
