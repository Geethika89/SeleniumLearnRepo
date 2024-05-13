package week3.day1.homeassignment;

public class JavaConnection implements DatabseConnection{
	
	public void connect() {
		System.out.println("To print connect");
		
	}

	public void disconnect() {
		System.out.println("To print disconnect");
		
	}

	public void excecuteUpdate() {
		System.out.println("To print executeUpdate");
		
	}

	public static void main(String[] args) {
		JavaConnection jc=new JavaConnection();
		jc.connect();
		jc.disconnect();
		jc.excecuteUpdate();

	}

	
}
