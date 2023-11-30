package Default;
import java.util.Scanner;
public class A3_8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, total=1, num2=0;
		int i;
		System.out.println("Ingrese un numero");
		num = sc.nextInt();
		num2=num;
		for (i=0; i<num; i++) {
			total=total*num2;
			num2=num2-1;
		}
		System.out.println(total);
	}

}
