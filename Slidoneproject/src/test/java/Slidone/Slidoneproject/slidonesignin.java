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

public class slidonesignin {
       
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
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("emailInput"))).sendKeys("121124@mailinator.com");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("passwordInput"))).sendKeys("praba@1107S");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[type='submit']"))).click();
    }
	@Test(priority = 2)
	public void createPresentationTest() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='New Presentation']"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='slideName']"))).sendKeys("Testing");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()=' Save']"))).click();
	}
	//Multiple choice
	@Test(priority = 3)
	public void multiplechoiceTest() throws InterruptedException {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@class='slide-list-hover'])[2]"))).click();
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
	}
	//word cloud
		@Test(priority = 4)
		public void wordcloudTest() throws InterruptedException {
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='New Slide']"))).click();
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@class='slide-list-hover'])[3]"))).click();
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder=\"Word Cloud\"]"))).sendKeys("Where are you from?");
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Add a longer description']"))).click(); 
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//textarea[@type='text']"))).sendKeys("Briefly tell about your place");
		}
		//Open ended
		@Test(priority = 5)
		public void openendedTest() throws InterruptedException {
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='New Slide']"))).click();
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@class='slide-list-hover'])[4]"))).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Open Ended']"))).sendKeys("Which is the national flower");
			driver.navigate().refresh();
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Add a longer description']"))).click(); 
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//textarea[@type='text']"))).sendKeys("Must respond");
		}
		//Scales
		@Test(priority = 6)
		public void scalesTest() throws InterruptedException {
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='New Slide']"))).click();
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@class='slide-list-hover'])[5]"))).click();
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Scales']"))).sendKeys("Rate your communication skills");
//			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Add a longer description']"))).click(); 
//			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//textarea[@type='text']"))).click();
//			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//textarea[@type='text']"))).sendKeys("Rate the five statements");
			
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Add Statement ']"))).click();
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Add Statement ']"))).click();
			driver.navigate().refresh();
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Statement 1']"))).sendKeys("Strongly agree");
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Statement 2']"))).sendKeys("Strongly disagree");
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Statement 3']"))).sendKeys("Agree");
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Statement 4']"))).sendKeys("Disagree");
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Statement 5']"))).sendKeys("Neutral");
		}
		//Ranking
		@Test(priority = 7)
		public void rankingTest() throws InterruptedException {
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='New Slide']"))).click();
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@class='slide-list-hover'])[6]"))).click();
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Ranking']"))).sendKeys("Rank the orders");
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='New Slide']"))).click();
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Add a longer description']"))).click();
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//textarea[@maxlength='150']"))).sendKeys("Rank it in alphabetical order");
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Add Item ']"))).click();
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Add Item ']"))).click();
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Item 1']"))).sendKeys("Apple");
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Item 2']"))).sendKeys("Mango");
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Item 3']"))).sendKeys("Pineapple");
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Item 4']"))).sendKeys("Watermelon");
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Item 5']"))).sendKeys("Banana");
			
		}
		//Quiz-Guess the number
		@Test(priority = 8)
		public void quiz_GTNTest() throws InterruptedException {
		    wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='New Slide']"))).click();
		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@class='slide-list-hover'])[14]"))).click();
		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Guess the Number']"))).sendKeys("Choose your fav num");
		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='Add a longer description']"))).click();
		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@maxlength='150']"))).sendKeys("Expecting your reply");
		}
		//Quiz-Lineup
		@Test(priority = 9)
		public void lineupTest() throws InterruptedException {
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='New Slide']"))).click();
       	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@class='slide-list-hover'])[15]"))).click();
       	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Lineup']"))).sendKeys("Rank the orders");
       	    driver.navigate().refresh();
             wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='Add a longer description']"))).click();
             wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@maxlength='150']"))).sendKeys("Must respond");
             wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Order 1']"))).sendKeys("Cat");
             wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Order 2']"))).sendKeys("Dog");
             wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Order 3']"))).sendKeys("Birds");
             wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Add Order ']"))).click();
             wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Add Order ']"))).click();
             wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Order 4']"))).click();
             wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Order 4']"))).sendKeys("Fish");
             wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Order 5']"))).sendKeys("Rat");
         //move to first slide
          WebElement slideElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='1']")));
           slideElement.click();
         //copy code and present 
            wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("svg[name='copy']"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()=\"Present\"]"))).click();
		}
		//Open in new tab and paste the link
		@Test(priority = 10)
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
        	//Submit response for multiple choice
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@type='radio'])[1]"))).click();
            Thread.sleep(3000);
       	 JavascriptExecutor js0 = (JavascriptExecutor) driver;

       	// Scroll to the bottom of the page
       	js0.executeScript("window.scrollTo(0, document.body.scrollHeight);");
            WebElement mc_submit = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Submit']")));
    	    mc_submit.click();
            driver.switchTo().window(tabs.get(0));
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@data-tooltip='Next Slide']"))).click();
            driver.switchTo().window(tabs.get(1));
	       
            //driver.navigate().refresh();
            
            //Submit response for word cloud
            WebElement wc_ans = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Enter a word']")));
			wc_ans.click();
			wc_ans.sendKeys("Trichy");
			  Actions actions2 = new Actions(driver);
			actions2.sendKeys(Keys.ENTER).perform();
            driver.switchTo().window(tabs.get(0));
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@data-tooltip='Next Slide']"))).click();
            driver.switchTo().window(tabs.get(1));
            //driver.navigate().refresh();
            
          //submit response for open ended
            WebElement   oe_ans = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//textarea[@maxlength='200'])[1]")));
			oe_ans.click();
			oe_ans.sendKeys("Tiger");
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Submit']"))).click();
			 driver.switchTo().window(tabs.get(0));
	            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@data-tooltip='Next Slide']"))).click();
	            driver.switchTo().window(tabs.get(1));
	           // driver.navigate().refresh();
	         // Submit response for scales
	          
	        	 int[] dynamicValues = {1, 2, 3, 4, 5}; 
	             for (int i = 0; i < dynamicValues.length; i++) {
	                 int value = dynamicValues[i]; 
	    
	                 try {
	                    
	                     WebElement slider = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@id='scalesRangeInput'])[" + (i + 1) + "]")));
	                     ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", slider);
	                     if (slider.isDisplayed() && slider.isEnabled()) {
	                         // Set the slider value using JavaScript
	                         JavascriptExecutor js1 = (JavascriptExecutor) driver;
	                         js1.executeScript("arguments[0].value = arguments[1];", slider, value); 
	                         js1.executeScript("arguments[0].dispatchEvent(new Event('input'));", slider);
	                         wait.until(ExpectedConditions.attributeToBe(slider, "value", String.valueOf(value)));
	                         wait.until(ExpectedConditions.elementToBeClickable(slider));
	    
	                     }
	                 } catch (Exception e) {
	                     System.out.println("Error setting slider value " + value + ": " + e.getMessage());
	                 }
	             }
	             WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(50));
	             WebElement sca_submit =wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Submit')]")));
	             ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight);", sca_submit);
	             Thread.sleep(2000);
	             sca_submit.click();
	             driver.switchTo().window(tabs.get(0));
		            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@data-tooltip='Next Slide']"))).click();
		            driver.switchTo().window(tabs.get(1));
		           // driver.navigate().refresh();
	        // submit response for ranking  
		            Thread.sleep(3000);
		            JavascriptExecutor js1 = (JavascriptExecutor) driver;
		            js1.executeScript("window.scrollTo(0, 0);");
		            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@class='text-decoration-none drag-hand'])[1]"))).click();
		        	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@class='text-decoration-none drag-hand'])[1]"))).click();
		        	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@class='text-decoration-none drag-hand'])[1]"))).click();
		        	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@class='text-decoration-none drag-hand'])[1]"))).click();
		        	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@class='text-decoration-none drag-hand'])[1]"))).click();
		        	
		        	 Thread.sleep(3000);
		        	 JavascriptExecutor js2 = (JavascriptExecutor) driver;

		        	// Scroll to the bottom of the page
		        	js2.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		        	 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Submit']")));
		        	    element.click();
	        	 driver.switchTo().window(tabs.get(0));
		            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@data-tooltip='Next Slide']"))).click();
		            driver.switchTo().window(tabs.get(1));
//		            driver.navigate().refresh();
		            
		   //submit response quiz - GTN
		            wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("input"))).click();
	                wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("input"))).sendKeys("prabha");
	                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@class='btn btn-primary btn-align w-100 ng-tns-c41-0'])[1]"))).click();
	                driver.switchTo().window(tabs.get(0));
	                wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[normalize-space()=\"Let's go\"])[1]"))).click();
	                driver.switchTo().window(tabs.get(1));
	                WebElement slider = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("guessthenumberRangeBar")));
			         if (slider.isDisplayed() && slider.isEnabled()) {
			             JavascriptExecutor js11 = (JavascriptExecutor) driver;
			             js11.executeScript("arguments[0].value = '7';", slider);  
			             js11.executeScript("arguments[0].dispatchEvent(new Event('input'));", slider);
			         } else {
			             System.out.println("Slider is not visible or interactable.");
			         }
			         wait.until(ExpectedConditions.elementToBeClickable(By.xpath(" //button[@class='btn btn-primary btn-align w-100 ng-tns-c41-0']"))).click();
			         driver.switchTo().window(tabs.get(0));
			            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@data-tooltip='Next Slide']"))).click();
			            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@data-tooltip='Next Slide']"))).click();
			            driver.switchTo().window(tabs.get(1));
//			            driver.navigate().refresh();
			       //Submit response for lineup
        	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("input"))).click();
             wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("input"))).sendKeys("prabha");
             wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@class='btn btn-primary btn-align w-100 ng-tns-c41-0'])[1]"))).click();
             driver.switchTo().window(tabs.get(0));
             wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[normalize-space()=\"Let's go\"])[1]"))).click();
             driver.switchTo().window(tabs.get(1));
			            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@class='text-decoration-none drag-hand'])[1]"))).click();
			        	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@class='text-decoration-none drag-hand'])[1]"))).click();
			        	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@class='text-decoration-none drag-hand'])[1]"))).click();
			        	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@class='text-decoration-none drag-hand'])[1]"))).click();
			        	 Thread.sleep(3000);
			        	 JavascriptExecutor js5 = (JavascriptExecutor) driver;

			        	// Scroll to the bottom of the page
			        	js5.executeScript("window.scrollTo(0, document.body.scrollHeight);");
			        	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@class='text-decoration-none drag-hand'])[1]"))).click();
			        	
			        	 WebElement element3 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Submit']")));
			        	    element3.click();
       	
		}
	    	
	}
	
	
	

