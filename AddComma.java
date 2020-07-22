package FirstExercise;

import java.util.Scanner;

public class AddComma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		String str=sc.nextLine();
		char[] charArr=new char[str.length()];
		String output="";
		for(int i=0;i<str.length();i++) {
			charArr[i]=str.charAt(i);
		}			
		
		for(int i=0;i<charArr.length;i++) {
			if((i+1)%2==0) {
				System.out.print(charArr[i]);
				System.out.print(",");
			}
			else {
				System.out.print(charArr[i]);
			}
				
		}
		
	}

}
