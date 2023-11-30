package Default;
import java.util.Scanner;
public class A2_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float Vector[] = new float[3];
		float a;
		int i =0, j=0;
		Scanner sc = new Scanner(System.in);
		for (i=0; i<Vector.length; i++ ) {
			Vector[i] = sc.nextFloat();
		} //llena vector
	
		
		for (i=0; i<Vector.length-1; i++ ) {
			for (j=0; j<Vector.length-1; j++) {
				
				if (Vector[j]<Vector[j+1]) {	
					a=Vector[j+1];
					Vector[j+1]=Vector[j];
					Vector[j]=a;
			}		
			}
		} 
	
		for (i=0; i<Vector.length; i++ ) {		
			System.out.println(Vector[i]);
		} 		
		
		
		
		
		
		
		
	}

}
