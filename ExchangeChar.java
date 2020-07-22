package FirstExercise;

import java.util.Scanner;

public class ExchangeChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		String str=sc.nextLine();
		
		if(str.length()<=1) {
			System.out.println(str);
		}
		else {
			System.out.println(str.charAt(str.length()-1)+str.substring(1, str.length()-1)+str.charAt(0));
		}
	}

}
