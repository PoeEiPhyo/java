package FirstExercise;

import java.util.Scanner;

public class NumberTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter index:");
//		int n=sc.nextInt();
		
		int num=1;
		for(int i=0;i<5;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(num+++"\t");
			}
			System.out.println();
		}
	}

}
