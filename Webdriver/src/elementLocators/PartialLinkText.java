package elementLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkText {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        
        //click the gmail link
        driver.findElement(By.partialLinkText("ma")).click();
        
        //print the current url
        System.out.println(driver.getCurrentUrl());

	}

}
