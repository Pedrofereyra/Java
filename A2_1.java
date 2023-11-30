package Default;
import java.util.Scanner;
public class A2_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese un numero");
		int num = sc.nextInt();
		
		num = num%2;
		if (num==0) {
			System.out.println("Es par");
		}else {
			
			System.out.println("Es impar");
		}
				
		
		
		
		
		
	}

}
