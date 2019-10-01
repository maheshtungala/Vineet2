package css;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class Example {
public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///E:/Mahesh/Html/cssform.html");
		
		driver.findElement(By.cssSelector("input.required")).sendKeys("hello");
		driver.findElement(By.cssSelector("input[class=passfield]")).sendKeys("hello");
		driver.findElement(By.cssSelector("input:nth-child(3)")).click();

	}

}
