package test;

public class training {
	
	public training() {
		int a=2;
		int b=7;
		int c= a+b;
		System.out.println("c = "+c);
		
	}	
	public training(int a , int b) {
		int c= a+b;
		System.out.println("c = "+c);
	}
	
	public void manualtest() {
		System.out.println("manual");
	}

	public void automationtest() {
		System.out.println("automation");
	}
	
	
	public static void main(String[] args) {
		 training t = new training();
		 t.manualtest();
		 t.automationtest();

	}

}