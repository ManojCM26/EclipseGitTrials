package organization;

import org.testng.annotations.Test;

public class OrgTest {
	@Test
	public void orgTest() {
		
		String Browser = System.getProperty("browser");
		String Url = System.getProperty("url");
		String Username = System.getProperty("username");
		String Password = System.getProperty("password");
		
		System.out.println(Browser);
		System.out.println(Url);
		System.out.println(Username);
		System.out.println(Password);
		
		System.out.println("orgnization KLR created");
		System.out.println("KLR cricket academy");
		System.out.println("Trying Conflict in SOM ");
	}
}
