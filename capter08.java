package project05;

public class capter08 {
	public static void main(String[] args) {
//오버로딩
	System.out.println("int 형 add :" + add(3,5));
	System.out.println("double형 add :" + add(3.14,5.78));
	}
	//int형 add
	public static int add(int a, int b ) {
		return a+b;
	}
	//double형 add
	public static double add(double a, double b) {
		return a+b;
		

	}
}
