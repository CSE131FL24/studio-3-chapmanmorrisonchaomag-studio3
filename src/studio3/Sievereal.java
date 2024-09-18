package studio3;

import java.util.Scanner;

public class Sievereal {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Pick a number for n: ");
		int n = in.nextInt();
		
		boolean[] primenumbers = new boolean [n];
		
		for (int i = 2; i < primenumbers.length; i++) {
			primenumbers[i] = true;
		}
		
		
		for (int j = 1; j < primenumbers.length; j++) {
			for (int k = 2; j*k < primenumbers.length; k++) {
				primenumbers[j*k] = false;
			}
		}
		for(int l = 0; l < primenumbers.length; l++) {
					System.out.println(primenumbers[l]);
		}

	}

}
