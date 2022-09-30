import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestChrome {

	
	@Test
	public void test1(){

		System.setProperty("webdriver.chrome.driver",
				"d:\\Profiles\\gzoughlemi\\Desktop\\Sesame\\3ing\\QualitéTest\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();

		// id, name, classname ,
		WebElement inputemail = driver.findElement(By.cssSelector("input[type*='tex']"));

		inputemail.sendKeys("Ghaith");

	}

}
