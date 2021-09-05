package assignment2;

import java.util.Scanner;

public class naturalnumbersumdemo {
	public static void main(String[] args) {
		System.out.println("Enter a n");
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int k;
		int sum =0;
		for(k=1;k<=n;k++) {
			if(k%3==0 || k%5==0);
			sum = sum+k;
		}
				System.out.println(sum);
	}		

}
