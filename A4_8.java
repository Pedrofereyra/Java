package Default;
import java.util.Scanner;
public class A4_8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("ingrese un numero");
		num = sc.nextInt();
		int res = Primo (num);
		
	}
	

	
	
	
	static int Primo (int num) {
		
		int c=1, contador=0, i=0;
		
		
		
		for (int j=1; j<=num;j++) {
			c=1;
			if (num%j==0) {
				i=j;
				contador=0;
				while (c<=i) {
					if (i%c==0) {
						contador++;
					}
					c++;
				}
				if (contador<=2) {
					System.out.println(j+ " primo");
				}else {
					System.out.println(j+ " no primo");
				}
				
				
				
			}
		}
		return i;

		
		
	}
}
		