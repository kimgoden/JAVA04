package project05;

public class capter05 {
	public static void main(String[] args) {
		capter051 com= new capter051();
		int[] values = {1,2,3};
		int result = com.sum1(values);
		System.out.println("result: " + result);
		
		int result2 = com.sum1(new  int[] {1,2,3,4,5});
		System.out.println("result: " + result2);
		
		int result3 = com.sum2(values);
		System.out.println("result: " + result3);
		
		int result4 = com.sum2(1,2,3,4,5);
		System.out.println("result: " + result4);
	}
}
