import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class gmail_register {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://gmail.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement createAccount = driver.findElement(By.xpath("(//span[normalize-space()='Create account'])[1]"));
		createAccount.click();
		WebElement mySelft = driver.findElement(By.xpath("(//span[normalize-space()='For myself'])[1]"));
		mySelft.click();
		
		WebElement firstName = driver.findElement(By.name("firstName"));
		firstName.sendKeys("abcd");
		
		WebElement lastName = driver.findElement(By.name("lastName"));
		lastName.sendKeys("efgh");
		
		WebElement username = driver.findElement(By.name("Username"));
		username.sendKeys("minnukittusuhas123");
		
		WebElement password = driver.findElement(By.name("Passwd"));
		password.sendKeys("zxcasd@123");
		
		WebElement confirmPassword = driver.findElement(By.name("ConfirmPasswd"));
		confirmPassword.sendKeys("zxcasd@123");
		
		WebElement nxtButton = driver.findElement(By.xpath("(//span[normalize-space()='Next'])[1]"));
		nxtButton.click();
		
		Thread.sleep(3000);
		WebElement phoneNumber = driver.findElement(By.xpath("(//input[@id='phoneNumberId'])[1]"));
		phoneNumber.sendKeys("9876534538");

		WebElement nxtButton2 = driver.findElement(By.xpath("(//span[normalize-space()='Next'])[1]"));
		nxtButton2.click();
		
		
	}


	

}
