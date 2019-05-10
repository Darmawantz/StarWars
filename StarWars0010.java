package sembarang;

import java.util.Scanner;

public class StarWars0010 {
	public static void main(String[] args) {
		// Nama 	: Darmawan;
		// NIM		: D0217504;
		// Kelas	: TI.A 2017;
		Scanner sIchsan = new Scanner (System.in);
		System.out.println("input ");
		int a = sIchsan.nextInt();
		
		System.out.println("output ");
		for (int i=0; i<=a;i++) {
			for(int j=1; j<=i;j++) {
				System.out.print("  ");
			}	
		for(int j=i; j<a;j++) {
			System.out.print("X ");
		}
			System.out.println();
		}
}
}