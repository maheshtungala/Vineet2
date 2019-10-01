package basics;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import myPack.Vineet;
public class FirstProgram {

	public static void main(String[] args) throws InterruptedException {
		//ChromeDriver driver = new ChromeDriver();

		/*WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.close();*/
		//Vineet.verifyLogin();
		//Vineet.addEmp();
		Vineet.editEmp();
		Vineet.deleteEmp();
		
	}

}
