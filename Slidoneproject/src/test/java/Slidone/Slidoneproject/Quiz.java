
package Slidone.Slidoneproject;

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

public class Quiz {

    private WebDriver driver;
    private WebDriverWait wait;

    @BeforeClass
    public void setup() {
        // Setup the ChromeDriver
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    @Test(priority = 1)
    public void testNavigateToChrome() throws InterruptedException {
        // Navigate to the application
        driver.get("https://app.slidone.com/auth/signin");
        driver.findElement(By.xpath("//*[@id='emailInput']")).sendKeys("rathi@digitalhoop.io");
        driver.findElement(By.xpath("//*[@id='passwordInput']")).sendKeys("Rathi@2024");
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
    @Test(priority = 6)
    public void testSelectanswer() throws InterruptedException {
           
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@class='slide-list-hover'])[12]"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Select Answer']"))).sendKeys("what is the expansion of www?");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".text-primary.fs-12"))).click();
        
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("textarea"))).sendKeys("WWW is a system of interlinked hypertext documents accessible via the internet, enabling users to navigate, share, and access a vast array of content.");
     
     // Locate the element you want to click
    	WebElement addop = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(.,'Add Option')]")));

    	// Scroll the element into view
    	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", addop);
    	Thread.sleep(2000);
    	// Now wait until the element is clickable and click it
    	wait.until(ExpectedConditions.elementToBeClickable(addop)).click();
    	Thread.sleep(2000);
    	wait.until(ExpectedConditions.elementToBeClickable(addop)).click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//input[@placeholder='Option 1']")).sendKeys("rathi");
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//input[@placeholder='Option 2']")).sendKeys("ravi");
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//input[@placeholder='Option 3']")).sendKeys("balu");
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//input[@placeholder='Option 4']")).sendKeys("ramesh");
    	Thread.sleep(1000);
    	driver.findElement(By.xpath("//input[@placeholder='Option 5']")).sendKeys("muruga");
    	Thread.sleep(1000);
    	
       
        
        driver.findElement(By.xpath("//label[@for='2']")).click();
        Thread.sleep(3000);
        WebElement second = driver.findElement(By.xpath("(//div[contains(@class,'col-4 px-0')]//input)[1]"));
        Actions actions = new Actions(driver);
        actions.click(second)
	       .keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL)  // Select all text (Ctrl + A)
	       .sendKeys(Keys.BACK_SPACE)  // Delete the selected text
	       .sendKeys("100")  // Input the new data
	       .perform();
        Thread.sleep(3000);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Music']"))).click();
        Thread.sleep(1000);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@id='flexCheckDefault5'])[4]"))).click();
        Thread.sleep(1000);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='collopse-border d-flex align-item-center mb-2 active-music'])[1]"))).click();
        Thread.sleep(1000);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='collopse-border d-flex align-item-center mb-2 active-music'])[1]"))).click();
        Thread.sleep(1000);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[name()='polygon'])[2]"))).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//p[@class='mb-0'])[3]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@class='text-primary']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//input[@type='file'])[2]")).sendKeys("C:\\Users\\Admin\\Downloads\\flower.png");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[contains(@class,'btn btn-save')]")).click();
        Thread.sleep(1000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@src='assets/images/Trashcan.png']"))).click();
        Thread.sleep(1000);
       // driver.findElement(By.xpath("//img[@src='assets/images/Trashcan.png']")).click();
        // Locate the element using XPath (adjust XPath as needed)
        WebElement element = driver.findElement(By.xpath("(//h5[@class='modal-title mb-0'])[3]"));

        // Retrieve the value of the "cursor" CSS property
        String cursorValue = element.getCssValue("cursor");

        // Output the cursor property value
        System.out.println("Cursor value for the element: " + cursorValue);

        // Check if the cursor indicates a disabled element
        if ("not-allowed".equals(cursorValue)) {
            System.out.println("Themes is disabled (cursor: not-allowed).");
        } else {
            System.out.println("Themes is enabled (cursor: " + cursorValue + ").");
        }
    }
  

 

    @Test(priority = 8)
    public void testtypeanswer() throws InterruptedException {
       
    	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='New Slide']"))).click();
    	Thread.sleep(1000);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//body[1]/app-root[1]/app-work-space[1]/section[1]/main[1]/app-left-side-bar[1]/section[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/div[6]/div[2]/a[1]"))).click();
        Thread.sleep(1000);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(" //input[@placeholder='Type Answer']"))).click();
        Thread.sleep(1000);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(" //input[@placeholder='Type Answer']"))).sendKeys("who is the father of our nation?");
        Thread.sleep(1000);
       
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Add a longer description']"))).click();
        Thread.sleep(1000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("textarea"))).sendKeys("He was a national leader and social reformist who is known as the Father of Our Nation in India."); 
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//div[contains(@class,'col-9 px-0')]//input)[1]")).sendKeys("tiger");
        Thread.sleep(1000);
        WebElement element2 = driver.findElement(By.xpath("//button[contains(.,'Add correct answer')]"));
        Thread.sleep(1000);

        // Use JavaScript to scroll the element into view
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element2);
        element2.click();
        Thread.sleep(1000);
       
        element2.click();
        Thread.sleep(1000);
       
        element2.click();
        Thread.sleep(1000);
        
        element2.click();
        Thread.sleep(1000);
     
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//div[contains(@class,'col-9 px-0')]//input)[2]")).sendKeys("lion");
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//div[contains(@class,'col-9 px-0')]//input)[3]")).sendKeys("monkey");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@placeholder='Item 4']")).sendKeys("horse");
        
        driver.findElement(By.xpath("//input[@placeholder='Item 5']")).sendKeys("deer");
        Thread.sleep(1000);
        
        WebElement element3 = driver.findElement(By.xpath("//div[@class='option-limit-alert ng-star-inserted']"));

        // Use JavaScript to scroll the element into view
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element3);
        //element3.click();
        Thread.sleep(1000);
        boolean isValid = driver.findElement(By.xpath("//div[@class='option-limit-alert ng-star-inserted']")).getText().equals("Max reached! You can only add up to 5 options.");
        Thread.sleep(1000);
     // Validate the alert message content
        String alertText = element3.getText();
        if (alertText.equals("Max reached! You can only add up to 5 options.")) {
            System.out.println("Alert is shown and the message is correct: " + alertText);
        } else {
            System.out.println("Alert message is incorrect or not as expected. Found: " + alertText);
        }
        
        Thread.sleep(1000);
        WebElement second = driver.findElement(By.xpath("(//div[contains(@class,'col-4 px-0')]//input)[1]"));
        Actions actions = new Actions(driver);
        actions.click(second)
	       .keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL)  // Select all text (Ctrl + A)
	       .sendKeys(Keys.BACK_SPACE)  // Delete the selected text
	       .sendKeys("100")  // Input the new data
	       .perform();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Music']"))).click();
        Thread.sleep(1000);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@id='flexCheckDefault5'])[4]"))).click();
        Thread.sleep(1000);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='collopse-border d-flex align-item-center mb-2 active-music'])[1]"))).click();
        Thread.sleep(1000);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='collopse-border d-flex align-item-center mb-2 active-music'])[1]"))).click();
        Thread.sleep(1000);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[name()='polygon'])[2]"))).click();
        
        driver.findElement(By.xpath("(//p[@class='mb-0'])[3]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@class='text-primary']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//input[@type='file'])[2]")).sendKeys("C:\\Users\\Admin\\Downloads\\flower.png");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[contains(@class,'btn btn-save')]")).click();
        Thread.sleep(1000);
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@src='assets/images/Trashcan.png']"))).click();
        //Thread.sleep(1000);
       // driver.findElement(By.xpath("//img[@src='assets/images/Trashcan.png']")).click();
        // Locate the element using XPath (adjust XPath as needed)
        WebElement element = driver.findElement(By.xpath("(//h5[@class='modal-title mb-0'])[3]"));

        // Retrieve the value of the "cursor" CSS property
        String cursorValue = element.getCssValue("cursor");

        // Output the cursor property value
        System.out.println("Cursor value for the element: " + cursorValue);

        // Check if the cursor indicates a disabled element
        if ("not-allowed".equals(cursorValue)) {
            System.out.println("Themes is disabled (cursor: not-allowed).");
        } else {
            System.out.println("Themes is enabled (cursor: " + cursorValue + ").");
        }
         
       
    }

    @Test(priority = 9)
    public void present() throws HeadlessException, UnsupportedFlavorException, IOException, InterruptedException {
        
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[normalize-space()='1']"))).click();
        Thread.sleep(1000);
        // Wait for the copy button to be clickable and click it
        WebElement copyButton = wait.until(ExpectedConditions.elementToBeClickable(By.className("icon-svg")));
        copyButton.click();
        Thread.sleep(1000);
        // Wait for the presentation button to be clickable and click it
        WebElement presentButton = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//button[./img[contains(@src, 'play_arrow.svg')]]")));
        presentButton.click();
        Thread.sleep(1000);
        // Get the copied link from the clipboard
        String presentationLink = (String) Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor);

        String currentWindowHandle = driver.getWindowHandle();
        Thread.sleep(1000);
        
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.open();");

        Set<String> windowHandles = driver.getWindowHandles();
        String[] handles = windowHandles.toArray(new String[0]);
        driver.switchTo().window(handles[handles.length - 1]); 
        driver.get(presentationLink);
        Thread.sleep(3000);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("input"))).click();
        Thread.sleep(1000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("input"))).sendKeys("bean");
        Thread.sleep(3000);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@class='btn btn-primary btn-align w-100 ng-tns-c41-0'])[1]"))).click();
        driver.switchTo().window(currentWindowHandle);
        Thread.sleep(3000);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[normalize-space()=\"Let's go\"])[1]"))).click();
        windowHandles = driver.getWindowHandles();
        handles = windowHandles.toArray(new String[0]);

   
        driver.switchTo().window(handles[handles.length - 1]);
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        Thread.sleep(5000);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20)); // Set an explicit wait for 20 seconds
        WebElement element2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='options ng-tns-c41-0']//div)[2]")));
        element2.click();
        Thread.sleep(3000);

        WebElement element = driver.findElement(By.xpath("//button[@type='submit' and contains(@class, 'btn-primary')]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
       
        Thread.sleep(8000);
       
        driver.switchTo().window(currentWindowHandle);
        Thread.sleep(3000);
        
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@data-tooltip='Next Slide']"))).click();
        Thread.sleep(5000);
        
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[normalize-space()='Leading Board']"))).click();
        Thread.sleep(3000);
        
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@data-tooltip='Next Slide']"))).click();
        Thread.sleep(3000);
        
           wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/app-root[1]/app-presentation[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/app-dynamic-chart[1]/app-type-answers[1]/div[1]/div[1]/div[4]/div[1]/span[1]"))).click();
           windowHandles = driver.getWindowHandles();
           handles = windowHandles.toArray(new String[0]);

        
           driver.switchTo().window(handles[handles.length - 1]);
           Thread.sleep(8000);
           wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Enter a word']"))).sendKeys("lion");
           Thread.sleep(2000);
           
           wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Submit')]"))).click();
           Thread.sleep(10000);
           
           driver.switchTo().window(currentWindowHandle);
          
           wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@data-tooltip='Next Slide']"))).click();
          
           
           
           
           wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[normalize-space()='Champion Board']"))).click();
           
           windowHandles = driver.getWindowHandles();
           handles = windowHandles.toArray(new String[0]);

          
           driver.switchTo().window(handles[handles.length - 1]);
           Thread.sleep(3000);
          



/*
    @AfterClass
    public void tearDown() {
        // Close the browser
        driver.quit();
    }*/
}
}


