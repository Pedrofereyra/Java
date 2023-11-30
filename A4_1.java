package Default;
import java.util.Scanner;
public class A4_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("ingrese el numero");
		num = sc.nextInt();
		eco (num);
	}
	
	static void eco (int num) {
		for (int i=0; i<=num; i++) {
			System.out.println("eco");
			
		}
		
	}

}
