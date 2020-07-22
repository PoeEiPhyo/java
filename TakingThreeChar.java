package FirstExercise;

import java.util.Scanner;

public class TakingThreeChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		String str=sc.nextLine();
		
		
		
		if(str.length()<=3) {
			System.out.println(str);
		}
		else {
			String add=str.substring(0,3);
			System.out.println(add+str+add);
		}
	}

}
