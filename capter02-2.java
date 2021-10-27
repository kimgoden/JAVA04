package project05;

public class capter021 {
	public static void main(String[] args) {
		//capter02 호출
		capter02 a= new capter02();
		a.poweron();
		
		int result1 = a.plus(5, 6); //매게변수
			System.out.println("result1: " + result1);
			
			byte x =10;
			byte y =4;
			double result2 = a.divide(x, y);//매게변수
			System.out.println("result2: " + result2);
			
			a.powerOff();
			

	}
}
