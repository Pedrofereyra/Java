package Default;

import java.util.Scanner;

public class A5_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int vector[]= new int [6];
		int vector2[]= new int [6];
		int pass;
		for (int i=0; i<6;i++) {
			System.out.println("ingrese un numero");
			vector[i]=sc.nextInt();
		}
		for (int i = 0; i<5;i++) {
			for (int j=0; j<5; j++) {
				
				if (vector[j]<vector[j+1]) {
					pass=vector[j+1];
					vector[j+1]=vector[j];
					vector[j]=pass;
					
				}
				
				
			}
			
			
		}
		for (int i = 0; i<5;i++) {
			System.out.println(vector[i]);
		}
		for (int i=0; i<6;i++) {
			System.out.println("ingrese un numero");
			vector2[i]=sc.nextInt();
		}
		for (int i = 0; i<5;i++) {
			for (int j=0; j<5; j++) {
				
				if (vector2[j]<vector2[j+1]) {
					pass=vector2[j+1];
					vector2[j+1]=vector2[j];
					vector2[j]=pass;
					
				}
			}		
		}
		for (int i = 0; i<5;i++) {
			System.out.println(vector2[i]);
		}
		for (int i = 0; i<5;i++) {
			
			if (vector[i]>vector2[i]) {
				System.out.println(vector[i]);
				System.out.println(vector2[i]);
			}else {
				System.out.println(vector2[i]);
				System.out.println(vector[i]);
				
			}
			
		}
		
	
	}

}
