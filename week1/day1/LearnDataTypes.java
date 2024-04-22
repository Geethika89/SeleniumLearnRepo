package week1.day1;

public class LearnDataTypes {

	public static void main(String[] args) {
		// dataType variableName=value;
		//brown colour indicates local variable
		//int releaseYear=3;
		int releaseYear=1998;
		float browserVerion=100.2f;//add small f to the end
		char browserLogo='f'; //only single character can be stored in char
		double value=89.09;
		boolean isVisible =true;
		// for getting true or false answers
				//default value for boolean is false
		String browserName="firefox";
		
		//System.out.println(releaseYear);
		System.out.println("releaseYear:"+releaseYear);
		System.out.println("Browser Version :"+browserVerion+"\n"+"First Letter of my browser:"+browserLogo+"\n"
				+"value :"+value+"\n"+"Is visible or not:"+isVisible+"\n"
				+"Browser Name :"+browserName);
		

	}

}
