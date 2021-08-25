package week3.assihnment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ajio {
	public static void main(String[] args) throws InterruptedException {        
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ramya\\eclipse-workspace\\SeleniuAmAug\\Driver\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com/"); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.name("searchVal")).sendKeys("bags", Keys.ENTER);
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		Thread.sleep(2000);
		String totItems = driver.findElement(By.className("length")).getText();
		System.out.println("Total items : " + totItems);
		        
		System.out.println(" List of Brands");
		List<WebElement> BrandList = driver.findElements(By.className("brand"));
		System.out.println(" Size :" + BrandList.size());
		for (WebElement webEle : BrandList) {
		String ra = webEle.getText();
		System.out.println(ra);
		}
		List<WebElement> bagName = driver.findElements(By.className("name"));
		System.out.println(" Size of Bag is  :" + bagName.size());
		System.out.println(" Names of the Bags");
		for (WebElement webElement : bagName) {
		String bbList = webElement.getText();
		System.out.println(bbList);
		}}}
		
	
		

