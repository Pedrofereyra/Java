package Default;
import java.util.Scanner;
public class A3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num=1, par;
		while (num>0||num<0) {
			System.out.println("Ingrese el numero");
			num = sc.nextInt();
			
			par=num%2;
			if (par==0) {
				System.out.println("es par");
			}else {
				System.out.println("es impar");
			}
			System.out.println(num*num);
			if (num>0) {
				System.out.println("es positivo");
			}
			
		}
	}

}
