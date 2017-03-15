package alphaz;
 
import java.util.concurrent.TimeUnit;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
 
public class NewTest {
  @Test
  public void f() {
              
                
                       // NOTE: Substitute your own saved location of the geckodriver.exe as you saved previously for the name here below
                                             System.setProperty("webdriver.gecko.driver","C:\\Test\\drivers\\geckodriver-v0.13.0-win64\\geckodriver.exe");
              
                                             WebDriver driver = new FirefoxDriver();
              
                                             driver.get("http://www.google.com");
              
                                             System.out.println("Application title is ============= "+driver.getTitle());
                                            
                                             WebElement element1 = driver.findElement(By.xpath(".//*[@id='lst-ib']"));
                                            
                                             element1.click();
                                            
                                             //driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
                                            
                                             WebElement element2 = driver.findElement(By.partialLinkText("About"));
              
                                             element2.click();
                                            
                                             driver.quit();
              
                   }
  @Test
  public void f2() {
              
                
                       // NOTE: Substitute your own saved location of the geckodriver.exe as you saved previously for the name here below
                                             System.setProperty("webdriver.gecko.driver","C:\\Test\\drivers\\geckodriver-v0.13.0-win64\\geckodriver.exe");
              
                                             WebDriver driver = new FirefoxDriver();
              
                                             driver.get("http://www.arduino.cc");
              
                                             System.out.println("Application title is ============= "+driver.getTitle());
                                            
                                             WebElement element1 = driver.findElement(By.xpath(".//*[@id='navWrapper']/nav/section/ul[1]/li[3]/a"));
                                            
                                             element1.click();
                                            
                                             //driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
                                            
                                             WebElement element2 = driver.findElement(By.partialLinkText("Support"));
              
                                             element2.click();
                                            
                                             driver.quit();
              
                   }
}
 
 