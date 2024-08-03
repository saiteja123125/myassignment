import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Fitpeo {
public static void main (String[]args) throws InterruptedException {
    // Set up Edgedriver
System.setProperty("webdriver.edge.driver", "C:\\Users\\user\\git\\My-java-practice\\Intro\\target\\msedgedriver.exe");
WebDriver driver = new EdgeDriver();
driver.manage().window().maximize();

//Step1  Navigate to FitPeo Homepage
driver.get("https://www.fitpeo.com/");

//Step 2 Navigate to Revenue Calculator Page
driver.findElement(By.linkText("Revenue Calculator")).click();

//Step 3: Scroll Down to the Slider section
WebDriverWait wait = new WebDriverWait(driver, 5);
WebElement slider = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='MuiSlider-thumb MuiSlider-thumbSizeMedium MuiSlider-thumbColorPrimary MuiSlider-thumb MuiSlider-thumbSizeMedium MuiSlider-thumbColorPrimary css-sy3s50']")));

// Step 4: Adjust the Slider
Actions actions = new Actions(driver);
actions.dragAndDropBy(slider, 94, 0).release().perform();
WebElement sliderInput = driver.findElement(By.id(":r0:"));
for(int i=0; i<3; i++)
{
	sliderInput.sendKeys(Keys.ARROW_DOWN,Keys.RETURN);
}

// Step5: Update the Text Field
sliderInput.clear();
Thread.sleep(5000L);
sliderInput.clear();
sliderInput.sendKeys("560");

// Step6: Select CPT Codes
driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
Thread.sleep(5000L);
driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
Thread.sleep(5000L);
driver.findElement(By.xpath("(//input[@type='checkbox'])[3]")).click();
Thread.sleep(5000L);
driver.findElement(By.xpath("(//input[@type='checkbox'])[8]")).click();

//step7:Validate Total Recurring Reimbursement
WebElement totalRecurringReimbursement = driver.findElement(By.xpath("//p[@class='MuiTypography-root MuiTypography-body2 inter css-1xroguk'][contains(text(),'Total Recurring Reimbursement for all Patients Per')]"));
System.out.println( totalRecurringReimbursement.getText());
assert totalRecurringReimbursement.getText().equals("$110700");


// Step 8:Close the browser
driver.quit();
}
}

	





