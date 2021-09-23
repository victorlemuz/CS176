
public class question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] array = new int[10];
		
	
		array[0] = 17;
		array[9] = 29;
		
		for(int i = 1; i < 9; i++)
		{
			array[i] = -1;
		}
		for(int i = 0; i < 10; i++)
		{
			array[i] = (array[i] + 1);
		}
		for(int i = 0; i < 10; i++)
		{
			System.out.println(array[i]);
		}
		for(int i = 0; i < 9; i++)
		{
			System.out.print(array[i] + ", ");
		}
		System.out.print(array[9]);
		
	
	
	
	}

}
