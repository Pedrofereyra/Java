package Default;
import java.util.Scanner;
public class A4_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String letra;
		System.out.println("ingrese una letra");
		letra = sc.next();
		int resultado = vocal (letra);
		if (resultado==1) {
			System.out.println("Es una vocal");
		}else {
			
			System.out.println("No es una vocal");
		}
	}
	static int vocal (String vocal) {
		int res=0;
		if (vocal.equals("a")||vocal.equals("e")||vocal.equals("i")||vocal.equals("o")||vocal.equals("u")) {
			res=1;
		}else {
			res=0;
		}
		
		
		return res;
	}
	
	

}
