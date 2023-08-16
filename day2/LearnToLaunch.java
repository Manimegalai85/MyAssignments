package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnToLaunch {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();

		// load URL
		driver.get("http://leaftaps.com/opentaps/control/logout");

		// maximize the window
		driver.manage().window().maximize();

		// find Element and enter the username
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");

		// find the element and enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//find the element and click the login button
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//get the title of the page
		String title = driver.getTitle();
	//print the title
		System.out.println(title);
		
		//find the element and click CRM/SFA
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//click lead
		driver.findElement(By.linkText("Leads")).click();
		
		//click create lead
		driver.findElement(By.linkText("Create Lead")).click();
		
		//enter company name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		
		//enter first name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Manimegalai");
		
		//enter last name
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Chandrasekar");
		
		//click create lead
		
		driver.findElement(By.name("submitButton")).click();
		
		
		//verify the text
		
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		
		System.out.println(text);
		
		
		
		
		
		
		
		
		

	}

}
