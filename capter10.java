package project05;

public class capter10 {
	public static void main(String[] args) {
		System.out.println("����+���� =" + add(4,8));
		System.out.println("�Ǽ�+�Ǽ� =" + add(2.5,8.0));
		System.out.println("����+�Ǽ� =" + add(30,5.5));
		
	}
	public static int add(int a, int b ) {
		return a+b;
	
}
	public static double add(double a, double b ) {
		return a+b;
	}
	public static double add(int a, double b ) {
		return a+b;
	}
}
