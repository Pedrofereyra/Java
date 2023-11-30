package Default;
import java.util.Scanner;

public class AH {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dia, año, mes, total, cifra1, cifra2, cifra3, cifra4;
		System.out.println("Ingrese su dia de nacimiento");
		dia = sc.nextInt();
		System.out.println("Ingrese su mes de nacimiento");
		mes = sc.nextInt();
		System.out.println("Ingrese su año de nacimiento");
		año = sc.nextInt();
		
		total=dia+mes+año;
		
		cifra1 = total/1000;
		cifra2 = total/100%10;
		cifra3 = total/10%10;
		cifra4 = total%10; 
		
		total=cifra1+cifra2+cifra3+cifra4;
		
		System.out.println("el numero de la suerte es: "+ total);
		
		
		
		

	}

}
