       package variousConcepts;

       import java.util.Set;
       import java.util.concurrent.TimeUnit;
       import org.junit.Before;
       import org.junit.Test;
       import org.openqa.selenium.By;
       import org.openqa.selenium.WebDriver;
       import org.openqa.selenium.chrome.ChromeDriver;

        public class LearningWindowHandle {
	    WebDriver driver;

	    @Before
	     public void init() {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://www.yahoo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    }

	    @Test
	    public void windowhandleTest() throws InterruptedException {
	    driver.findElement(By.id("ybar-sbq")).sendKeys("xpath");
	    driver.findElement(By.id("ybar-search")).click();
	    Thread.sleep(3000);
	    System.out.println(driver.getTitle());
	    
	    driver.findElement(By.xpath("//*[@id=\"web\"]/o1/li[1]/div/div[1]/h3/a")).click();
	    System.out.println(driver.getTitle());
	    Set<String>handle3 = driver.getWindowHandles();
	    for(String i:handle3) {
	    	
	    }
	   }

}
