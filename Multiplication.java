package FirstExercise;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number:");
		int num=sc.nextInt();
		
		for(int i=1;i<=12;i++) {
			System.out.println(num+"\t*\t"+i+"\t=\t"+(num*i));
		}
	}

}
