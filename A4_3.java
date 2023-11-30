package Default;
import java.util.Scanner;
public class A4_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tipo;
		float radio, altura;
		System.out.println("que operacion quiere hacer? (1 para area, 2 para volumen)");
		tipo = sc.nextInt();
		System.out.println("ingrese el radio");
		radio = sc.nextFloat();
		System.out.println("ingrese la altura");
		altura = sc.nextFloat();
		calculos (tipo,radio,altura);
		
	}
	
	
	static void calculos (int tipo,float radio,float altura) {
		double area, volumen;
		
		if (tipo==1) {
			area=3.14159265*2*radio*(altura+radio);
			System.out.print(area);
		}else {
			
			volumen=3.14159265*(radio*radio)*altura;
			System.out.print(volumen);
		}
		
		
		
		
	}
	
	

}
