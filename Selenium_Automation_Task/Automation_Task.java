package Selenium_Automation_Task;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Automation_Task {
   public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.myntra.com/wishlist");
	driver.manage().window().maximize();
	
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(40));
	
	WebElement Login_btn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'LOGIN')]")));
	Login_btn.click();
	
	WebElement Mob_number = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='tel']")));
	Mob_number.sendKeys("9439915837");
	
	WebElement terms_conditon_box = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='checkbox']")));
	terms_conditon_box.click();
	
	WebElement continue_btn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'CONTINUE')]")));
	continue_btn.click();
	
	try {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("sec-if-cpt-container")));
	    
	} catch (Exception e) {
		System.out.println("Popup Exception not handled");
	}
    
	//Again click on continue button to continue
    continue_btn.click();
	
    //Verify OTP will be done manually
    System.out.println("Please enter the OTP Manually");
    

    //retriving all products in the wishlist 
    List<WebElement> product_List = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//ul[@class='index-wishListContainer']//div[@class='itemcard-itemImageDiv ']")));
    int size = product_List.size();
    
    for(int i = 0;i < size;i++) {
    
    	//again fetching the product list to avoid staleElementException
    	product_List = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(
    	        By.xpath("//ul[@class='index-wishListContainer']//div[@class='itemcard-itemImageDiv']")));
    	
    	//Select on the product and click;
    	WebElement product =  product_List.get(0);//first product
    	product.click();
    	
    }
    
    //Click on profile to Logout
    WebElement profile = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Profile')]")));
    profile.click();
   
    //wait for Logout option and then click on it to Log out
    WebElement logout = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),' Logout ')]")));
    logout.click();
    
	driver.quit();
}
}
