package week3.day1.abstraction;

public class Amazon extends CanaraBank {

	public void upiPayments() {
		System.out.println("upi payments available");
		
	}

	public void cardPayments() {
		System.out.println("card payments can be done");
		
	}

	@Override
	public void recordPaymentDetails() {
		System.out.println("record paymenyt details");
		
	}
	
	
	public void cashOnDelivery() {
		System.out.println("cash on delivery available");
		
	}

	public void internetBanking() {
		System.out.println("Internet banking available");
		
	}
	
	public static void main(String[] args) {
		Amazon a = new Amazon();
		a.cardPayments();
		a.cashOnDelivery();
		a.recordPaymentDetails();
		a.upiPayments();
		a.internetBanking();
	}
}
