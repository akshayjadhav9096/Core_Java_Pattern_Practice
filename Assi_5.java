package Pattern;

public class Assi_5 {
	
	public static void main(String[] args)
	{
		for (int i = 0; i <=5; i++)
		{
		for (int j = 0; j <=10; j++)
		{
			if(j+i>=0&&j-i>=8)
				System.out.print("*");
			else 
				System.out.print(" ");
		}
		System.out.println();
		}
	}
}
