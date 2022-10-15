package Pattern;

public class q_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i <=8; i++)
		{
		for (int j = 0; j <=4; j++) 
		{
			if(j+i<=4||j-i<-3)
				System.out.print("*");
		}	
		System.out.println();
		}


	}

}
