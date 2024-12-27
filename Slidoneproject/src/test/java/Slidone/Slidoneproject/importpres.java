package Slidone.Slidoneproject;

import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
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

public class importpres {
	WebDriver driver;
	private WebDriverWait wait;
	@BeforeClass
    public void setup() {
       
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));

    }
	@Test(priority = 1)
    public void loginTest() throws InterruptedException {
       
        driver.get("https://app.slidone.com/auth/signin");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("emailInput"))).sendKeys("prabashalini75@gmail.com");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("passwordInput"))).sendKeys("praba@1107S");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[type='submit']"))).click();
    }
	@Test(priority = 2)
	public void createPresentationTest() throws InterruptedException {
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='New Presentation']"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='slideName']"))).sendKeys("Testing");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()=' Save']"))).click();
	}
	@Test(priority = 3)
	public void PowerPointTest() throws InterruptedException{
	// Insert New Import PowerPoint
   	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@class='slide-list-hover'])[16]"))).click();
   	    WebElement embed_code = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Add embed code here']")));
        embed_code.click(); 
        String iframecode = "<iframe src=\"https://1drv.ms/p/c/a0f54d86a5c7990c/UQMMmcelhk31IICggAAAAAAAANUeZd5mF6GMtmI?em=2&amp;wdAr=1.7777777777777777\" width=\"476px\" height=\"288px\" frameborder=\"0\">This is an embedded <a target=\"_blank\" href=\"https://office.com\">Microsoft Office</a> presentation, powered by <a target=\"_blank\" href=\"https://office.com/webapps\">Office</a>.</iframe>";

     // Copy the iframe code to the clipboard
        StringSelection stringSelection = new StringSelection(iframecode);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);

     // Focus on the input element and paste the iframe code using sendKeys()
        embed_code.click();  
         embed_code.sendKeys(Keys.CONTROL, "v");
	     driver.findElement(By.xpath("//input[@value='#FFD584']")).click();
	     
	 // Reset to theme defaults
//	     driver.findElement(By.linkText("Reset to theme defaults")).click();
	     
/*	 // Click design and upload image
	     driver.findElement(By.xpath("//p[text()='Design']")).click();
	     driver.findElement(By.linkText("Click here")).click();
	    // wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='upload-zindex-click']"))).sendKeys("‪C:\\Users\\Prabha\\Desktop\\doll gif.gif");
         WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
         WebElement fileInput = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//input[@type='file'])[2]")));
         String filePath = "C:\\Users\\Prabha\\Desktop\\Butterfly.jpeg";
         fileInput.sendKeys(filePath);    
         driver.findElement(By.xpath("(//button[text()='Save'])[2]")).click(); */
	     
	 // Apply layout
//	     driver.findElement(By.xpath("//img[contains(@src, 'active-defalut-layout.svg')]")).click();  // Default image
//	     driver.findElement(By.xpath("//img[@src='/assets/new-icons/active-background-layout.svg']")).click();  // Full image
//	     driver.findElement(By.xpath("//img[@class='active-svg' and @src='/assets/new-icons/active-outer-right.svg']")).click();  //Image left
//	     driver.findElement(By.xpath("//img[@class='active-svg' and @src='/assets/new-icons/active-outer-left.svg']")).click();  //Image right
//	     driver.findElement(By.xpath("//img[@class='active-svg' and @src='/assets/new-icons/active-inner-right.svg']")).click();  //Side by side left
//	     driver.findElement(By.xpath("//img[@class='active-svg' and @src='/assets/new-icons/active-inner-left.svg']")).click();  // Side by side right
//	     
//     // click design and apply themes
//         driver.findElement(By.xpath("//p[text()='Design']")).click();
//         driver.findElement(By.xpath("//h5[text()='Themes']")).click();
//         Thread.sleep(2000);
//     // Apply slid dark
//         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h5[text()='Slid Dark']"))).click();
//         Thread.sleep(5000);
//     // Apply slid light
//         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h5[text()='Slid Light']"))).click();
//         
      
  // Insert New Import Google slides
	     driver.findElement(By.xpath("//span[text()='New Slide']")).click();
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@class='slide-list-hover'])[17]"))).click();
		 WebElement embed_code1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Add link here']")));
	     embed_code1.click();
	     embed_code1.sendKeys("https://docs.google.com/presentation/d/e/2PACX-1vStEuhpKRt2mh74jfZw6HW4YNAnGiRFRFIdMks35mCfUw94zBRumjObSouoz-LUFgb1-ZE3eV-hKnzq/pub?start=false&loop=false&delayms=3000");
	     driver.findElement(By.xpath("//input[@value='#82B4FE']")).click();
  //move to first slide
         WebElement slideElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='1']")));
          slideElement.click();
  //copy code and present 
         wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("svg[name='copy']"))).click();
         wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()=\"Present\"]"))).click();
	}
	@Test(priority = 4) 
         public void submitresponse() throws InterruptedException, UnsupportedFlavorException, IOException{
 			String myText = (String) Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor);
 			JavascriptExecutor js = (JavascriptExecutor) driver;
 	        js.executeScript("window.open();");
 	        Set<String> windowHandles = driver.getWindowHandles();
 	        Set<String> allWindowHandles = driver.getWindowHandles();
 	        ArrayList<String> tabs = new ArrayList<>(allWindowHandles);
 	        String[] handles = windowHandles.toArray(new String[0]);
             driver.switchTo().window(handles[handles.length - 1]);
             driver.get(myText);
             Actions actions1 = new Actions(driver);
         	actions1.sendKeys(Keys.ENTER).perform();
          
        // "Emoji" button
            WebElement emojiButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Emoji']")));
            emojiButton.click();
            WebElement likeEmoji = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@src='/assets/icons/reactions/like.svg']")));
            likeEmoji.click();
            
//       // Send a comment
//            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Comments']"))).click();
//            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Amazing! 🤩']"))).click();
//            WebElement comment = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@placeholder='Write your comment']")));
//            comment.click();
//            comment.sendKeys("Hello");
//            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Send Comment']"))).click();
//            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='modal-content ng-tns-c41-0']//button[@class='close close-icon-absolute ng-tns-c41-0'])[1]"))).click();

            
       // Send a question
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Ask a Question']"))).click(); 
            WebElement question = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@placeholder='Type here']")));
            question.click();
            question.sendKeys("No questions from myside");
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()=' Submit ']"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='modal fade overflow-hidden ng-tns-c41-0 show']//button[@class='close close-icon-absolute ng-tns-c41-0']"))).click();
            
       // Move to next slide
            driver.switchTo().window(tabs.get(0));
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@data-tooltip='Next Slide']"))).click();
            driver.switchTo().window(tabs.get(1));  
            Thread.sleep(5000); 
         	//JavascriptExecutor js3 = (JavascriptExecutor) driver;
         //	js3.executeScript("window.scrollTo(0, document.body.scrollHeight);");
         // Use JavaScript to scroll the element into view
         // Locate the element you want to scroll to
	         WebElement element = driver.findElement(By.xpath("//img[@class='showreacts ng-tns-c41-0']"));

	         // Use JavaScript to scroll the element into view
	         ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

	         // Optionally, you can add a short wait here to ensure the scroll action completes
	         Thread.sleep(5000); // Pause for half a second if needed

	         // Now, click the element
	         element.click();
	    
            

       // "Emoji" button
//            WebElement emojiButton1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Emoji']")));
//            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", emojiButton1); 
//            emojiButton1.click();
           WebElement likeEmoji1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@src='/assets/icons/reactions/like.svg']")));
           likeEmoji1.click();
         // Send a question
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Ask a Question']"))).click(); 
            WebElement question1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@placeholder='Type here']")));
            question1.click();
            question1.sendKeys("No questions from myside");
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()=' Submit ']"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='modal fade overflow-hidden ng-tns-c41-0 show']//button[@class='close close-icon-absolute ng-tns-c41-0']"))).click();
            
            
    	
    	
	}
}

