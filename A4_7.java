package Default;
import java.util.Scanner;
public class A4_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("ingrese un numero");
		num = sc.nextInt();
		int res = Primo (num);
		if (res==2){
			System.out.println("es primo");
			
		}else {
			System.out.println("no es primo");
		}
	}
	static int Primo (int num) {
		
		int c=1, contador=0, i=0;
		i=num;
		while (c<=i) {
			if (i%c==0) {
				contador++;
			}
			c++;
		}
		if (contador<=2) {
			return 2;
		}else {
			return 1;
		}
		
		
		
	}

}
