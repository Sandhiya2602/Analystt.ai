package actiTIME;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://online.actitime.com/ss1/timetrack/enter.do");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Login
		driver.findElement(By.name("username")).sendKeys("2331sandhiya@gmail.com");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("container_users")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[text()='New User']")).click();
		Thread.sleep(4000);
		
		//Create_user1
		driver.findElement(By.xpath("//input[@id='createUserPanel_firstNameField']")).click();
		driver.findElement(By.xpath("//input[@id='createUserPanel_firstNameField']")).sendKeys("SANDHIYA");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='createUserPanel_lastNameField']")).click();
		driver.findElement(By.xpath("//input[@id='createUserPanel_lastNameField']")).sendKeys("S");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='createUserPanel_emailField']")).click();
		driver.findElement(By.xpath("//input[@id='createUserPanel_emailField']")).sendKeys("sandhiyas2621@gmail.com");
		driver.findElement(By.xpath("//div[text()='-- department not assigned --']")).click();
		driver.findElement(By.xpath("//div[@class='item' and contains(text(),'Quality Control')]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@class='components_switcher small off animated']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[text()='Save & Send Invitation']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[text()='Invite one more user']")).click();
		Thread.sleep(6000);
		
		//Create_user2
		driver.findElement(By.xpath("//input[@id='createUserPanel_firstNameField']")).click();
		driver.findElement(By.xpath("//input[@id='createUserPanel_firstNameField']")).sendKeys("DHIYA");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='createUserPanel_lastNameField']")).click();
		driver.findElement(By.xpath("//input[@id='createUserPanel_lastNameField']")).sendKeys("S");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='createUserPanel_emailField']")).click();
		driver.findElement(By.xpath("//input[@id='createUserPanel_emailField']")).sendKeys("sandhiyasivasamy26@gmail.com");
		driver.findElement(By.xpath("//div[text()='-- department not assigned --']")).click();
		driver.findElement(By.xpath("//div[@class='item' and contains(text(),'Production')]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[text()='Save & Send Invitation']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='createUserPanel_accountCreatedContainer']//span[contains(text(),'Close')]")).click();
		
		//Department
		driver.findElement(By.xpath("//div[@class='userList_manageButtons_component_groupItem department ' and text()='  Departments']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='groupManagementLightBox_newGroupInput']")).click();
		driver.findElement(By.xpath("//input[@id='groupManagementLightBox_newGroupInput']")).sendKeys("Technical support1");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[text()='Add']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@id='groupManagementLightBox_closeLightbox']")).click();
		Thread.sleep(4000); 
		
		//Reports
		driver.findElement(By.xpath("//div[text()='Reports']")).click();
		driver.findElement(By.xpath("//div[text()='Create Chart']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@class='addToDashboardIcon chart']")).click();
		driver.findElement(By.xpath("//input[@class='reportNameEdit inputFieldWithPlaceholder']")).sendKeys("Worktime");
		driver.findElement(By.xpath("//div[@class='saveNewConfigButton']")).click();
		driver.findElement(By.xpath("//div[@id='closeCreateChartLightboxButton']")).click();
		
		//Logout
		driver.findElement(By.xpath("//td[@class='logoutCell preventPanelsHiding']//a[@id='logoutLink']")).click();
		driver.quit();
			
	}
}
