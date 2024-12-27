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

	public class live_slidone {
	       
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
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//p[text()=\"Popular question types\"])[1]//following::a[3]"))).click();
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Open Ended']"))).sendKeys("Which is the national flower");
				driver.navigate().refresh();
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Add a longer description']"))).click(); 
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//textarea[@type='text']"))).sendKeys("Must respond");
			}
			//Scales
			@Test(priority = 6)
			public void scalesTest() throws InterruptedException {
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='New Slide']"))).click();
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//p[text()=\"Popular question types\"])[1]//following::a[4]"))).click();
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Scales']"))).sendKeys("Rate your communication skills");
//				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Add a longer description']"))).click(); 
//				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//textarea[@type='text']"))).click();
//				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//textarea[@type='text']"))).sendKeys("Rate the five statements");
				
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
				wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//p[text()=\"Popular question types\"])[1]//following::a[5]"))).click();
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
			 // QA Slide
		    @Test(priority = 8)
		    public void testCreateQASlide() throws InterruptedException {
		    	driver.findElement(By.xpath("//span[text()='New Slide']")).click();
		    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body[1]/app-root[1]/app-work-space[1]/section[1]/main[1]/app-left-side-bar[1]/section[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/div[4]/div[6]/a[1]"))).click();
		    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Ask me anything']"))).click();
		    	driver.findElement(By.xpath("//input[@placeholder='Ask me anything']")).sendKeys("Drop Your questions here");
		    	driver.findElement(By.xpath("//input[@value='#FF8383']")).click();
		    }
		    // GTN Slide
		    @Test(priority = 9)
		    public void testCreateGTNSlide() throws InterruptedException {
		    	driver.findElement(By.xpath("//span[text()='New Slide']")).click();
		    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul/div[4]/div[7]/a/div/img[1]"))).click();
		    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Guess the Number']"))).sendKeys("give the guess number");
		    }
		    // This or That Slide
		    @Test(priority = 10)
		    public void testCreateThisOrThatSlide() throws InterruptedException {
		    	driver.findElement(By.xpath("//span[text()='New Slide']")).click();
		    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul/div[4]/div[8]/a/div/img[1]"))).click();
		        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='This or That']"))).sendKeys("This or That Questions");
		       
		        driver.findElement(By.xpath("//input[@placeholder='Option 1']")).sendKeys("CHOCOLATE");
		        driver.findElement(By.xpath("//input[@placeholder='Option 2']")).sendKeys("JUICE");
		    }
		    // Traffic Lights Slide
		    @Test(priority = 11)
		    public void testCreateTrafficLightsSlide() throws InterruptedException {
		    	driver.findElement(By.xpath("//span[text()='New Slide']")).click();
		    	 driver.findElement(By.xpath("(//a[@class='slide-list-hover'])[10]")).click();
		    	 //driver.findElement(By.xpath("//input[@placeholder='Traffic Lights']")).click();
		    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Traffic Lights']"))).click();
		    	 driver.findElement(By.xpath("(//input[@placeholder='Traffic Lights'])[1]")).sendKeys("shall we do");
		        
		    }
		    // Truth or Lie Slide
		    @Test(priority = 12)
		    public void testCreateTruthOrLieSlide() throws InterruptedException {
		    	driver.findElement(By.xpath("//span[text()='New Slide']")).click();
		        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul/div[4]/div[10]/a/div/img[1]"))).click();
		        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Truth or Lie']"))).sendKeys("Truth or Lie Questions");
		       
		        driver.findElement(By.xpath("//input[@placeholder='Statement 1']")).sendKeys("iam cute");
		        driver.findElement(By.xpath("//input[@placeholder='Statement 2']")).sendKeys("swart worker");
		        driver.findElement(By.xpath("//input[@placeholder='Statement 3']")).sendKeys("bold");
		    }


}
