package Default;
import java.util.Scanner;
public class A2_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		System.out.println("Ingrese un numero");
		num1 = sc.nextInt();
		System.out.println("Ingrese un segundo numero");
		num2 = sc.nextInt();
		if (num1<num2) {
			System.out.println(num1);
			System.out.println(num2);
		}else {
			System.out.println(num2);
			System.out.println(num1);
			
			
		}
	}

}
