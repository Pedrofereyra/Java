package Default;
import java.util.Scanner;
public class A4_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, num2;
		System.out.println("ingrese el numero mas bajo");
		num = sc.nextInt();
		System.out.println("ingrese el numero mas alto");
		num2 = sc.nextInt();
		suma (num, num2);
		
	}
	static void suma (int num,int num2) {
		for (num=num; num<=num2; num++) {
			System.out.println(num);
			
		}

}
}
