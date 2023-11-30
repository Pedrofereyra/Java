package Default;
import java.util.Scanner;
public class A6_9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String frase;
		System.out.println("ingrese la oracion");
		frase = sc.nextLine();
		String principio="Javalin Javalon ";
		String fina=" Javalen, len, len";
		if (frase.startsWith(principio)) {
			frase=frase.substring(principio.length());
		}
		if (frase.endsWith(fina)) {
			frase=frase.substring(0, frase.length() - fina.length());
		}
		System.out.print(frase);
	
	}

}
