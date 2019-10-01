package elementLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		//enter selenium into the searchbox
		driver.findElement(By.className("gLFyf")).sendKeys("selenium");
		

	}

}
