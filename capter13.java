package project05;

public class capter13 {
	//6�� 7�� ����
	public static void main(String[] args) {
		int[] values = {50,89,77,50,90};
		int sum = sum1(values);
		int avg = sum2(values);
		System.out.println("�迭�� ����: " + sum);
		System.out.println("�迭�� ���: " + avg);
	}
		
		
		public static int sum1(int ...values) {
			int y=0;
			
			for(int z=0; z<values.length; z++) {
				 {
					y += values[z];
			}
	}
			return y;
		}
			public static int sum2(int ...values) {
				int y=0;
				
				for(int z=0; z<values.length; z++) {
					 {
						y += values[z]/values.length;
	}
					 
				}
				return y;	
}
}