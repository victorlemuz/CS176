import java.util.Scanner;

public class VictorLemuzCs176Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in); 
		
		int[][] twodArray = new int[4][4]; 
		
		int total = 0;
		for(int i = 0; i < twodArray.length; i++)
		{
			for(int x = 0; x < twodArray[0].length; x++)
			{
				twodArray[i][x] = i + x;
				System.out.print(twodArray[i][x] + "   ");
			}
		}
		
		for(int y = 0; y < twodArray[0].length; y++)
		{
			total = twodArray[2][y];
		}
		System.out.println();
		System.out.println("Sum of elements at second row: " + total);
		total = 0;
		
		for(int y = 0; y < twodArray.length; y ++)
		{
			total = twodArray[y][3] + total;
		}
		System.out.println("Sum of third column: " + total);
		total = 0;
		
		for(int column = 0; column < twodArray[0].length; column++)
		{
			for(int row = 0; row < twodArray.length; row++)
			{
			total = twodArray[column][row] + total;
			}
		}
		System.out.println("Sum of all elements: " + total);
	
		
		for(int i = 0; i < twodArray[0].length; i++)
		{
			for(int x = 0; x < twodArray.length; x++)
			{
			System.out.print(twodArray[i][x] + "   ");
			}
			System.out.println();
		}
		
		
		
		
	
		
	}

}
