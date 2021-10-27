package project05;

public class capter04 {
	public static void main(String[] args) {
		int [] values = {1,2,3};
		int sum=sum1(values); // 메서드에서 저장한 값을 끌어온다
		System.out.println("메인 합: " + sum);
	}
	public static int sum1(int[] values ) {
		int sum = 0; //메인 메서드가 끝났기 때문에 같은 이름의 변수를 사용 가능
		for(int i=0; i<values.length; i++) {
			sum += values[i]; //메서드에서 values의 변수 값들을 더해주고 저장한다
			
		}
		System.out.println("메서드 합: " +sum);
		return sum;
	}
	
}
