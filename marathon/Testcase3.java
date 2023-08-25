package marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Testcase3 {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.pvrcinemas.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//div[@class='nav-icon']")).click();
	
		driver.findElement(By.xpath("//a[text()='Movie Library']")).click();
		
		
		
		WebElement drop1 = driver.findElement(By.xpath("//select[@name='city']"));
		
		
		Select tool1 = new Select(drop1);
		
		tool1.selectByVisibleText("Chennai");
		
		Thread.sleep(6000);
		WebElement drop2 = driver.findElement(By.xpath("//select[@name='genre']"));
		
		Select tool2 = new Select(drop2);
		
		tool2.selectByVisibleText("ANIMATION");
		
		WebElement drop3 = driver.findElement(By.xpath("//select[@name='lang']"));
		
		Select tool3 = new Select(drop3);
		
		tool3.selectByVisibleText("ENGLISH");
		
		driver.findElement(By.xpath("//button[@class='btn btn-submit btn-primary']")).click();
		
		Thread.sleep(8000);
		
		driver.findElement(By.xpath("(//div[text()='Paw Patrol'])[1]")).click();
		
		Thread.sleep(8000);
		
		driver.findElement(By.xpath("//button[text()='Proceed To Book']")).click();
		
		
		
		WebElement element1 = driver.findElement(By.xpath("//select[@id='cinemaName']"));
		
		Select cine = new Select(element1);
		
		cine.selectByVisibleText("PVR Heritage RSL ECR Chennai");
		
		WebElement element2 = driver.findElement(By.xpath("//select[@name='timings']"));
		
		Select time = new Select(element2);
		time.selectByVisibleText("12:00 PM - 03:00 PM");
		
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Megala");
		
		driver.findElement(By.xpath("//input[@name='mobile']")).sendKeys("8056163885");
		
		driver.findElement(By.xpath("//input[@name='noOfTickets']")).sendKeys("2");
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("megalasekar20@gmail.com");
		
		WebElement element3 = driver.findElement(By.xpath("//select[@name='food']"));
		
		Select food = new Select(element3);
		
		food.selectByVisibleText("Yes");
		
		driver.findElement(By.xpath("//input[@name='comment']")).sendKeys("None");
		
		driver.findElement(By.xpath("//button[text()='SEND REQUEST']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//button[text()='CANCEL'])[2]")).click();
		
		driver.findElement(By.xpath("//button[@class='swal2-close']")).click();
		String title = driver.getTitle();
		
		
	System.out.println(title);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
