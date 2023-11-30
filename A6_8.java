package Default;
import java.util.Scanner;
public class A6_8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String frase, frase2="";
		System.out.println("ingrese la oracion");
		frase = sc.nextLine();
		for(int i=1;i<frase.length()+1;i++) {
			if(" "==frase.substring(i-1,i)) {

			}else {
				frase2=frase.substring(i-1,i)+frase2;
			}
		
		}
		System.out.println(frase2);
		
		
	}

}
