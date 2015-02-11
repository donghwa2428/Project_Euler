
public class problem5 
{
	public static void main(String[] args)
	{
		for(long i = 1; i >= 1; i++)
		{
			if (i % 11 == 0 && i % 12 == 0 && i % 13 == 0 && i % 14 == 0 && i % 15 == 0 &&
					i % 16 == 0 && i % 17 == 0 && i % 18 == 0 && i % 19 == 0 && i % 20 == 0)
			{
				System.out.print(i + "\n"); //not only shows the smallest one but shows the maximum that the memory can hold.
			}
		}
	}
}
