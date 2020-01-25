import java.util.Scanner;
public class Student {
	public static void main(String args[])
	{
		double avg = 5,result;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the length of the array:");
		int length = s.nextInt();
		int marks1[] = new int[length];
		System.out.println("Enter the elements of the array:");
		for(int i=0; i<length; i++ ) 
		{
			marks1[i] = s.nextInt();
			avg+=marks1[i];
		}
		result=avg/length;
		System.out.println("average"+result);
	}
	
}
