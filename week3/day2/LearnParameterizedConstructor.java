package week3.day2;

public class LearnParameterizedConstructor {

	int idNo;
	String companyName;
	
	public LearnParameterizedConstructor(int id,String company) {
		idNo=id;
		companyName=company;
		
			}
	
	public LearnParameterizedConstructor(int a) {
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		LearnParameterizedConstructor lpc=new LearnParameterizedConstructor(25,"TestLeaf");
		System.out.println("Parameterized value for int : "+lpc.idNo);
		System.out.println("Parameterized value for String : "+lpc.companyName);
		
		LearnParameterizedConstructor lpc2=new LearnParameterizedConstructor(25);
		
	}
}
