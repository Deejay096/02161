package SoftwareProjekt;

public class calendar
{
	public static void cal()
	{
		int cols = 7;
		int offset = 0;  
		int start = 1 - offset;
		int end = 31;
		System.out.println("Su Mo Tu We Th Fr Sa");
		
		for (int j=start; j<=end; j++) 
		{
			if (j>0) 
			{
				if (j<10)
				{ 
					System.out.print(" "+j+" "); 
				} 
				else 
				{ 
					System.out.print(j+" "); 
				}
			}
			else
			{
				System.out.print("   "); 
			}
		 
			if (j>0 && j%cols==0)
			{
				System.out.println(); // ny række
			} 
		 
			start=j+1;
		 
		} 	
	}
	
	public static void main(String[] args)
	{
		cal();
		
	}
}
