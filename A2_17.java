package Default;
import java.util.Scanner;
public class A2_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int CantA, KxA, KC, ComT,KA;
		System.out.println("Cuantos animales hay?");
		CantA = sc.nextInt();
		System.out.println("Cuanto consume cada animal?");
		KxA = sc.nextInt();
		System.out.println("Cuantos kilos compro");
		KC = sc.nextInt();
		ComT=CantA*KxA;
		if (ComT<=KC) {
			System.out.println("Hay suficiente comida");
			
		}else {
			KA=KC/CantA;
			
			System.out.println("Las raciones deben ser de: "+KA+" kilos");
			
		}
			
		
		
		
	}

}
