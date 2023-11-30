package Default;
import java.util.Scanner;
public class P4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float total=0, res, num2;
		float contador=0;
		String num1="";
		int f=0;
		while (f==0) {
			System.out.println("ingrese el numero");
			
			num1 = sc.next();
			if (num1.equals("fin")) {
				f=1;
			}else {
				num2=Integer.parseInt(num1);
				total=total+num2;
				contador++;
						
			}
			
		}
		total=total/contador;
		System.out.print(total);
		
		
		
	}

}
