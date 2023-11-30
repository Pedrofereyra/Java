package Default;
import java.util.Scanner;
public class A3_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1, c=1, contador=0,num2,contador2=0;
		num1 = sc.nextInt();
		num2=num1;
		for (int i=0;i<num1;i++) {
			c=1;
			while (c<=i) {
				if (i%c==0) {
					contador++;
				}
				c++;
			}
			if (contador<=2) {
				contador2++;
			}
			contador=0;
		}
		System.out.print("la cantidad de numeros primos es "+contador2);
		
			
		
		
		
		
		
		
		
	}

}
