package week2.day3.homeassignment.poly;

public class MainApI {

	public static void main(String[] args) {
		APIClient api=new APIClient();
		System.out.println(api.sendRequest("first end point"));
		api.sendRequest("second end request", "requestbody", false);
		
	}

}
