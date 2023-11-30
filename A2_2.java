package Default;
import java.util.Scanner;
public class A2_2 {

	public static void main(String[] args) {
		int num1, num2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese un numero");
		num1 = sc.nextInt();
		System.out.println("Ingrese un segundo numero");
		num2 = sc.nextInt();
		if (num1==num2) {
			System.out.println("Son iguales");
			
		}else {
			System.out.println("No son iguales");
			
		}
		

	}

}
