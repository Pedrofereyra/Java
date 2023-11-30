package Default;
import java.util.Scanner;
public class A6_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String palabra , ad ="", prim,sec;
		int larg = 0;
		palabra=sc.next();
		larg=palabra.length();
		System.out.println("la longitud de la palabra es: "+larg);
		prim = palabra.substring(0,1);
		sec = palabra.substring(larg-1,larg);
		System.out.println("la primera letra es "+prim+" la ultima letra es "+ sec);
		while (!palabra.equals(ad)) {
			System.out.println("Ingrese la palabra");
		
			ad=sc.next();
			
			if (palabra.equals(ad)) {
				System.out.println("la palabra es la correcta");
				
			}else {
				System.out.println("la palabra es incorrecta, intente devuelta");
			}
		
		}
	
	
	
	}

}
