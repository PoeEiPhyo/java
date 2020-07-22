package FirstExercise;

import java.util.Scanner;

public class CharAddFromLastAndFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		String str=sc.nextLine();
		char l=str.charAt(str.length()-1);
		System.out.println(l+""+str+l);
	}

}
