package Default;
import java.util.Scanner;
public class A3_5 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2, num3;
		System.out.println("Ingrese el numero mas alto");
		num1 = sc.nextInt();
		System.out.println("Ingrese el numero mas bajo");
		num2 = sc.nextInt();
		num3=num2-1;
		while (num3<=num2 || num3>=num1) {
			System.out.println("Ingrese un numero entre el rango aterior");
			num3 = sc.nextInt();
		}
		

	}

}
