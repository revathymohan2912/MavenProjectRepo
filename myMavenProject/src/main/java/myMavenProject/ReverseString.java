package myMavenProject;

public class ReverseString {

	public static void main(String[] args) 
	{  
		String a = "Hello World";  
		String rev = "";  

		for (int i = a.length()-1; i >= 0; i--)
		{  
		rev += a.charAt(i);  // Concatenate each character to the reversed string  
		}   
		 
		System.out.println("Original String: " + a);  
		System.out.println("Reversed String: " + rev);  
		}  
		
}
