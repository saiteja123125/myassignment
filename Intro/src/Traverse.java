
import java.io.File;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
//import org.testng.Assert;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class Traverse {
	public static void main (String[]args) throws InterruptedException {
		// TODO Ato'generated method stub

System.setProperty("webdriver.edge.driver", "C:\\Users\\user\\eclipse-workspace\\Intro\\target\\test-classes\\msedgedriver.exe");
WebDriver driver = new EdgeDriver();

driver.manage().window().maximize();


driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
driver.get("https://www.amazon.com/");
System.out.println(driver.getCurrentUrl());

//System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());
//WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
//Select dropdown  = new Select(staticDropdown);
//dropdown.SelectBy("AED");
//System.out.println(dropdown.getFirstSelectedOption().getText());
//driver.findElement(By.xpath("//input[@name='q']")).sendKeys("mobiles",Keys.ENTER);
 Thread.sleep(2000L);
File src= ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//FileUtils.copyfile(src,new file("c'://screenshot.png"));
// System.out.println(driver.findElement(By.tagName("a")).size());
// Actions a= new Actions(driver);
// 
// 
// 
// 
// 
// a.moveToElement(driver.findElement(By.xpath("//*[@id='nav-link-accountList']"))).build().perform();
//	

 
// int i=1;
// while(i<5)
// {
// for(int i=1; i<4; i++)
// {
	 
	 
	 
//  
////	 i++;
////	}
// 
////driver.findElement(By.id("hrefIncAdt")).click();
//driver.findElement(By.id("hrefIncChd")).click();
// 
//driver.findElement(By.id("hrefIncInf")).click();
// }
////driver.findElement(By.id("driver.findElement(By.id")).click();
//// 
//// break;
//driver.findElement(By.id("ctl00_mainContent_SeniorCitizenDiv")).click();
//System.out.println(driver.findElement(By.id("ctl00_mainContent_SeniorCitizenDiv")).isSelected());
////driver.findElement(By.id("ctl00_mainContent_SeniorCitizenDiv")).isSelected();
//
////find all the check boxes present in itcode

//System.out.println(driver.findElement(By.cssSelector("input[type='checkbox']")).getSize());
 



driver.quit();
}}
