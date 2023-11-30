package Default;
import java.util.Scanner;

public class A5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		float num;
		float pro=0;
		float count=0;
		int rta=1;
		float des;
		int en;
		while(rta == 1) {
			System.out.println("ingrese un numero");
			num = sc.nextFloat();
			pro=num+pro;
			count++;
			System.out.println("quiere agregar otro numero? (1 para si)");
			rta = sc.nextInt();
			
		}
		en=(int) (pro/count);
		des=pro/count;
		System.out.println("la media es: "+en);
		System.out.println("la media es: "+des);
		
		
		
	}

}
