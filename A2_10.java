package Default;

import java.util.Scanner;

public class A2_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String n;
		n = sc.next();
		String capicua = "";
		
		for (int indice = n.length() - 1; indice >= 0; indice--) {
			capicua += n.charAt(indice);
		}
		
		
		if (capicua.equals(n)) {
			System.out.println("Su numero es capicua"); 
		}
		else {
			System.out.println("su numero no es capicua");
		}
	}

}
