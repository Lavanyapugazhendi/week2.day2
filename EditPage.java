package week2.day2;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditPage {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Edit.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id = 'email']")).sendKeys("lavanyapugazhendi24@gmail.com");
		driver.findElement(By.xpath("//div[@id='contentblock']/section/div[2]/div/div/input")).sendKeys("Append");
		WebElement defaultText = driver.findElement(By.xpath("//div[@id='contentblock']/section/div[3]/div/div/input"));
		String getValue = defaultText.getAttribute("TestLeaf");
		driver.findElement(By.xpath("//div[@id='contentblock']/section/div[4]/div/div/input")).clear();
		 boolean Disabled = driver.findElement(By.xpath("//div[@id='contentblock']/section/div[5]/div/div/input")).isEnabled();
			
	}
	
		
	}

	
