package MyStoresign;


import static org.testng.Assert.assertTrue;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;

import org.openqa.selenium.WebElement;

public class Signin {
	      
	
	@Given("I am on automationpractice.com/index.php")
	 public void launch_the_website()  {
	        
	    WebDriver driver = new ChromeDriver(); 
	    
	    System.setProperty("webdriver.chrome.driver",System.getProperty("user")+"//Drivers/chromedriver.exe" );
	      	
	    //click on sign in button on mysyore home page	
	      		driver.get("http://automationpractice.com/index.php");
	      		
	      		@When("I click on sign in on landing page")
	      		driver.findElement(By.xpath("//a[@class='login']")).click();
	      		
	      		
	      		@Then ("Verify I am navigated to log in page.")
	      		
	      		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
	             System.out.println(driver.getCurrentUrl());
	      		
	      		@Given("I am on log in page")
	      		
	      		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
	             System.out.println(driver.getCurrentUrl());
	             
	             driver.findElement(By.id("email_create").sendKeys("Automation_" + Number.Next(1, 1000).ToString() + "_" + driver.RandomString(4) + "@gmail.com"));
	             driver.findElement(By.name("email_create")).click();
	           
	           //Registeration Form
	           //Firstname
	             driver.findElement(By.id("customer_firstname" )).sendKeys("Test");
	             //lastname
	             driver.findElement(By.id("customer_lastname")).sendKeys("TestANZ");
	             //email
	             String actualtext=	driver.findElement(By.id("email")).getAttribute("Value");
	             String expectedtext = "rewr@gmail.com";
	             Assert.assertTrue(actualtext.equals(expectedtext));
	             //Password
	            
	           	driver.findElement(By.id("passwd")).sendKeys("test@123");
	           	//Firstname in address detail page
	           	
	           	String actualtext=	driver.findElement(By.id("firstname")).getAttribute("Value");
	             String expectedtext = "test";
	             Assert.assertTrue(actualtext.equals(expectedtext));
	           //lastname in address detail page
	             String actualtext=	driver.findElement(By.id("lastname")).getAttribute("Value");
	             String expectedtext = "testzz";
	             Assert.assertTrue(actualtext.equals(expectedtext));
	             
	             //address
	    
	      		driver.findElement(By.id("address1"));
	      		driver.findElement(By.id("city")).sendKeys("Ghaziabad");
	      		
	           	
	           	WebElement staticDropdown = driver.findElement(By.id("uniform-id_state"));
	      		Select dropdown = new Select (staticDropdown);
	      		dropdown.deselectByValue("Indiana");
	      		//zipcode : 
	      		driver.findElement(By.id("postcode")).sendKeys("12345");
	      		//Country 
	      		WebElement staticDropdown = driver.findElement(By.id("uniform-id_country"));
	      		Select dropdown = new Select (staticDropdown);
	      		dropdown.deselectByValue("United state");
	      		//Mobile number : 
	      		driver.findElement(By.id("phone_mobile")).sendKeys("0123456789");
	      		//Click on the register 
	      		driver.findElement(By.xpath("//*[@id="submitAccount"]/span").click();
	      		
	      		//Verify it will navigate to my account page 
	      		driver.get("http://automationpractice.com/index.php?controller=my-account");
	      		driver.getCurrentUrl();
	      		
	      		//Sign out 
	      		driver.findElement(By.className("logout")).click();
	      		
	      		//Sign in 
	      		driver.findElement(By.xpath("/a@id=login_form"));
	      		//enter email
	      		driver.findElement(By.xpath("\r\n'+'//*[@id=\'login_form\']/div/div[1]/label")).sendKeys("rewr@gmail.com");
	      				
	      			
	      		//Enter passsword:
	      		driver.findElement(By.xpath("//*[@id='passwd']")).sendKeys("test@123");
	      		//Click on Signin button 
	      		driver.findElement(By.id("SubmitLogin")).click();
	      		
	      	
	      		//Click on Women option to select the item 
	      		
	      		
      		driver.findElement(By.xpath("//*[@id=\'block_top_menu\']/ul/li[1]/a")).click();
      		
			
      		
      		//select Printed Dress 
      	driver.findElement(By.xpath("//*[@id=\'subcategories\']/ul/li[1]/div[1]/a/img"));
      		
      		driver.findElement(By.cssSelector("img[alt='Printed dress']"));
      		driver.findElement(By.xpath("//*[@id=\'center_column\']/ul/li[3]/div/div[2]/div[2]/a[1]/span").click();
      		driver.findElement(By.cssSelector("//*[@id=\'layer_cart\']/div[1]/div[2]"));
      		
      		driver.findElement(By.cssSelector("@title=Proceed to checkout")).click();
      		
      		driver.findElement(By.xpath("//*[@id='product_3_13_0_573673']/td[2]"));
      		
      		driver.findElement(By.cssSelector("@title=Log me out"));
      			      		
	      		
	      		
	      		}
}




	
	}


