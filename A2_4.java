package Default;
import java.util.Scanner;
public class A2_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		
		System.out.println("Ingrese un numero");
		num1 = sc.nextInt();
		System.out.println("Ingrese un segundo numero");
		num2 = sc.nextInt();
		if (num1==num2) {
			System.out.println("Son iguales");
			
		}else {
			if(num1<num2) {
				System.out.println("El primer numero es mayor");
				
			}else{
				System.out.println("El segundo numero es mayor");
				
			}
		}
		
		
		
		
		
		
	}

}
