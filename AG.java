package Default;
import java.util.Scanner;

public class AG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i;
		String num1 = "";
		
		System.out.println("Ingrese un numero");
		num1 = sc.next();
		for (i=0; i<=num1.length(); i++) {
			
			String num2 = num1.substring(i);
			System.out.println(num2);
		}
		
		
		
	}

}
