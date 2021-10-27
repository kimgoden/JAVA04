package project05;

public class capter14 {
	public static void main(String[] args) {
		int [] a= {78,54,89,57,84};
		int [] b= {95,74,91,84};
		int[] c= sum1(a,b);
        sum2(c);	
		
	}
	
	private static int sum1(int[] a, int[] b) {
		// TODO Auto-generated method stub
		int[] x=  null;
	
		if(a.length>b.length) {
		for(int a1=0; a1<a.length; a1++) {
			if(a1<b.length) {
				x[a1]=a[a1]+b[a1];
			}else {
				x[a1]=a[a1];
			
			}
			
		}
		}
		else {
			x = new int[b.length];
			for(int a1=0; a1<a.length;a1++) {
				if(a1<a.length) {
					x[a1]=a[a1]+b[a1];
				}else {
					x[a1]=b[a1];
				}
			}
		}
		return x;
	
}
				public static void sum2(int[] a) {
					for(int a1=0; a1<a.length;a1++) {
						System.out.println(a[a1]);
}
				}
			}
		
            		
            	
            
            
	
				
		
	
