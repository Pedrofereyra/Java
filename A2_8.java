package Default;
import java.util.Scanner;
public class A2_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		float a, b, c;
		float x1,  x2, p;
		System.out.println("Ingrese el valor de a");
		a = sc.nextFloat();
		System.out.println("Ingrese el valor de b");
		b = sc.nextFloat();
		System.out.println("Ingrese el valor de c");
		c = sc.nextFloat();
		p=(float) Math.sqrt( b*2 - 4*a*c);
		
		x1 =((((b-b-b) + p) /2*a));
		x2 =((((b-b-b) - p) /2*a));
		
		System.out.println("el valor de x1 es: " +x1);
		System.out.println("el valor de x2 es: " +x2);
		
		
		
		
		
		
		
		
	}

}
