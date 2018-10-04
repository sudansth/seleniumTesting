package mytestpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class mytestclass {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		//driver.get("http://only-testing-blog.blogspot.in");
		driver.get("http://channel40-web-dev.channel40.com.au:81/login");
		driver.manage().window().maximize();

		  String i = driver.getCurrentUrl();
		  System.out.println(i);
		 
		  WebDriverWait wait =  new WebDriverWait(driver, 10);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("form_user_name")));
		  
		  //Enter username and password
		  driver.findElement(By.id("form_user_name")).sendKeys("truckdriver12341test01");
		  driver.findElement(By.id("form_password")).sendKeys("password12341");
		  
		  //Click Login
		  driver.findElement(By.id("form_user_name")).submit();
		  //driver.findElement(By.id("")).submit();
		  
		  //wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/div/div[1]/div[2]/ul/li[6]/a")));
		  wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Settings")));
		  //Print URL
		  System.out.println(driver.getCurrentUrl());
		  
		  //Click Settings
		  driver.findElement(By.linkText("Settings")).click();
		  
		  //Wait until page is loaded
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Update password")));
		  //Print URL
		  System.out.println(driver.getCurrentUrl());
		  
		  //Click Update password
		  driver.findElement(By.linkText(("Update password"))).click();
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("update_password_current_password")));
		  //Print URL
		  System.out.println(driver.getCurrentUrl());
		  
		  //Enter username and password
		  driver.findElement(By.id("update_password_current_password")).sendKeys("password12341");
		  driver.findElement(By.id("update_password_new_password_first")).sendKeys("password12341");
		  driver.findElement(By.id("update_password_new_password_second")).sendKeys("password12341");
		  driver.findElement(By.id("update_password_new_password_second")).submit();
		  
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[2]/div/div[1]/div")));
		  wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[2]/div/div[1]/div")));
		  
		  
		  
		  //Logout
		  driver.findElement(By.className("icon-chevron-down")).click();
		  //wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("user-drop")));
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Logout")));
		  
		  driver.findElement(By.linkText("Logout")).click();
		  System.out.println(driver.getCurrentUrl());
		  
		  
		  
		  //driver.close();
		
	}
	
}
