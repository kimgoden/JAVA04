package project05;

public class capter10 {
	public static void main(String[] args) {
		System.out.println("정수+정수 =" + add(4,8));
		System.out.println("실수+실수 =" + add(2.5,8.0));
		System.out.println("정수+실수 =" + add(30,5.5));
		
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
