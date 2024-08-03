
//Import necessary libraries
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class AssignmentFitpeo {
 WebDriver driver;

 @Test
 public void navigateToRevenueCalculatorPage() throws InterruptedException {
     // Set up ChromeDriver
	 System.setProperty("webdriver.edge.driver", "C:\\Users\\user\\eclipse-workspace\\Intro\\target\\test-classes\\msedgedriver.exe");
//     driver = new ChromeDriver();
	 WebDriver driver = new EdgeDriver();
	 driver.manage().window().maximize();

     // Navigate to FitPeo Homepage
     driver.get("https://www.fitpeo.com/");

     // Navigate to Revenue Calculator Page
     driver.findElement(By.linkText("Revenue Calculator")).click();

     // Scroll down to the Slider section
     WebDriverWait wait = new WebDriverWait(driver, 10);
     wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".MuiSlider-thumb MuiSlider")));

     // Adjust the Slider
     WebElement slider = driver.findElement(By.cssSelector(".MuiSlider-thumb MuiSlider"));
     Actions actions = new Actions(driver);
     actions.dragAndDropBy(slider, 820, 0).perform();

     // Update the Text Field
     driver.findElement(By.cssSelector(".MuiInputBase-colorPrimary MuiInputBase")).click();
     driver.findElement(By.cssSelector(".MuiInputBase-colorPrimary MuiInputBase")).sendKeys("560");

     // Validate Slider Value
     WebElement sliderValue = driver.findElement(By.cssSelector(".MuiSlider-thumb MuiSlider"));
     assert sliderValue.getText().equals("560");

     // Select CPT Codes
     driver.findElement(By.cssSelector(".cpt-99091")).click();
     driver.findElement(By.cssSelector(".cpt-99453")).click();
     driver.findElement(By.cssSelector(".cpt-99454")).click();
     driver.findElement(By.cssSelector(".cpt-99474")).click();

     // Validate Total Recurring Reimbursement
     WebElement totalRecurringReimbursement = driver.findElement(By.cssSelector(".total-recurring-reimbursement"));
     assert totalRecurringReimbursement.getText().equals("$110700");

     // Close the browser
     driver.quit();
 }
}
