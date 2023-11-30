package Default;
import java.util.Scanner;
import java.util.Scanner;

public class P1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, total=1, num2;
		num1 = sc.nextInt();
		num2=num1;
		for(int i=1; i<num1; i++) {
			total=total*num2;
			num2=num2-1;	
		}
		System.out.print(total);
	}

}
