    package Slidone.Slidoneproject;
	import java.awt.Toolkit;
	import java.awt.datatransfer.DataFlavor;
	import java.awt.datatransfer.UnsupportedFlavorException;
	import java.io.IOException;
	import java.time.Duration;
	import java.util.ArrayList;
	import java.util.Set;

	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.Test;

	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.Select;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.Test;

	import com.google.common.io.Files;

	import java.awt.HeadlessException;
	import java.awt.Toolkit;
	import java.awt.datatransfer.DataFlavor;
	import java.awt.datatransfer.UnsupportedFlavorException;
	import java.io.File;
	import java.io.IOException;
	import java.time.Duration;
	import java.util.Set;
	import java.util.concurrent.TimeoutException;
	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.Test;

	import com.google.common.io.Files;

	import java.awt.HeadlessException;
	import java.awt.Toolkit;
	import java.awt.datatransfer.DataFlavor;
	import java.awt.datatransfer.UnsupportedFlavorException;
	import java.io.File;
	import java.io.IOException;
	import java.time.Duration;
	import java.util.Set;

	public class live_mergedcode {

	    private static final String WebElement = null;
		private WebDriver driver;
	    private WebDriverWait wait;
	    

	    @BeforeClass
	    public void setup() {
	        // Setup the ChromeDriver
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	    }

	    @Test(priority = 1)
	    public void testNavigateToChrome() throws InterruptedException {
	        // Navigate to the application
	        driver.get("https://app.slidone.com/auth/signin");
	        driver.findElement(By.xpath("//*[@id='emailInput']")).sendKeys("prabasivakumar11@gmail.com");
	        driver.findElement(By.xpath("//*[@id='passwordInput']")).sendKeys("praba@1107S");
	        Thread.sleep(1000);
	        driver.findElement(By.xpath("//button[@type='submit']")).click();
	        Thread.sleep(5000);
	    }

	    @Test(priority = 2)
	    public void testCreatePresentation() throws InterruptedException {
	    	Thread.sleep(8000);
	    	driver.findElement(By.xpath("//button[contains(@class,'btn btn-n')]")).click();
	    	Thread.sleep(4000);
	        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='slideName']"))).sendKeys("Testing");
	        Thread.sleep(1000);
	        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()=' Save']"))).click();
	        Thread.sleep(2000);
	          
	    }
	  //Multiple choice
	  	@Test(priority = 3)
	  	public void multiplechoiceTest() throws InterruptedException {
	  		Thread.sleep(5000);
	  		driver.findElement(By.xpath("(//a[@class='slide-list-hover'])[2]")).click();
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Multiple Choice']"))).sendKeys("What is the national animal");
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Add a longer description']"))).click(); 
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//textarea[@type='text']"))).sendKeys("Choose your choice from the below options");
			 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Option 1']"))).sendKeys("lion");
		     wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Option 2']"))).sendKeys("tiger");
		     wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Option 3']"))).sendKeys("cow");
		     wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Add Option ']"))).click();
			 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Add Option ']"))).click();
			 driver.navigate().refresh();
		     wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Option 4']"))).click();
		     wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Option 4']"))).sendKeys("donkey");
		     wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Option 5']"))).sendKeys("zebra");
		     wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-root/app-work-space/section/main/section/div/app-right-side-bar/div[1]/div[2]/div[2]/div[3]/div[2]/label/span"))).click();
		     wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@for='1']"))).click();

	        // Locate the image element inside the span
	        WebElement imageElement = driver.findElement(By.xpath("//img[@src='/assets/new-icons/question-circle.svg']"));
	        // Perform hover action using Actions class
	        Actions actions = new Actions(driver);
	        actions.moveToElement(imageElement).perform();

	        // Locate the parent <span> element that contains the tooltip
	        WebElement tooltipSpan = driver.findElement(By.xpath("//span[contains(@class,'ms-1 right-side-bar-settings-tooltip-top')]"));

	        // Retrieve the tooltip text from the 'data-tooltip' attribute
	        String actualTooltipText = tooltipSpan.getAttribute("data-tooltip");

	        // Define the expected tooltip text (update this based on your expectations)
	        String expectedTooltipText = "Select the right answer from the options above before starting your presentation.";

	        // Validate the tooltip text
	        if (actualTooltipText.equals(expectedTooltipText)) {
	            System.out.println("Tooltip validation passed: " + actualTooltipText);
	        } else {
	            System.out.println("Tooltip validation failed. Expected: " + expectedTooltipText + ", but found: " + actualTooltipText);
	        }
	        Thread.sleep(1000);
	  	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@for='1']"))).click();
	  	    driver.findElement(By.xpath("//div[@class='w-100 me-2']//select[1]")).click();
	        driver.findElement(By.xpath("//option[normalize-space(text())='Anton']")).click();
	        Thread.sleep(1000);
	        driver.findElement(By.xpath("//button[normalize-space(text())='+']")).click();
	        Thread.sleep(1000);
	        driver.findElement(By.xpath("//button[normalize-space(text())='+']")).click();
	        Thread.sleep(1000);
	        driver.findElement(By.xpath("//b[normalize-space(text())='/']")).click();
	        Thread.sleep(3000);	
	        driver.findElement(By.xpath("//input[@value='#82B4FE']")).click();
	        Thread.sleep(3000);	
	     // Reset to theme defaults
		    // driver.findElement(By.linkText("Reset to theme defaults")).click();
		 // Click on design
		     Thread.sleep(7000);
		     driver.findElement(By.xpath("//p[text()='Design']")).click();
	    // Visualization type for multiple choice
		     wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[text()='Donut']"))).click();
		     Thread.sleep(5000);
		     wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[text()='Pie']"))).click();
		     Thread.sleep(5000);
		     wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[text()='Bar']"))).click();
		// Show percentage for multiple choice
		     Thread.sleep(5000);
		     wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@class='slider round'])[2]"))).click();
	   //  Upload image and layout
		     driver.findElement(By.linkText("Click here")).click();
	         WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	         WebElement fileInput = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//input[@type='file'])[2]")));
	         String filePath = "C:\\Users\\Prabha\\Desktop\\Butterfly.jpeg";
	         fileInput.sendKeys(filePath);    
	         driver.findElement(By.xpath("(//button[text()='Save'])[2]")).click();
	         Thread.sleep(9000);
		     wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='layout-type-card text-center'])[5]"))).click();  //Side by side left
	  // settings for select multiple submission
		     Thread.sleep(3000);
		     driver.findElement(By.xpath("//p[text()='Settings']")).click();
		     wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@class='slider round hover-border'])[2]"))).click(); // Select multiple options
		     WebElement Selection_per_par = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='number']")));  // Selections per participants
		     Selection_per_par.clear();
		     Selection_per_par.sendKeys("2");
     // Click back to content
		     Thread.sleep(3000);
		     driver.findElement(By.xpath("//p[text()='Content']")).click();
	  	}
	    //word cloud
  		@Test(priority = 4)
  		public void wordcloudTest() throws InterruptedException {
  			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='New Slide']"))).click();
  			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@class='slide-list-hover'])[3]"))).click();
  			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder=\"Word Cloud\"]"))).sendKeys("Where are you from?");
  			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Add a longer description']"))).click(); 
  			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//textarea[@type='text']"))).sendKeys("Briefly tell about your place");
  		// Locate the image element inside the span
  	        WebElement imageElement = driver.findElement(By.xpath("//img[@src='/assets/new-icons/question-circle.svg']"));

  	        // Perform hover action using Actions class
  	        Actions actions = new Actions(driver);
  	        actions.moveToElement(imageElement).perform();

  	        // Locate the parent <span> element that contains the tooltip
  	        WebElement tooltipSpan = driver.findElement(By.xpath("//span[contains(@class,'ms-1 right-side-bar-settings-tooltip-top')]"));

  	        // Retrieve the tooltip text from the 'data-tooltip' attribute
  	        String actualTooltipText = tooltipSpan.getAttribute("data-tooltip");

  	        // Define the expected tooltip text (update this based on your expectations)
  	        String expectedTooltipText = "One entry can consist of several words";

  	        // Validate the tooltip text
  	        if (actualTooltipText.equals(expectedTooltipText)) {
  	            System.out.println("Tooltip validation passed: " + actualTooltipText);
  	        } else {
  	            System.out.println("Tooltip validation failed. Expected: " + expectedTooltipText + ", but found: " + actualTooltipText);
  	        }
  	        Thread.sleep(1000);
  			
  			//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

  	    	WebElement entries = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='number']")));
  	    	
  	    	// Use Actions to clear and input the text
  	    	
  	    	// Click to focus on the input element, send BACK_SPACE keys to clear, and then input text
  	    	actions.click(entries)
  	    	       .keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL)  // Select all text (Ctrl + A)
  	    	       .sendKeys(Keys.BACK_SPACE)  // Delete the selected text
  	    	       .sendKeys("5")  // Input the new data
  	    	       .perform();
  			
  		// Wait and click the first dropdown select element
  		    WebElement selectElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='w-100 me-2']//select[1]")));
  		    selectElement.click();

  		    // Wait and click the option "Anton"
  		    WebElement antonOption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//option[normalize-space(text())='Anton']")));
  		    antonOption.click();

  		    // Wait and click the first '+' button
  		    WebElement firstPlusButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space(text())='+']")));
  		    firstPlusButton.click();

  		    // Wait and click the second '+' button
  		    WebElement secondPlusButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space(text())='+']")));
  		    secondPlusButton.click();

  		    // Wait and click the '/' button
  		    WebElement divideButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//b[normalize-space(text())='/']")));
  		    divideButton.click();

  		    // Wait until the hidden input element becomes available and click it
  		    WebElement colorInput = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@value='#FFD584']")));
  		    colorInput.click();

  		    // Wait and click the link with class 'fs-14'(reset the  default themes)
  		    //WebElement linkElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='fs-14']")));
  		   // linkElement.click();
  		// Click on design
		     Thread.sleep(7000);
		     driver.findElement(By.xpath("//p[text()='Design']")).click();
  		   //  Upload image and layout
		     driver.findElement(By.linkText("Click here")).click();
	         WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	         WebElement fileInput = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//input[@type='file'])[2]")));
	         String filePath = "C:\\Users\\Prabha\\Desktop\\doll gif.gif";
	         fileInput.sendKeys(filePath);    
	         driver.findElement(By.xpath("(//button[text()='Save'])[2]")).click();
	         Thread.sleep(9000);
		     wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='layout-type-card text-center'])[3]"))).click();  //Image left
		  // Click back to content
		     Thread.sleep(3000);
		     driver.findElement(By.xpath("//p[text()='Content']")).click();
  			
  		}

}
