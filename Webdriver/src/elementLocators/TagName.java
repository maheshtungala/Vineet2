package elementLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();

		//open the google homepage..
		driver.get("https://www.google.com");
		
		int linkCount = driver.findElements(By.tagName("a")).size();
		
		System.out.println("the number of links in google page are "
		                            +linkCount);
		
		driver.close();
	}

}
