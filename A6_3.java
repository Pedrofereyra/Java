package Default;
import java.util.Scanner;
public class A6_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String palabra="", total="", fin="fin";
		while (!palabra.equalsIgnoreCase(fin)) {
			total=total+palabra;
			total=total+" ";
			
			palabra=sc.next();
		}
		System.out.println(total);
		
	}

}
