package week5day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MergeContact {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.xpath("//div[@id='label']")).click();
		
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		
		driver.findElement(By.xpath("(//input[@id='partyIdFrom']/following::a)[1]")).click();
		
		Set<String> windowHandles1 = driver.getWindowHandles();
		
		List<String> lstWindow1 = new ArrayList<String>(windowHandles1);
	
		driver.switchTo().window(lstWindow1.get(1));
		
		//verify
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)[1]")).click();
	
		driver.switchTo().window(lstWindow1.get(0));
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("(//input[@id='partyIdTo']/following::a)[1]")).click();
		
Set<String> windowHandles2 = driver.getWindowHandles();
		
		List<String> lstWindow2 = new ArrayList<String>(windowHandles2);
	
		driver.switchTo().window(lstWindow2.get(1));
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[2]")).click();
		
		driver.switchTo().window(lstWindow2.get(0));
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		
		driver.switchTo().alert().accept();
		//verify
		System.out.println(driver.getTitle());
	}

}
