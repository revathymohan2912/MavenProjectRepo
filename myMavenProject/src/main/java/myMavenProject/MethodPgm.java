package myMavenProject;

public class MethodPgm {
	public void add(int a, int b) {
		int c = a + b;
		System.out.println("SUM = "+c);
	}
	
	public void sub(int x, int y) {
		int z = x- y;
		System.out.println("DIFFERENCE = "+z);
	}

	public static void main(String[] args) {
		MethodPgm obj = new MethodPgm();
		obj.add(3, 2);
		obj.sub(3, 2);

	}

}
