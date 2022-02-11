package week3.day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {

		
	public static void main(String[] args) throws InterruptedException 
	{
	WebDriverManager.chromedriver().setup();
	//System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.ajio.com/");
	driver.manage().window().maximize();
	WebElement a=driver.findElement(By.xpath("//input[@name='searchVal']"));
	a.sendKeys("bags");
	a.sendKeys(Keys.ENTER);
	driver.findElement(By.xpath("//label[contains(text(),'Men')]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//label[contains(text(),'Fashion Bags')]")).click();
	Thread.sleep(2000);
	WebElement b=driver.findElement(By.className("length"));
	String count= b.getText();
	System.out.println(count);
	List<WebElement> bagBrandList = driver.findElements(By.className("brand"));
	System.out.println(" Size :" + bagBrandList.size());

	for (WebElement webElement : bagBrandList) {
		String text = webElement.getText();
		System.out.println(text);
	}
	// Get the list of names of the bags and print it
	List<WebElement> bagNameList = driver.findElements(By.className("nameCls"));
	System.out.println(" Size :" + bagNameList.size());
	System.out.println(" Names of the Bags");
	for (WebElement webElement : bagNameList) {
		String text = webElement.getText();
		System.out.println(text);
	}
	//to get the Price of each item
	List<WebElement> price= driver.findElements(By.xpath("//span[contains(@class,'price')]"));
	System.out.println(" Price of the Bags");
		for(WebElement web:price)
		{
			 String  pr = web.getText();
			 System.out.println("Price is" + pr);
		
	}
	}
}
