package elementLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Name {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		//enter the email into the username field
		
		driver.findElement(By.name("email")).sendKeys("maheshtungala");

	}

}
