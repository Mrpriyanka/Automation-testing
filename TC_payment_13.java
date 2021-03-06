package payment;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class TC_payment_13{
	WebDriver cDriver;
	 @BeforeMethod
	    void setUp()
	     {
		  WebDriverManager.chromedriver().setup();
		  cDriver= new ChromeDriver();
	     }
	 @Test(description="User can select payment method option")
	     
	 void checkCardDetail() throws InterruptedException {
		 
		 cDriver.get("https://www.amazon.in/gp/css/homepage.html?");
	     cDriver.findElement(By.xpath("//h2[normalize-space()='Payment options']")).click();
		 WebElement emailidElement1=cDriver.findElement(By.xpath("//input[@id='ap_email']"));
		 emailidElement1.sendKeys("suryarajan361@gmail.com");
		 cDriver.findElement(By.xpath("//input[@id='continue']")).click();
		 WebElement passwordElement2= cDriver.findElement(By.xpath("//input[@id='ap_password']"));
         passwordElement2.sendKeys("Feb151998@");
		 cDriver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
		 Thread.sleep(2000);
		 cDriver.findElement(By.xpath("//input[@class='a-button-input']")).click();
		 System.out.println("Test Cases passed");
	     System.out.println("Payment method option is selected successfully");
	    
	 }

	 @AfterMethod
	 void tearDown()
	 {
	 cDriver.close();
	 }
	 }
