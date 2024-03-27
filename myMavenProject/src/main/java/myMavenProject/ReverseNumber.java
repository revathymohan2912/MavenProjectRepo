package myMavenProject;

public class ReverseNumber {
	public static void main(String[] args)
	{

	int num = 12345;
	int rev = 0;

	System.out.println("Given number is: " + num);
	 
	while(num != 0)
	{

	int rem = num % 10;
	rev = rev * 10 + rem;  
	num = num/10;  
	}

	System.out.println("Reversed number is: " + rev);  
	}  
}