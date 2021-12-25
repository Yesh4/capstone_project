//package stepDef;

//public class loginClass {

//}

package stepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginClass {
	WebDriver driver;

	public loginClass(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	public void Login() {
		driver.findElement(By.name("email_id")).sendKeys("user1@user.com");
		driver.findElement(By.name("pwd")).sendKeys("user");
	    System.out.println("user opened login page and enter details");
	    driver.findElement(By.xpath("//button[text()='Login']")).click();
	    System.out.println("user clicks on login button");
	    System.out.println("user is on login page");
	}
}
