package Default;
import java.util.Scanner;
public class A3_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int contadorD=0,contadorA=0,contadorC=0;
		float nota;
		for (int i=0; i<=5; i++) {
			System.out.println("ingrese una nota");
			nota = sc.nextFloat();
			if (nota<4) {
				contadorD++;
			}
			if (nota==4) {
				contadorC++;
			}
			if (nota>4) {
				contadorA++;
			}
			
			
		}
		System.out.println("la cantidad de desaprobados con notas menores a 4 es "+contadorD);
		System.out.println("la cantidad de aprobados es "+contadorA);
		System.out.println("la cantidad de condicionados es "+contadorC);
	
	
	}

	
	

}
