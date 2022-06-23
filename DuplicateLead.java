package week2.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		WebElement userNameelement = driver.findElement(By.id("username"));
		userNameelement.sendKeys("Demosalesmanager");
		
		WebElement passwordElement = driver.findElement(By.id("password"));
		passwordElement.sendKeys("crmsfa");
		
		WebElement LoginElement = driver.findElement(By.className("decorativeSubmit"));
		LoginElement.click();
		
		WebElement CrmsfaElement = driver.findElement(By.linkText("CRM/SFA"));
		CrmsfaElement.click();
		
		WebElement leadsElement = driver.findElement(By.linkText("Leads"));
		leadsElement.click();
		
		WebElement createleadElement = driver.findElement(By.linkText("Create Lead"));
		createleadElement.click();
		
		WebElement companyNameElement = driver.findElement(By.id("createLeadForm_companyName"));
		companyNameElement.sendKeys("TCS");
		
        WebElement firstNameElement = driver.findElement(By.id("createLeadForm_firstName"));
        firstNameElement.sendKeys("Indhu");
        
        WebElement lastNameElement = driver.findElement(By.id("createLeadForm_lastName"));
        lastNameElement.sendKeys("Kamal");
        
        WebElement firstNameLocalElement = driver.findElement(By.id("createLeadForm_firstNameLocal"));
        firstNameLocalElement.sendKeys("k");
        
        WebElement departmentElement = driver.findElement(By.id("createLeadForm_departmentName"));
        departmentElement.sendKeys("Automation Testing");
        
        WebElement descriptionElement = driver.findElement(By.id("createLeadForm_description"));
        descriptionElement.sendKeys("SmartEmployee");
        
        WebElement emailElement = driver.findElement(By.id("createLeadForm_primaryEmail"));
        emailElement.sendKeys("tskindhu@gmial.com");
        
        WebElement provinceElement = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
        Select dd = new Select(provinceElement);
        dd.selectByVisibleText("New York");
        
        WebElement submitElement = driver.findElement(By.name("submitButton"));
        submitElement.click();
        System.out.println("The title is :" + driver.getTitle());
        
        WebElement duplicateLeadElement = driver.findElement(By.linkText("Duplicate Lead"));
        duplicateLeadElement.click();
        
        WebElement companynameElement = driver.findElement(By.id("createLeadForm_companyName"));
        companynameElement.clear();
        
        WebElement CoNameElement = driver.findElement(By.id("createLeadForm_companyName"));
        CoNameElement.sendKeys("Google");
        
        WebElement firstElement = driver.findElement(By.id("createLeadForm_firstName"));
        firstElement.clear();
        
        
        WebElement firstnamElement = driver.findElement(By.id("createLeadForm_firstName"));
        firstnamElement.sendKeys("Indhu");
        
        WebElement createLeElement = driver.findElement(By.name("submitButton"));
        createLeElement.click();
        
        System.out.println("The title is " + driver.getTitle());
	}

}
