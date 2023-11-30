package Default;
import java.util.Scanner;
public class A3_9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int al=0, ar=1, max=0, m=0;
		while (al !=-1) {
			System.out.println("ingrese la altura");
			al = sc.nextInt();
			if (al==-1) {
				
			}else {
				if (al>max) {
					max=al;
					m=ar;
				}
				
				
				
			}
			ar++;	
		}
		System.out.println("la altura maxima es "+max+" y es del arbol "+m);
	}

}
