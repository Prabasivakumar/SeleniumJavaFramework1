package Slidone.Slidoneproject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class loginpage {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://sitpres.slidone.com/auth/signin");
		driver.manage().window().maximize();
        
		WebElement email = driver.findElement(By.id("emailInput"));
		email.sendKeys("prabasivakumar11@gmail.com");
		WebElement password = driver.findElement(By.id("passwordInput"));
		password.sendKeys("praba@1107S");
		WebElement signin = driver.findElement(By.cssSelector("button[type='submit']"));
		signin.click();
		Thread.sleep(3000);
		WebElement newpres = driver.findElement(By.xpath("//span[contains(text(),'New Presentation')]"));
		newpres.click();
		WebElement presname1= driver.findElement(By.xpath("(//input[@id='slideName'])[1]"));
		presname1.sendKeys("Testing");
		WebElement save = driver.findElement(By.xpath("//button[text()=' Save']"));
		save.click();

		
	}

}
