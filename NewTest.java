package alphaz;
 
import java.util.concurrent.TimeUnit;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
 
public class NewTest {
  @Test
  public void f() throws InterruptedException {
              
                
	// NOTE: Substitute your own saved location of the geckodriver.exe as you saved previously for the name here below
	System.setProperty("webdriver.gecko.driver","/media/jd/storage/linux/tools/drivers/geckodriver");
              
  	WebDriver driver = new FirefoxDriver();
              
  	driver.get("http://www.google.com");
              
  	System.out.println("Application title is ============= "+driver.getTitle());
                                            
  	WebElement element1 = driver.findElement(By.xpath(".//*[@id='lst-ib']"));
                                            
  	element1.click();
                                            
  	//driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
                                            
  	WebElement element2 = driver.findElement(By.partialLinkText("About"));
              
  	element2.click();
  	
  	Thread.sleep(3000);
                                            
  	driver.quit();
              
  }
  @Test
  public void f2() throws InterruptedException {
              
	  // NOTE: Substitute your own saved location of the geckodriver.exe as you saved previously for the name here below
      System.setProperty("webdriver.gecko.driver","/media/jd/storage/linux/tools/drivers/geckodriver");
              
      WebDriver driver = new FirefoxDriver();
              
      driver.get("http://www.arduino.cc");
              
      System.out.println("Application title is ============= "+driver.getTitle());
                                            
      WebElement element1 = driver.findElement(By.xpath(".//*[@id='navWrapper']/nav/section/ul[1]/li[3]/a"));
                                            
      element1.click();
                                            
      //driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
                                            
      WebElement element2 = driver.findElement(By.partialLinkText("Support"));
              
      element2.click();
      
      Thread.sleep(10000);
                                            
      driver.quit();
              
  }
}
 
