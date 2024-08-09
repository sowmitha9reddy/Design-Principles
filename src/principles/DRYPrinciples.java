package principles;

import java.util.Scanner;

public class DRYPrinciples {

	public static void main(String[] args) {
//		for(int i=1;i<=3;i++) {
//			for(int j=1;j<=3;j++) {
//				if(i==1||j==1||i==3||j==3) {
//					System.out.print("*"+ " ");
//				}
//				else {
//					System.out.print("  ");
//				}                                                 //Before using Dry Principle
//			}
//			System.out.println();
//		}
//		for(int i=1;i<=4;i++) {
//			for(int j=1;j<=4;j++) {
//				if(i==1||j==1||i==4||j==4) {
//					System.out.print("*"+ " ");
//				}
//				else {
//					System.out.print("  ");
//				}
//			}
//			System.out.println();
//		}
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		hallowSuqare(n);
		scan.close();
	}
	
	static void hallowSuqare(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==1||j==1||i==n||j==n) {                           //After Using Dry Principle
					System.out.print("*"+ " ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
			
        
}
