package myMavenProject;

public class MethodProgram {
	public void add(int a, int b) {
		int c = a+b;
		System.out.println("Sum = "+c);
	}
	
	public int mul(int x, int y, int z) {
		int m = x*y*z;
		return m;
	}

	public static void main(String[] args) {
		MethodProgram obj = new MethodProgram();
		obj.add(4, 5);
		System.out.println("Product = "+obj.mul(4,5,6));

	}

}
