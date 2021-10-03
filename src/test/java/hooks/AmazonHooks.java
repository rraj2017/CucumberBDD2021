package hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

public class AmazonHooks {
	@Before("@Smoke")
	public void setup_browser(Scenario sc) {
		System.out.println("Launch chrome browser");
		System.out.println(sc.getName());
	}
//	@Before(order = 2)
//	public void setup_url() {
//		System.out.println("Launch url");
//	}
//	@After(order = 2)
//	public void tearDown_logout()
//	{
//		System.out.println("logout from application");
//	}
	@After("@Smoke")
	public void tearDown_close(Scenario sc)
	{
		System.out.println("close the browser");
		System.out.println(sc.getName());
	}
//	@BeforeStep
//	public void takeScreenshot() {
//		System.out.println("take the screenshot");
//	}
//	@AfterStep
//	public void refreshPage() {
//		System.out.println("refresh the page");
//	}

}
