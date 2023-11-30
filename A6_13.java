package Default;
import java.util.Scanner;
public class A6_13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String frase;
		int[] numVeces;
		
		System.out.println("ingrese la oracion");
		frase = sc.nextLine();
		
		frase = frase.toLowerCase();
		numVeces = new int ['z' - 'a' + 1];
		
		for (int i = 0; i<frase.length(); i++) {
			if (Character.isLetter(frase.charAt(i))) {
				numVeces[frase.charAt(i) - 'a']++;
			}
		}
		
		for (int i=0;i<'z' - 'a'; i++) {
			if (numVeces[i] != 0) {
				System.out.println("la letra " + (char) (i + 'a') + " se repite " + numVeces[i]);
			}
		}
		
	}

}
