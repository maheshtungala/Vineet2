package inputoutput;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.*;
public class Screenshot {
public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
	File obj = ((TakesScreenshot)driver).
				getScreenshotAs(OutputType.FILE);
	
	FileUtils.copyFile(obj, new File("E:\\mahesh.jpg"));

	 driver.close();
	}

}
