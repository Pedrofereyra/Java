package Default;
import java.util.Scanner;
public class A3_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		num1 = sc.nextInt();
		num2=num1;
		
		for (int i=0; i<=num1; i++) {
			for (int j=0; j<num2; j++) {
				System.out.print("*");
			}
			num2=num2-1;
			System.out.println("");
		}
		
		
		
		
		
	}

}
