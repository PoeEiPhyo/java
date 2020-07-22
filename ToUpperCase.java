package FirstExercise;

import java.util.Scanner;

public class ToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		String str=sc.nextLine();
		char[] input=new char[str.length()];
		for(int i=0;i<str.length();i++) {
			input[i]=str.charAt(i);
		}
		String output = "";  
        for (int i = 0; i < str.length(); i++) { 
          if(i==0 || input[i-1]==' ' && input[i]!=' ') {    	
        	 if (input[i] >= 'a' && input[i] <= 'z')  
             {  
                output += (char)(input[i] - 'a' + 'A');  
             }  
           }
	       else{
	            output += input[i]; 
	       }
           
        }  
        System.out.println(output);
	}

}
