package FirstExercise;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number:");
		int num=sc.nextInt();
		if(num==0) {
			System.out.println(1);
		}
		else {
			  int i,f=1;     
			  for(i=1;i<=num;i++){    
			      f=f*i;    
			  }    
			  System.out.println("Factorial of "+num+" is: "+f);    
			     
		}
	}

}
