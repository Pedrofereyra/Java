package Default;
import java.util.Scanner;
public class A4_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, num2, num3;
		System.out.println("ingrese el primer numero");
		num = sc.nextInt();
		System.out.println("ingrese el segundo numero");
		num2 = sc.nextInt();
		System.out.println("ingrese el tercer numero");
		num3 = sc.nextInt();
		int grande = distincion (num, num2, num3);
		
		System.out.println(grande);
	}
	static int distincion (int num,int num2,int num3) {
		int grande=0;
		if (num>num2&&num>num3) {
			grande=num;
		}
		if (num2>num&&num2>num3) {
			grande=num2;
		}
		if (num3>num&&num3>num2) {
			grande=num3;
		}
		return (grande);
		
		
	}

}
