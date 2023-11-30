package Default;
import java.util.Scanner;
public class A4_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, num2;
		System.out.println("ingrese el primer numero");
		num = sc.nextInt();
		System.out.println("ingrese el segundo numero");
		num2 = sc.nextInt();
		int a1 = num1 (num);
		int a2 = num2 (num2);
		System.out.println(a1 + " "+a2);
		if (a1==num2 && a2==num) {
			System.out.println("los numeros son amigos");
		}else {
			System.out.println("los numeros no son amigos");
		}
	}
	
	
	
	
	
	static int num1 (int num) {
		int res=0;
		
		for (int j=1; j<=num;j++) {
			if (num%j==0) {
				res=res+j;
			}
		
	}
		res=res-num;
		return res;


}
	static int num2 (int num2) {
		int res=0;
		
		for (int j=1; j<=num2;j++) {
			if (num2%j==0) {
				res=res+j;
			}
		
	}
		res=res-num2;
		return res;


}
}
