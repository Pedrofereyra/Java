package Default;
import java.util.Scanner;
public class A3_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=0, num2;
		while (num>10 || num<1) {
			System.out.println("ingrese un numero del uno al diez");
			num = sc.nextInt();
			}
		num2=num;
		for (int i=0; i<10; i++) {
			System.out.println(num);
			num=num+num2;
			
		}
		
		
		
	}

}
