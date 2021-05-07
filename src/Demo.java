import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.out.println("Hello");

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RANJIT KUMAR\\Downloads\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.navigate().to("http://www.google.com/");
		Thread.sleep(6000);

		driver.close();

	}

}
