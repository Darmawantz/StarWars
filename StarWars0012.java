package sembarang;

import java.util.Scanner;

public class StarWars0012 {
	public static void main(String[] args) {
		Scanner sIchsan = new Scanner (System.in);
		System.out.println("input ");
		int a = sIchsan.nextInt();
		
		System.out.println("output ");
		for (int i=0; i<=a;i++) {
			for(int j=1; j<=i;j++) {
				System.out.print(" ");
			}	
		for(int j=i; j<a;j++) {	
			System.out.print("X ");
		}
			System.out.println();
		}

	}
}
