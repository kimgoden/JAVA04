package project05;

public class capter07 {

	 int gas;
	 
	 void setgas(int gas) {
		 this.gas = gas;
 }
	 boolean isleftgas() {
		 if(gas==0) {
			 System.out.println("가스가 없습니다.");
			 return false;
		 }
		 else {System.out.println("가스가 있습니다.");
		 return true;
		 }
	 }
	 void run() {
		 while(true) {
			 if(gas>0) { //gas가 0보다 크다면 가스-1을 한다
				 System.out.println("남은 가스: "+ gas);
				 gas-=1;
			 }else { System.out.println("멈춥니다. 남은 가스: " +gas);
				 return;//gas가 0보다 작다면 멈춥니다를 출력하고 남은가스를 보여준다.
			 }
		 }
	 }
}
