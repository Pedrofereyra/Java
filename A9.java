package Default;
import java.util.Scanner;

public class A9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float p1, p2, p3, pt, pp, pv;
		float m1, m2, m3, mt, mp, mv;
		Scanner sc = new Scanner(System.in); 
		System.out.println("cual es el precio del kilo de peras?");
		pv = sc.nextFloat();
		System.out.println("cual es el precio del kilo de manzanas?");
		mv = sc.nextFloat();
		System.out.println("cuantos kilos de peras vendio el primer trimestre?");
		p1 = sc.nextFloat();
		System.out.println("cuantos kilos de peras vendio el segundo trimestre?");
		p2 = sc.nextFloat();
		System.out.println("cuantos kilos de peras vendio el tercer trimestre?");
		p3 = sc.nextFloat();
	
		System.out.println("cuantos kilos de manzanas vendio el primer trimestre?");
		m1 = sc.nextFloat();
		System.out.println("cuantos kilos de manzanas vendio el segundo trimestre?");
		m2 = sc.nextFloat();
		System.out.println("cuantos kilos de manzanas vendio el tercer trimestre?");
		m3 = sc.nextFloat();
		
		pt=p1+p2+p3;
		mt=m1+m2+m3;
		mp=(float) (mt*mv);
		pp=(float) (pt*mv);
		System.out.println("El importe total de manzanas es: "+mp+" euros, y el de peras es: "+pp+" euros");
		
	}

}
