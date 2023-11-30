package Default;
import java.util.Scanner;
public class A2_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = -1, m=-1, d=-1;
		
		System.out.println("Ingrese el año");
		a = sc.nextInt();
		

		System.out.println("Ingrese el mes");
		m = sc.nextInt();
		
		
		
		System.out.println("Ingrese el dia");
		d = sc.nextInt();
		if (m<0||m>12) {
			System.out.println("el mes esta mal");
		}else {
			if (m==4 || m==6 || m==9 || m==11) {
				if (d>30 || d<1) {
					System.out.println("el dia esta mal");
				}
			}
			if (m==1 || m==3 || m==5 || m==7 || m==8 || m==10 || m==12) {
				if (d>31 || d<1) {
					System.out.println("el dia esta mal");
				}
			}
			if (m==2) {
				if (d>28 || d<1) {
					System.out.println("el dia esta mal");
					
				}
			}else {
				d++;
				if (m==4 || m==6 || m==9 || m==11) {
					if (d>30) {
						d=1;
						m++;
					}
				} else {
					if (m==1 || m==3 || m==5 || m==7 || m==8 || m==10 || m==12) {
						if (d>31) {
							d=1;
							m++;
						}
					}else {
						if (d>28) {
							d=1;
							m++;
							
						}
					}
				}
		if (m==13) {
			m=1;
			a++;
		}
		
	
		System.out.println("El dia siguiente es: "+a+"/"+m+"/"+d);
	}

}}}
