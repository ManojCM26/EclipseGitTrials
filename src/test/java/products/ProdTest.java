package products;

import org.testng.annotations.Test;

public class ProdTest {

	@Test
	public void prodTest() {
		System.out.println("I do know");
		System.out.println("But Trying to knowww conflicts");
		
		String Browser = System.getProperty("browser");
		String Url = System.getProperty("url");
		String Username = System.getProperty("username");
		String Password = System.getProperty("password");
		
		System.out.println(Browser);
		System.out.println(Url);
		System.out.println(Username);
		System.out.println(Password);
	}

}
