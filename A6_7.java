package Default;
import java.util.Scanner;
public class A6_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sTexto;
		System.out.println("ingrese la oracion");
		   sTexto = sc.nextLine();
		String texto2;
	    System.out.println("ingrese la palabra a buscar");
	    	texto2 = sc.nextLine();
	    int contador = 0;

	    while (sTexto.indexOf(texto2) > -1) {
	      sTexto = sTexto.substring(sTexto.indexOf(
	        texto2)+texto2.length(),sTexto.length());
	      contador++; 
	    }

	    System.out.println (contador);
	}

}
