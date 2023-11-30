package Default;
import java.util.Scanner;

public class A7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		double num;
		int num2;
		System.out.println("ingrese un numero decimal");
		num = sc.nextDouble();
		num2= (int) (num+0.5);
		System.out.print("el numero redondeado es: " +num2 );
		

	}

}
