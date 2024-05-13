package week3.day2;

public class LearnDefaultConstructor {
//constructor should be inside class not main method
	//acccessmodifier className(){}
	int idNo;
	String companyName;
	public LearnDefaultConstructor() {
		System.out.println("Default COnstructor");
	}
	
	public static void main(String[] args) {
		LearnDefaultConstructor lc=new LearnDefaultConstructor();
		System.out.println("Default value for int"+lc.idNo);
		System.out.println("Default value for String"+lc.companyName);
	}
}
