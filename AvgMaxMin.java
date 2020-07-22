package FirstExercise;

import java.util.Arrays;
import java.util.Scanner;

public class AvgMaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter index:");
		int num=sc.nextInt();
		int[] numArr=new int[num];
		int[] reverseArr=new int[num];
		int min1=numArr[0];
		int max=numArr[0];
		int total=0;
		for(int i=0;i<num;i++) {
			System.out.println("Enter Your number:");
			numArr[i]=sc.nextInt();
			total+=numArr[i];
		}
		Arrays.sort(numArr);
		System.out.println("The first minimum value is "+numArr[0]);
		System.out.println("The second minimum value is "+numArr[1]);
		
		for(int i=0;i<numArr.length;i++) {
			reverseArr[i]=numArr[num-(i+1)];
		}
		System.out.println("The first maximum value is "+reverseArr[0]);
		System.out.println("The second maximum value is "+reverseArr[1]);
		
		int average=total/num;
		System.out.println("The average is "+average);
	}

}
