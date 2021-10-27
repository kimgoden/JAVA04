package project05;

import java.util.Scanner;

public class ex02 {
	public static void main(String[] args) {
		        int i=2;
		        int j=1;
		    
		        while (i<=9) {     
		     
		            while (j<=9) 
		            {
		       
		               System.out.println( i +" X "+ j +" = " + (i*j));
		               j++;
		                   
		             } 
		            j = 1; 
		            i++;
		            System.out.println("-------------");       
		    }
		        Scanner sc = new Scanner(System.in);
		        int dan;
		        System.out.println("출력하고자 하는 단을 입력하세요.");
		        dan= sc.nextInt();
		        int x= 1;
		        do { 
		        System.out.println(dan + "X" + x + "=" + (dan*x));
		        x++;
		        }while(x<=9);
		        System.out.println("-------------"); 
		    

	Scanner scan = new Scanner(System.in);
   int dan1;
   System.out.println("출력하고자 하는 단을 입력하세요.");
  dan1 = scan.nextInt();
  int dat;
  System.out.println("출력하고자 하는 데이터을 입력하세요.");
  dat = scan.nextInt();
  

  int sum2 =0;
  for(int z=dat; z<10; z++) {
	   if(z%dat==0) {
	  sum2 +=dat;
	   
	  
	  
  
  
System.out.println(dan1 + "X" + sum2 + "=" + (dan1*sum2));
  
	  
  
  }
	
}
	}
}
		
		
		