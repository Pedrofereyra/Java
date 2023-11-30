package Default;
import java.util.Scanner;

public class A10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		double radio, circunferencia, area;
		System.out.println("ingrese el radio del circulo");
		radio = sc.nextDouble();
		circunferencia=(radio*2);
		area=(3.14159268*(radio*radio));
		System.out.println("la lonjitud del circulo es: "+circunferencia+" y el area es: "+area);

}}
