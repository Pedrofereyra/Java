package Default;
import java.util.Scanner;
public class A6_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String palabra1 = "", palabra2 = "";
		palabra1=sc.next();
		palabra2=sc.next();
		int distancia1, distancia2;
		
		distancia1 = palabra1.length();
		distancia2 = palabra2.length();
		
		if (distancia1 > distancia2) {
			System.out.println("la palabra mas corta es: "+ palabra2);
			
			
		}else {
			if (distancia2 > distancia1) {
				
				System.out.println("la palabra mas corta es: "+ palabra1);
			}else {
				System.out.println("las palabras son del mismo largo");
			}
		}
		
		
	}

}
