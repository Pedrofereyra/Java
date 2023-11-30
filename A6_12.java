package Default;
import java.util.Scanner;
import java.util.Arrays;
public class A6_12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String palabra1, palabra2;
		System.out.println("Escriba una palabra: "); 
		palabra1 = sc.nextLine(); 
		System.out.println("Escriba otra: "); 
		palabra2 = sc.nextLine();

		if (palabra1.length() != palabra2.length()) {

		System.out.println("No son anagramas"); 

		} else {

		char p1[] = palabra1.toCharArray();
		char p2[] = palabra1.toCharArray();

		Arrays.sort(p1); 

		Arrays.sort (p2);

		palabra1 = String.copyValueOf(p1); 
		palabra2 = String.copyValueOf(p2); 
		if (palabra1.equalsIgnoreCase(palabra2)) { 
			System.out.println("son anagramas");
		} else {

		System.out.println("No son anagramas");
	
			}
		}
	}}

