package FirstExercise;

import java.util.Scanner;

public class RemoveChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter index:");
		int index=sc.nextInt();
		String s="Hello";
		String result=s.substring(0, index)+s.substring(index+1);
		System.out.println(result);
	}

}
