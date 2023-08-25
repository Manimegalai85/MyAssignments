package marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Testcase1 {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.abhibus.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@id='pills-home-tab']")).click();
		
		
		
driver.findElement(By.xpath("//input[@id='source']")).sendKeys("Chennai");

driver.findElement(By.xpath("//li[text()='Chennai']")).click();

driver.findElement(By.xpath("//input[@id='destination']")).sendKeys("Bangalore");

driver.findElement(By.xpath("//li[text()='Bangalore']")).click();

driver.findElement(By.xpath("//input[@id='datepicker1']")).click();

driver.findElement(By.xpath("(//a[text()='26']/parent::td)[1]")).click();

driver.findElement(By.xpath("//a[text()='Search']")).click();

String text = driver.findElement(By.xpath("//h2[@class='TravelAgntNm ng-binding']")).getText();
System.out.println(text);

driver.findElement(By.xpath("//input[@id='Bustypes4']")).click();

String text2 = driver.findElement(By.xpath("(//p[text()='14 Seats Available'])[1]")).getText();

System.out.println(text2);

driver.findElement(By.xpath("(//a[@class='btn-seatselect book1'])[1]")).click();

driver.findElement(By.xpath("//a[@id='UO4-1ZZ']")).click();

String text3 = driver.findElement(By.xpath("//span[@id='seatnos']")).getText();

System.out.println(text3);

String text4 = driver.findElement(By.xpath("//span[@id='ticketfare']")).getText();

System.out.println(text4);

Thread.sleep(5000);


WebElement drop1 = driver.findElement(By.xpath("//select[@id='boardingpoint_id']"));

Select tool = new Select(drop1);

tool.selectByVisibleText("Shollinganallaur-21:01");



WebElement drop2 = driver.findElement(By.xpath("//select[@id='droppingpoint_id']"));

Select tool1 = new Select(drop2);

tool1.selectByVisibleText("Marathahalli Multiplex-05:22");

String title = driver.getTitle();

System.out.println(title);

driver.close();

		
		
		

	}

}
