package Default;
import java.util.Scanner;
public class A2_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float num1;
		num1 = sc.nextFloat();
		if (num1<1 && num1>-1) {
			System.out.println("Es un casi cero");
			
		}else {
			
			System.out.println("no es un casi cero");
		}
		
		

	}

}
