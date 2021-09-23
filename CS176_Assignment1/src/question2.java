import java.util.Scanner;
public class question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		int i = 0;
		int x = 10;
		double[] stud = new double[10];
		
		System.out.print("Enter 10 elements: ");

		while(i < x && in.hasNextDouble())
		{
			stud[i] = in.nextDouble();
			
			i++;
		}
		i = 0;
		while(i < 10) 
		{
			System.out.println(stud[i] + " ");
			i = i + 2;
			
		}
		for(double element : stud)
		{
			if(element%2 == 0)
			{
				System.out.print(element + " ");
			}
		}
		for(double element : stud)
		{
			if(element%2 != 0)
			{
				System.out.print(element + " ");
			}
		}
		System.out.println();
		
		System.out.print(stud[0] + " ");
		System.out.print(stud[4] + " ");
		System.out.print(stud[9] + " ");
		
		System.out.println();
		double large = 0;
		double small = 12;
		
		for(int g = 0; g < 10;g++)
		{
			if(stud[g] > large)
			{
				large = stud[g];
			}
			if(stud[g] < small)
			{
				small = stud[g];
			}
			
		}
		
		System.out.println("Largest Number: " + large);
		System.out.println("Smallet Number: " + small);
		
		double total = 0;
		for(i = 0; i < 10; i++) 
		{
			if(i%2 == 0)
			{
				total = total + stud[i];
			}
			if(i%2 != 0)
			{
				total = total - stud[i];
			}
		}
		System.out.println("Total: " + total);
		
		
		
		
		
		
		
		
		
			
	}
}
