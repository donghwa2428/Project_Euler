
public class problem2 
{
	public static void main(String[] args) 
	{
    int a = 1;
    int b = 2;
    int c = 3;
    int sum = 2;
        
    	while (c < 4000000)
    	{
          if(c % 2 == 0) 
        	  sum = sum + c;
          a = b; b = c; c = a + b;
    	}  
    System.out.println("Sum: " + sum);
	}
}