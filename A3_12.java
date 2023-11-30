package Default;
import java.util.Scanner;
public class A3_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int contador=0;
		float nota;
		for (int i=0; i<=4; i++) {
			System.out.println("ingrese una nota");
			nota = sc.nextFloat();
			if (nota<4) {
				contador++;
			}
			
			
		}
		System.out.print("la cantidad de desaprobados con notas menores a 4 es "+contador);
	
	
	
	}

	
	

}
