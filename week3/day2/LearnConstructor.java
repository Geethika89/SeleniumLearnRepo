package week3.day2;

public class LearnConstructor {
	int num;
	public LearnConstructor() {
		System.out.println("DefaultConstructor");
	}
	
	public LearnConstructor(int num) {
		this();
		//this.num=num;
		System.out.println("Single parameter: "+num);
	}
	
	public LearnConstructor(int num,int num2,String name) {
		this(2);
		System.out.println("two Parameter : "+(num+num2)+name);
	}
	
public static void main(String[] args) {
	LearnConstructor lc=new LearnConstructor(2,4,"Gee");
	
}
}
