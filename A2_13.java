package Default;
import java.util.Scanner;
public class A2_13 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int h = -1, m=-1, s=-1;
		while (h<0||h>23){
			System.out.println("Ingrese la hora");
			h = sc.nextInt();
		}
		while (m<0||m>59){
			System.out.println("Ingrese los minutos");
			m = sc.nextInt();
		}
		while (s<0||s>59){
			System.out.println("Ingrese los segundos");
			s = sc.nextInt();
		}
		s++;
		if (s==60) {
			m++;
			s=0;
		}
		if (m==60) {
			h++;
			m=0;
		}
		if (h==24) {
			h=0;
			
		}
		System.out.println("la bhora un segundo despues es: "+h+":"+m+":"+s);
		
		
		
	}

}
