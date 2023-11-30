package Default;
import java.util.Scanner;
public class A6_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		  String caracter;
	

          System.out.println("Ingrese cualquier palabra o frase");
          caracter = sc.nextLine();
          
          caracter = caracter.replaceAll("[aeiou]","");
          System.out.println(caracter);
          
		
		
		
	}

}
