package FirstExercise;

public class ShowNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1;
		for(int i=1;i<=100;i++) {
			for(int j=1;j<=10;j++) {
				System.out.print((num++)+"\t");
			}
			System.out.println();
		}
	}

}