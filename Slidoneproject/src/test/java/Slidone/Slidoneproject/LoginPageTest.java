
package Slidone.Slidoneproject;

import java.awt.Toolkit;


import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class LoginPageTest {

    WebDriver driver;
	private WebElement elementToDoubleClick;
	 private WebDriverWait wait;

    @BeforeClass
    public void setup() {
       
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    }

    @Test(priority = 1)
    public void loginTest() throws InterruptedException {
       
        driver.get("https://app.slidone.com/auth/signin");
        WebElement email = driver.findElement(By.id("emailInput"));
        email.sendKeys("121124@mailinator.com");

        WebElement password = driver.findElement(By.id("passwordInput"));
        password.sendKeys("praba@1107S");
        WebElement signin = driver.findElement(By.cssSelector("button[type='submit']"));
        signin.click();
        Thread.sleep(3000);
    }
    @Test(priority = 2, dependsOnMethods = "loginTest")
    public void createPresentationTest() throws InterruptedException, UnsupportedFlavorException, IOException {
  
       
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
    	Thread.sleep(1000);
    	WebElement newpres = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='New Presentation']")));
        newpres.click();
        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(1000));
        WebElement presname = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='slideName']")));
        presname = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='slideName']")));
        presname.sendKeys("Testing");

        WebElement save = driver.findElement(By.xpath("//button[text()=' Save']"));
        save.click();
//        Thread.sleep(2000);
////Multiple choice
//        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
//        WebElement mc = wait2.until(ExpectedConditions.visibilityOfElementLocated(
//        By.xpath("(//p[text()=\"Popular question types\"])[1]//following::a[1]")));
//
//            mc.click();  
//            WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(10));
//            WebElement inputElement = wait3.until(ExpectedConditions.visibilityOfElementLocated(
//            By.xpath("//input[@placeholder='Multiple Choice']")));
//
//                inputElement.sendKeys("What is your fav food"); 
//                WebDriverWait wait4 = new WebDriverWait(driver, Duration.ofSeconds(10));
//                WebElement linkElement = wait4.until(ExpectedConditions.visibilityOfElementLocated(
//                        By.xpath("//a[text()='Add a longer description']"))); 
//
//                    linkElement.click();
//                    WebElement ld = driver.findElement(By.xpath("//textarea[@type='text']"));
//                    ld.click();
//                    ld.sendKeys("Choose your choice from the below options");
//                   
//                    JavascriptExecutor js1 = (JavascriptExecutor) driver;
//
//                    js1.executeScript("window.scrollBy(0,1500);");
//                    WebDriverWait wait12 = new WebDriverWait(driver, Duration.ofSeconds(40));
//        	        WebElement add = wait12.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Add Option ']")));
//        		 add.click();
//        		 add.click();
//        		 driver.navigate().refresh();
//        		 Thread.sleep(2000);
//        		 WebElement option1 = driver.findElement(By.xpath("//input[@placeholder='Option 1']"));
//           		 option1.click();
//           		 option1.sendKeys("one");
//           		WebElement option2 = driver.findElement(By.xpath("//input[@placeholder='Option 2']"));
//       		 option2.click();
//       		 option2.sendKeys("Chicken rice");
//       		WebElement option3 = driver.findElement(By.xpath("//input[@placeholder='Option 3']"));
//   		 option3.click();
//   		 option3.sendKeys("Curd rice");
//   		 
//		 WebDriverWait wait5 = new WebDriverWait(driver, Duration.ofSeconds(100));
//         WebElement option4 = wait5.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Option 4']")));
//		 option4.click();
//		 option4.sendKeys("Sambar rice");
//		 //driver.navigate().refresh();
//		 WebDriverWait wait6 = new WebDriverWait(driver, Duration.ofSeconds(100));
//         WebElement option5 = wait6.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Option 5']")));
//		 option5.click();
//		 option5.sendKeys("Vegetable Biryani");
	 driver.findElement(By.xpath("/html/body/app-root/app-work-space/section/main/section/div/app-right-side-bar/div[1]/div[2]/div[2]/div[3]/div[2]/label/span")).click();
		 // choosecrt.click();
//		 WebDriverWait wait7 = new WebDriverWait(driver, Duration.ofSeconds(100));
//         WebElement choose1 = wait7.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[@for='0']")));
//		 choose1.click();
//		 WebDriverWait wait8 = new WebDriverWait(driver, Duration.ofSeconds(100));
//		
/*//WORDCLOUD
		 
		 WebElement ns=driver.findElement(By.xpath("//span[text()='New Slide']"));
		 ns.click();
		 WebDriverWait wait16 = new WebDriverWait(driver, Duration.ofSeconds(30));
	        WebElement wc = wait16.until(ExpectedConditions.visibilityOfElementLocated(
	        By.xpath("(//p[text()=\"Popular question types\"])[1]//following::a[2]")));
		 wc.click();
		 WebDriverWait wait15 = new WebDriverWait(driver, Duration.ofSeconds(30));
	        WebElement wc_ques = wait15.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder=\"Word Cloud\"]")));
		 wc_ques.sendKeys("Where are you from?");
		 WebDriverWait wait13 = new WebDriverWait(driver, Duration.ofSeconds(30));
         WebElement wc_ld = wait13.until(ExpectedConditions.visibilityOfElementLocated(
                 By.xpath("//a[text()='Add a longer description']")));
         wc_ld.click();
         WebDriverWait wait14 = new WebDriverWait(driver, Duration.ofSeconds(40));
	        WebElement wc_ld1 = wait14.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@type='text']")));
         wc_ld1.click();*/
//         wc_ld1.sendKeys("tell about your place");
//		 
////Open ended
//         WebElement ns1=driver.findElement(By.xpath("//span[text()='New Slide']"));
//		 ns1.click();
//		 WebDriverWait wait17 = new WebDriverWait(driver, Duration.ofSeconds(30));
//	        WebElement oe = wait17.until(ExpectedConditions.visibilityOfElementLocated(
//	        By.xpath("(//p[text()=\"Popular question types\"])[1]//following::a[3]")));
//		 oe.click();
//		 driver.navigate().refresh();
//		 WebDriverWait wait18 = new WebDriverWait(driver, Duration.ofSeconds(30));
//         WebElement oe_ques = wait18.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Open Ended']")));
//         oe_ques.sendKeys("Which is the national animal");
//         WebDriverWait wait19 = new WebDriverWait(driver, Duration.ofSeconds(30));
//         WebElement oe_ld = wait19.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Add a longer description']")));
//         oe_ld.click();
//         WebDriverWait wait20 = new WebDriverWait(driver, Duration.ofSeconds(30));
//         WebElement oe_ld1 = wait20.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@type='text']")));
//         oe_ld1.sendKeys("Must respond");
//         
////Scales
//         WebElement ns2=driver.findElement(By.xpath("//span[text()='New Slide']"));
//		 ns2.click();
//		 WebDriverWait wait21 = new WebDriverWait(driver, Duration.ofSeconds(30));
//	        WebElement scales = wait21.until(ExpectedConditions.visibilityOfElementLocated(
//	        By.xpath("(//p[text()=\"Popular question types\"])[1]//following::a[4]")));
//		 scales.click();
//		 //driver.navigate().refresh();
//		 WebDriverWait wait22 = new WebDriverWait(driver, Duration.ofSeconds(30));
//         WebElement sca_ques = wait22.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Scales']")));
//         sca_ques.sendKeys("Which is the national flower");
//         WebDriverWait wait23 = new WebDriverWait(driver, Duration.ofSeconds(50));
//         WebElement sca_ld = wait23.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Add a longer description")));
//         sca_ld.click();
//       WebDriverWait wait24 = new WebDriverWait(driver, Duration.ofSeconds(30));
//       WebElement sca_ld1 = wait24.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@maxlength='150']")));
//      sca_ld1.sendKeys("Must respond");
//      driver.navigate().refresh();   
//      WebDriverWait wait28 = new WebDriverWait(driver, Duration.ofSeconds(30));
//      WebElement add_sta = wait28.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Add Statement ']")));
//      add_sta.click();
//      add_sta.click();
//   
//         WebDriverWait wait111 = new WebDriverWait(driver, Duration.ofSeconds(30));
//         WebElement sta1 = wait111.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Statement 1']")));
//         sta1.sendKeys("hiiii");
//         WebDriverWait wait29 = new WebDriverWait(driver, Duration.ofSeconds(30));
//         WebElement sta2 = wait29.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Statement 2']")));
//         sta2.sendKeys("hello");
//         WebDriverWait wait25 = new WebDriverWait(driver, Duration.ofSeconds(30));
//         WebElement sta3 = wait25.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Statement 3']")));
//         sta3.sendKeys("good");
//         WebDriverWait wait26 = new WebDriverWait(driver, Duration.ofSeconds(30));
//         WebElement sta4 = wait26.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Statement 4']")));
//         sta4.sendKeys("bad");
//         WebDriverWait wait27 = new WebDriverWait(driver, Duration.ofSeconds(30));
//         WebElement sta5 = wait27.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Statement 5']")));
//         sta5.sendKeys("hiiii");
//         
////Ranking
//        Thread.sleep(2000);
//         WebElement ns3=driver.findElement(By.xpath("//span[text()='New Slide']"));
//		 ns3.click();
//	        WebElement ranking = wait111.until(ExpectedConditions.visibilityOfElementLocated(
//	        By.xpath("(//p[text()=\"Popular question types\"])[1]//following::a[5]")));
//		 ranking.click();
//		 driver.navigate().refresh();
//		 Thread.sleep(2000);
//		WebElement rank_ques = wait111.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Ranking']")));
//         rank_ques.sendKeys("Rank the items");
//         WebElement rank_ld1 = wait111.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='Add a longer description']")));
//         rank_ld1.click();
//         WebElement rank_ld = wait111.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@maxlength='150']")));
//         rank_ld.sendKeys("Rank it in alphabetical order");
//         WebElement add_items = wait111.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Add Item ']")));
//         add_items.click();
//         Thread.sleep(1000);
//         add_items.click();
//         Thread.sleep(2000);
//         WebElement item1 = wait111.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Item 1']")));
//         item1.sendKeys("apple");
//         WebElement item2 = wait111.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Item 2']")));
//         item2.sendKeys("mango");
//         WebElement item3 = wait111.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Item 3']")));
//         item3.click();
//         item3.sendKeys("watermelon");
//         WebElement item4 = wait111.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Item 4']")));
//         item4.sendKeys("banana");
//         WebElement item5 = wait111.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Item 5']")));
//         item5.sendKeys("pineapple");
//         
//        //Quiz gtn
//         wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='New Slide']"))).click();
//         wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-root/app-work-space/section/main/app-left-side-bar/section/div[2]/div/div/div/ul/div[6]/div[3]/a/div/img[2]"))).click();
//         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Guess the Number']"))).sendKeys("Choose your fav num");
//         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='Add a longer description']"))).click();
//         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@maxlength='150']"))).sendKeys("Expecting your reply");
//    
////move to first slide
//         WebElement slideElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='1']")));
//         slideElement.click();
		 
       // public void Quiz_GTN() throws InterruptedException {
        	
        	  //wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='New Slide']"))).click();
//        	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@class='slide-list-hover'])[14]"))).click();
//              //((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", gtn);
//              wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Guess the Number']"))).sendKeys("Choose your fav num");
//              wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='Add a longer description']"))).click();
//              wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@maxlength='150']"))).sendKeys("Expecting your reply");
//              //Quiz Lineup
//              Thread.sleep(2000);
//	          wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='New Slide']"))).click();
//        	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@class='slide-list-hover'])[15]"))).click();
//        	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Lineup']"))).sendKeys("Rank the orders");
//        	  driver.navigate().refresh();
//              wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='Add a longer description']"))).click();
//              wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@maxlength='150']"))).sendKeys("Must respond");
//              wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Order 1']"))).sendKeys("Cat");
//              wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Order 2']"))).sendKeys("Dog");
//              wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Order 3']"))).sendKeys("Birds");
//              wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Add Order ']"))).click();
//              wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Add Order ']"))).click();
//              wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Order 4']"))).sendKeys("Fish");
//              wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Order 5']"))).sendKeys("Rat");
        
        	
    
//copy code and present 
//		 WebDriverWait wait9 = new WebDriverWait(driver, Duration.ofSeconds(30));
//		 WebElement copycode = wait9.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("svg[name='copy']")));
//			copycode.click();
//			WebDriverWait wait11 = new WebDriverWait(driver, Duration.ofSeconds(30));
//	        
//			WebElement present = driver.findElement(By.xpath("//span[text()=\"Present\"]"));
//			present.click();
////Open in new tab and paste the link
//				String myText = (String) Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor);
//				JavascriptExecutor js = (JavascriptExecutor) driver;
//		        js.executeScript("window.open();");
//		        Set<String> windowHandles = driver.getWindowHandles();
//		           String[] handles = windowHandles.toArray(new String[0]);
//	             driver.switchTo().window(handles[handles.length - 1]);
//	               driver.get(myText);
//	               Actions actions1 = new Actions(driver);
//           		actions1.sendKeys(Keys.ENTER).perform();
//           		
//           		//Quiz gtn
//           		wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("input"))).click();
//                wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("input"))).sendKeys("prabha");
//                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@class='btn btn-primary btn-align w-100 ng-tns-c41-0'])[1]"))).click();
//                String currentWindowHandle = driver.getWindowHandle();
//				driver.switchTo().window(currentWindowHandle);
//				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[normalize-space()=\"Let's go\"])[1]"))).click();
//		        windowHandles = driver.getWindowHandles();
//		        handles = windowHandles.toArray(new String[0]);
//
//		        // Switch to the new tab after clicking Next Slide
//		        driver.switchTo().window(handles[handles.length - 1]);
//		        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//		        Thread.sleep(2000);
//		        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[normalize-space()='World Wide Web']"))).click();
//		        wait1 = new WebDriverWait(driver, Duration.ofSeconds(60));
//		       // WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
//		         WebElement slider = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("guessthenumberRangeBar")));
//
//		         // Check if the element is visible and interactable
//		         if (slider.isDisplayed() && slider.isEnabled()) {
//		             // Set the slider value using JavaScript
//		             JavascriptExecutor js1 = (JavascriptExecutor) driver;
//		             js1.executeScript("arguments[0].value = '7';", slider);  // Set the value to 5
//
//		             // Trigger the input event to simulate user interaction
//		             js1.executeScript("arguments[0].dispatchEvent(new Event('input'));", slider);
//		         } else {
//		             System.out.println("Slider is not visible or interactable.");
//		         }
//		         wait.until(ExpectedConditions.elementToBeClickable(By.xpath(" //button[@class='btn btn-primary btn-align w-100 ng-tns-c41-0']"))).click();
//   
//		         
//				}
//    //Quiz GTN 
//    
//
//    @Test(priority = 3, dependsOnMethods = "createPresentationTest")
//	       		public void Answer() throws InterruptedException, UnsupportedFlavorException, IOException{
//    	
//    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
//    	//Submit response for multiple choice
//	       			WebDriverWait wait10 = new WebDriverWait(driver, Duration.ofSeconds(20));
//	                WebElement ans = wait10.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@type='radio'])[1]")));
//                    ans.click();
//         	Actions actions = new Actions(driver);
//             actions.sendKeys(Keys.ENTER).perform();
//             String currentWindowHandle = driver.getWindowHandle();
//             
//             driver.switchTo().window(currentWindowHandle);
//             wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@data-tooltip='Next Slide']"))).click();
//          // Switch back to the new window after clicking Next Slide
//             Set<String> windowHandles = driver.getWindowHandles();
//             windowHandles = driver.getWindowHandles();
//             String[] handles = windowHandles.toArray(new String[0]);
//           //  handles = windowHandles.toArray(new String[0]);
//
//             // Switch to the new tab after clicking Next Slide
//             driver.switchTo().window(handles[handles.length - 1]);
//             
//       //Submit response for word cloud
//           WebElement   wc_ans = wait10.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Enter a word']")));
// 			wc_ans.click();
// 			wc_ans.sendKeys("Trichy");
// 			actions.sendKeys(Keys.ENTER).perform();
//       //submit response for open ended
//          WebElement   oe_ans = wait10.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//textarea[@maxlength='200'])[1]")));
//			oe_ans.click();
//			oe_ans.sendKeys("Tiger");
//			 WebElement   oe_submit = wait10.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Submit']")));
//				oe_submit.click();
//	  //submit response for ranking
//
//    	//Actions actions = new Actions(driver);
//
//    	// WebDriverWait wait1 = new WebDriverWait(driver, 10); // 10 seconds timeout
//    	 WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
//
//          // Define the XPath for the elements you want to interact with
//          String xpath = "//span[contains(@class, 'range-label')]"; // Update with your actual XPath
//
//          // Define the indexes of the elements you want to click (1-based index)
//          int[] indexes = {1, 2, 3, 4, 5}; // Adjust these as needed based on your page
//
//          // Loop through each index to click the corresponding element
//          for (int index : indexes) {
//              try {
//                  // Find the element using the defined XPath and wait until it is visible
//                  WebElement element = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("(" + xpath + ")[" + index + "]")));
//
//                  // Scroll to the element using JavaScript Executor
//                  ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
//
//                  // Wait until the element is clickable before clicking
//                  WebElement clickableElement = wait1.until(ExpectedConditions.elementToBeClickable(element));
//
//                  // Click the element
//                  clickableElement.click();
//
//                  System.out.println("Element with index " + index + " clicked successfully!");
//
//              } catch (Exception e) {
//                  System.out.println("Failed to click element with index " + index + ": " + e.getMessage());
//              }
//          }
//          Thread.sleep(2000);
//          WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Submit']")));
//          element.click();
    	
    	
          //wait.until(ExpectedConditions.elementToBeClickable(By.xpath(""))).click();
//    	((JavascriptExecutor) driver).executeScript("arguments[0].click();", wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[contains(@class, 'range-label')])[5]"))));
//    	
//    	 
//    	((JavascriptExecutor) driver).executeScript("arguments[0].click();", wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[contains(@class, 'range-label')])[3]"))));
//    	
//    	((JavascriptExecutor) driver).executeScript("arguments[0].click();", wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[contains(@class, 'range-label')])[4]"))));
//    	((JavascriptExecutor) driver).executeScript("arguments[0].click();", wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[contains(@class, 'range-label')])[1]"))));
//    	((JavascriptExecutor) driver).executeScript("arguments[0].click();", wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[contains(@class, 'range-label')])[2]"))));
//			oe_submit.click();
//				 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[contains(@class, 'range-label')])[3]"))).click();
//				 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[contains(@class, 'range-label')])[5]"))).click();
//				 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[contains(@class, 'range-label')])[2]"))).click();
//				 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[contains(@class, 'range-label')])[1]"))).click();
//				 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[contains(@class, 'range-label')])[4]"))).click();
//				 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Submit']"))).click();
//				 
//          // Submit response for scales
//      
//    	 int[] dynamicValues = {1, 2, 3, 4, 5}; // Example dynamic values
//
//         // Loop through each value to set the slider
//         for (int i = 0; i < dynamicValues.length; i++) {
//             int value = dynamicValues[i]; // Get the dynamic value for the current slider index
//
//             try {
//                 // Use XPath to select the slider by index
//                 WebElement slider = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@id='scalesRangeInput'])[" + (i + 1) + "]")));
//
//                 // Scroll to the slider element
//                 ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", slider);
//
//                 // Ensure the slider is displayed and enabled
//                 if (slider.isDisplayed() && slider.isEnabled()) {
//                     // Set the slider value using JavaScript
//                     JavascriptExecutor js1 = (JavascriptExecutor) driver;
//                     js1.executeScript("arguments[0].value = arguments[1];", slider, value); // Set the dynamic value
//
//                     // Trigger the input event to simulate user interaction
//                     js1.executeScript("arguments[0].dispatchEvent(new Event('input'));", slider);
//
//                     // Wait until the slider value is updated to the new value
//                     wait.until(ExpectedConditions.attributeToBe(slider, "value", String.valueOf(value)));
//
//                     // Wait for the slider to be clickable again after the update
//                     wait.until(ExpectedConditions.elementToBeClickable(slider));
//
//                     // Output the value set
//                     System.out.println("Slider value set to: " + value);
//                 } else {
//                     System.out.println("Slider is not visible or interactable.");
//                 }
//             } catch (Exception e) {
//                 System.out.println("Error setting slider value " + value + ": " + e.getMessage());
//             }
//         }
//         WebElement sca_submit = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Submit']")));
//         sca_submit.click();
    	
    	//Submit response for lineup
//   	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"cdk-drop-list-1\"]/div[1]/a/div"))).click();
//   	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"cdk-drop-list-1\"]/div[2]/a/div"))).click();
//   	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"cdk-drop-list-1\"]/div[3]/a/div"))).click();
//   	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"cdk-drop-list-1\"]/div[4]/a/div"))).click();
//   	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"cdk-drop-list-1\"]/div[5]/a/div"))).click();
//   	Thread.sleep(2000);
//    WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Submit']")));
//    element.click();
    	
    	


 }
}

