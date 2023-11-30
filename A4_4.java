package Default;
import java.util.Scanner;
public class A4_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, num2;
		System.out.println("ingrese el primer numero");
		num = sc.nextInt();
		System.out.println("ingrese el segundo numero");
		num2 = sc.nextInt();
		int grande = distincion (num, num2);
		
		System.out.println(grande);
	}
	static int distincion (int num,int num2) {
		int grande=0;
		if (num>num2) {
			grande=num;
		}
		if (num2>num) {
			grande=num2;
		}
		return (grande);
		
		
	}

}
