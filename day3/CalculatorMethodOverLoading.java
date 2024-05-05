package week2.day3;

public class CalculatorMethodOverLoading {
	
	public void add(int a,int b) {
		System.out.println("Two input aurgs:" +(a+b));
	}

	public void add(int a,int b, int c)
	{
		System.out.println("Three input aurgs:"+(a+b+c));
	}
	
	
	public void multiple(double a, double b) {
		System.out.println("Multiplication with 2 input args:"+a*b);
	}
	
	public void multiple(float a , float b, float c) {
		System.out.println("Multiplication with 3 args :"+a*b*c);
	}
		public static void main(String[] args) {
			
			CalculatorMethodOverLoading calculate=new CalculatorMethodOverLoading();
			calculate.add(2,3);
			calculate.add(2, 3, 4);
			calculate.multiple(221,323);
			calculate.multiple(2.12f, 3.12f, 4.62f);
	}

}
