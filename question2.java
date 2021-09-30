import java.util.ArrayList;
import java.util.Scanner;
import java.util.Scanner;
public class question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		ArrayList<Integer> list = new ArrayList<>();
		Scanner in = new Scanner(System.in);
		int i = 0;
		int n = 0;
		
		
		System.out.println("Please enter integers to fill the list(type 'done 'once finished: ");
		
		while(in.hasNextDouble())
		{
			n = in.nextInt();
			list.add(n);
			i++;
		}
		System.out.println();
		
		for(int a = 0; a < list.size()-1; a = a+2)
		{
			System.out.print(list.get(a)+ " ");
		}
		System.out.println();
		
		for(int element : list)
		{
			if(element%2 == 0)
			{
				System.out.print(element + " ");
			}
		}
		System.out.println();
		
		for(int a = 0; a < list.size()-1; a++)
		{
			if(list.get(a)%2 != 0)
			{
				System.out.print(list.get(a)+ " ");
			}
		}
		System.out.println();
		
		int old;
		int next;
		
		System.out.print("Reverse: ");
		
		for(int y = list.size()-1; y >=0; y--)
		{
			System.out.print(list.get(y) + " ");
		}
		
		System.out.println();
		System.out.print("First: " + list.get(0) + " \t ");
		System.out.print("Middle: " + list.get((list.size()-1)/2) + " \t ");
		System.out.print("Last: " + list.get(list.size()-1));
		
		
		double large = list.get(0);
		double small = list.get(0);
		System.out.println();
		for(int a = 0; a < list.size(); a++)
		{
			if(list.get(a) > large)
			{
				large = list.get(a);
			}
			if(list.get(a) < small)
			{
				small = list.get(a);
			}
		}
		
		
		System.out.print("largest: " + large + " \t ");
		System.out.print("smallest: " + small);
		System.out.println();
		
		int total = 0;
		for(i = 0; i < list.size(); i++)
		{
			if(i%2 == 0)
			{
				total = total + list.get(i);
			}
			if(i%2 != 0 )
			{
				total = total -list.get(i);
			}
			
		}
		System.out.println("Total:" + total);
		
		
		
		
		}

}
