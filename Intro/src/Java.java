import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class Java {
	public static void main (String[]args) throws InterruptedException {
		// TODO Ato'generated method stub

System.setProperty("webdriver.edge.driver", "C:\\Users\\user\\eclipse-workspace\\Intro\\target\\test-classes\\msedgedriver.exe");
WebDriver driver = new EdgeDriver();

driver.manage().window().maximize();


driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get("https://rahulshettyacademy.com/locatorspractice/");
System.out.println(driver.getCurrentUrl());
//driver.findElement(By.className("theme-btn register-btn")).click();
//driver.close();
//driver.findElement(By.id("APjFqb")).sendKeys("flipkart.com",Keys.ENTER);
//System.out.println(driver.getCurrentUrl());
driver.findElement(By.id("inputUsername")).sendKeys("saiteja");
driver.findElement(By.name("inputPassword")).sendKeys("12345678");
driver.findElement(By.className("signInBtn")).click();
//driver.quit();
//	css seleected

System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
driver.findElement(By.linkText("Forgot your password?")).click();
driver.findElement(By.xpath("//input[@type='text']")).sendKeys("kaya");
//driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("kaya@gmai.com");
driver.findElement(By.cssSelector("input[placeholder='Phone Number']")).sendKeys("987433456666");
driver.findElement(By.xpath("//form/input[2]")).sendKeys("kaya@gmai.com");
driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
System.out.println(driver.findElement(By.cssSelector(".infoMsg")).getText());
driver.findElement(By.xpath("//button[text( )='Visit us']")).click();
//Thread.sleep(300);
//driver.findElement(By.xpath("//a[@class='btn btn-theme btn-sm btn-min-block']")).click();
//driver.findElement(By.id("login-with-google")).click();




driver.quit();
	}
}






