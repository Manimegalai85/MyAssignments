package marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase2 {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Bags");
		
		driver.findElement(By.xpath("//span[text()=' for boys']")).click();
		
		String span = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']")).getText();
		System.out.println(span);
		
		driver.findElement(By.xpath("//li[@id='p_89/Skybags']//a")).click();
		
		driver.findElement(By.xpath("//li[@id='p_89/American Tourister']//a")).click();
		
		driver.findElement(By.xpath("//span[@id='a-autoid-0-announce']")).click();
		
		driver.findElement(By.xpath("//a[@id='s-result-sort-select_4']")).click();
		
		String text1 = driver.findElement(By.xpath("//a[@class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal']/span")).getText();
		
		System.out.println(text1);
		
		String text2 = driver.findElement(By.xpath("(//div[@style='display: inline-block'])[1]")).getText();
		
		System.out.println(text2);
		
		String text3 = driver.findElement(By.xpath("(//a[contains(@class,'a-size-base a-link-normal s-no-hover')]/span)[2]")).getText();
		
		System.out.println("Discounted Price: "+text3);
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		driver.close();
		
		
		
		
		
		
		
		
		
	}

}
