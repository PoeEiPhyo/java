package FirstExercise;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number:");
		int n1=sc.nextInt();
		
		System.out.println("Enter Second Number:");
		int n2=sc.nextInt();
		
		System.out.println("Enter Operator:");
		String ch=sc.next();
		int num=0;
		switch(ch) {
		case "+":num=n1+n2;break;
		case "-":num=n1-n2;break;
		case "*":num=n1*n2;break;
		case "/":num=n1/n2;break;
		}
		System.out.println(num);
	}

}
