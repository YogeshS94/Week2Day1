package Week2Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Lead {
	public static void main(String[] arg) {
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TeaShop");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Aadhiya");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Kia");
		
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Verna");
		
		driver.findElement(By.name("departmentName")).sendKeys("SmartD");
		
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Creating Lead Form");
		
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("Aadhiya12@gmail.com");
		
		WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		
		Select dd = new Select(state);
		
		dd.selectByVisibleText("New York");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		driver.close();
		
		
		
	}
}
