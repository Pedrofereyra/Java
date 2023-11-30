package Default;
import java.util.Scanner;

public class A8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float p1, p2, p3, p4, pt, pp;
		float m1, m2, m3, m4, mt, mp;
		Scanner sc = new Scanner(System.in); 
		System.out.println("cuantos kilos de peras vendio el primer trimestre?");
		p1 = sc.nextFloat();
		System.out.println("cuantos kilos de peras vendio el segundo trimestre?");
		p2 = sc.nextFloat();
		System.out.println("cuantos kilos de peras vendio el tercer trimestre?");
		p3 = sc.nextFloat();
		System.out.println("cuantos kilos de peras vendio el cuarto trimestre?");
		p4 = sc.nextFloat();
		System.out.println("cuantos kilos de manzanas vendio el primer trimestre?");
		m1 = sc.nextFloat();
		System.out.println("cuantos kilos de manzanas vendio el segundo trimestre?");
		m2 = sc.nextFloat();
		System.out.println("cuantos kilos de manzanas vendio el tercer trimestre?");
		m3 = sc.nextFloat();
		System.out.println("cuantos kilos de manzanas vendio el cuarto trimestre?");
		m4 = sc.nextFloat();
		pt=p1+p2+p3+p4;
		mt=m1+m2+m3+m4;
		mp=(float) (mt*2.35);
		pp=(float) (pt*1.95);
		System.out.println("El importe total de manzanas es: "+mp+" euros, y el de peras es: "+pp+" euros");
		
	}

}
