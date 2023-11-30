package Default;
import java.util.Scanner;
public class A2 {


	public static void main(String[] args) {
		int edad;
		System.out.println("Ingresa tu edad");
		Scanner sc = new Scanner(System.in);
		edad = sc.nextInt();
		edad=edad+1;
		System.out.println("tu edad el proximo año va a ser " + edad + " años");
		

	}

}