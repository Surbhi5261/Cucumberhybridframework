package TestNG;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.json.Json;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class New {

    WebDriver driver;


    @Test(priority = 1)
    public void testLoginAndNavigate() throws InterruptedException {
        // Navigate to the website
    	WebDriver driver= new ChromeDriver();
    	driver.manage().window().maximize();
       driver.get("https://staging.aiqod.com:843//");
        Thread.sleep(2000);

        // Login
        driver.findElement(By.name("txtMobile")).sendKeys("0558908908");
        driver.findElement(By.name("txtPassword")).sendKeys("Tcs@gibots11!");
        driver.findElement(By.className("signin-btn")).click();
        Thread.sleep(2000);

        // Scroll down
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,600)");

        // Click on elements
        driver.findElement(By.xpath("//*[@id=\"cart-admin\"]/app-tile/div/div/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/app-root/ui-view/app-root/ui-view/app-web-main-layout/ui-view/app-main-admin/ui-view/app-admin-selection/div/div[2]/div[1]/app-tile/div/div/a")).click();
        Thread.sleep(2000);

        // Search and perform actions
        driver.findElement(By.xpath("//*[@id=\"searchElement\"]")).sendKeys("Surbhi");
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/app-root/ui-view/app-root/ui-view/app-web-main-layout/ui-view/app-main-admin/ui-view/app-admin-container/div/div[3]/app-admin-view/div/div/div/div/div[3]/p[2]/a/i")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/modal-container/div/div/app-confirm-modal/div/div/button[1]")).click();
        Thread.sleep(2000);
    }
    @Test(priority = 2)
    public void signUpAndMerge() throws InterruptedException {
        // Switch to a new tab
    	WebDriver driver= new ChromeDriver();
        driver.switchTo().newWindow(WindowType.TAB);
        Thread.sleep(2000);

        // Navigate to the website
        driver.get("https://staging.aiqod.com:843//");
        Thread.sleep(5000);

        // Click on sign up button
        driver.findElement(By.xpath("//button[normalize-space()='Sign up']")).click();
        Thread.sleep(2000);

        // Fill in sign up form
        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Surbhi Raghuwanshi");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='Mobile (Login Id)']")).sendKeys("8358026474");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='Email ID']")).sendKeys("surbhiraghuwanshi13@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Surbhi@123");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='Confirm Password']")).sendKeys("Surbhi@123");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='trmcond']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='col-sm-4 col-md-4 col-lg-4 hero-text']//button[@class='upSignUp'][normalize-space()='SEND OTP']")).click();
        Thread.sleep(60000);
    }

    @Test(priority = 3)
    public void signIn() throws InterruptedException {
    
        // Switch to a new tab
    	WebDriver driver= new ChromeDriver();
    	 driver.switchTo().newWindow(WindowType.TAB);
        Thread.sleep(2000);
        // Navigate to the website
        driver.get("https://staging.aiqod.com:843//");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        // Login
        driver.findElement(By.name("txtMobile")).sendKeys("8358026474");
		driver.findElement(By.name("txtPassword")).sendKeys("Surbhi@123");
		driver.findElement(By.className("signin-btn")).click();
		Thread.sleep(2000);
		
		//jse.executeScript("window.scrollBy(0,500)");
		
		
		driver.findElement(By.xpath("/html/body/app-root/ui-view/app-root/ui-view/app-web-main-layout/ui-view/app-org/ui-view/app-add-org/div/div[2]/div[2]/div/div/div[1]/div[1]/accordion/accordion-group/div/div[2]/div/div[1]/div/div[1]/app-input-box/div/div/input")).sendKeys("Surbhi pvt ltd");					
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"forScroll\"]/accordion/accordion-group/div/div[2]/div/div[2]/app-dropdown-select/div/div/div/button/span[2]/span")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"forScroll\"]/accordion/accordion-group/div/div[2]/div/div[2]/app-dropdown-select/div/div/div/div/div/input")).sendKeys("Maharashtra");
			Thread.sleep(2000);
		
			
			driver.findElement(By.xpath("//*[@id=\"forScroll\"]/accordion/accordion-group/div/div[2]/div/div[2]/app-dropdown-select/div/div/div/div/ul/li[9]/a/span[1]")).click();
		
		
		//driver.findElement(By.xpath("//li[@id='11']//a[contains(text(),'Setup Wizard')]")).click();
//		Thread.sleep(2000);
//		
		driver.findElement(By.xpath("//button[normalize-space()='Update and Next']")).click();
		Thread.sleep(2000);
		
//		driver.findElement(By.xpath("//i[@class='icon fa fa-plus']")).click();
//		Thread.sleep(5000);
		         
		
		driver.findElement(By.xpath("//input[starts-with(@placeholder,'Enter Role Name *')]")).sendKeys("super");
		
		Thread.sleep(2000);
	
		
		driver.findElement(By.xpath("//*[@id=\"box\"]/table/tbody/tr/td[3]/input")).sendKeys("3");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//tbody/tr[@class='ng-star-inserted']/td[4]/app-multidropdown-select[1]/div[1]/i[1]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//tbody/tr[@class='ng-star-inserted']/td[5]/app-multidropdown-select[1]/div[1]/i[1]")).click();
		Thread.sleep(2000);

		
		//JavascriptExecutor jse=(JavascriptExecutor) driver;
		//jse.executeScript("window.scrollBy(0,200)");
		
		
		driver.findElement(By.xpath("//button[normalize-space()='Update and Next']")).click();
		Thread.sleep(2000);
		
		//HANDBOOK_HANDLING
		driver.findElement(By.xpath("//*[@id=\"step-6\"]/div/div/div/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"step-6\"]/div/div/div/button")).click();
		Thread.sleep(2000);
		
		//jse.executeScript("window.scrollBy(0,200)");
		
//		driver.findElement(By.xpath("//i[@class='icon fa fa-plus']")).click();
//		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@placeholder='Enter email']")).sendKeys("automationtest647@gmail.com");
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//button[@title='Select Department*']")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//*[@id=\"box\"]/table/tbody/tr/td[3]/app-dropdown-select/div/div/div/div/input")).sendKeys("IT");
		Thread.sleep(4000);
		
	driver.findElement(By.xpath("//*[@id=\"box\"]/table/tbody/tr/td[3]/app-dropdown-select/div/div/div/ul/li/button")).click();
	Thread.sleep(4000);
		
		
		driver.findElement(By.xpath("//button[@title='Select Roles*']")).click();
		Thread.sleep(4000);
		
	driver.findElement(By.xpath("//*[@id=\"box\"]/table/tbody/tr/td[4]/app-dropdown-select/div/div/div/div/input")).sendKeys("super");
	Thread.sleep(4000);
	
		
		driver.findElement(By.xpath("/html/body/app-root/ui-view/app-root/ui-view/app-web-main-layout/ui-view/app-org/ui-view/app-add-org/div/div[2]/div[2]/div/div/app-view-contact-table/div/table/tbody/tr/td[4]/app-dropdown-select/div/div/div/ul/li/a/span[1]")).click();
		Thread.sleep(4000);
		
		
		driver.findElement(By.xpath("//*[@id=\"box\"]/table/tbody/tr/td[5]/app-dropdown-select/div/div/button/span[2]/span")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//*[@id=\"box\"]/table/tbody/tr/td[5]/app-dropdown-select/div/div/div/div/input")).sendKeys("surbhi");
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//*[@id=\"box\"]/table/tbody/tr/td[5]/app-dropdown-select/div/div/div/ul/li/a/span[1]")).click();
		Thread.sleep(2000);
		
	
	driver.findElement(By.xpath("//*[@id=\"box\"]/table/tbody/tr/td[6]/app-multidropdown-select/div/i")).click();
		Thread.sleep(6000);
	
		
		driver.findElement(By.xpath("/html/body/app-root/ui-view/app-root/ui-view/app-web-main-layout/ui-view/app-org/ui-view/app-add-org/div/div[2]/div[2]/div/div/app-view-contact-table/div/table/tbody/tr/td[1]/a[1]/i")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//*[@id=\"box\"]/div[2]/button")).click();
		Thread.sleep(5000);
		
		
    }
     @Test(priority = 4)
    public void gmailSignUp() throws InterruptedException {
        // Switch to a new tab
    	 WebDriver driver= new ChromeDriver();
        driver.switchTo().newWindow(WindowType.TAB);
        Thread.sleep(2000);

        // Navigate to Gmail
        driver.get("https://www.gmail.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        // Enter email and click Next
        WebElement emailInput = driver.findElement(By.id("identifierId"));
        emailInput.sendKeys("automationtest647@gmail.com");
        Thread.sleep(6000);
        WebElement nextButton = driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span"));
        nextButton.click();
        Thread.sleep(9000);

        // Enter password and click Next
        WebElement passwordInput = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/c-wiz/div/div[2]/div/div/div/form/span/section[2]/div/div/div[1]/div[1]/div/div/div/div/div[1]/div/div[1]/input"));
        Thread.sleep(2000);
        passwordInput.sendKeys("Atul.b@123");
        Thread.sleep(9000);
        WebElement passwordNextButton = driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button/span"));
        passwordNextButton.click();
        Thread.sleep(10000);

        // Click on emails and perform actions
        driver.findElement(By.xpath("/html/body/div[7]/div[3]/div/div[2]/div[2]/div/div/div/div[1]/div/div[1]/div[1]/div/div/div[5]/div/div")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div[7]/div[3]/div/div[2]/div[2]/div/div/div/div[1]/div/div[1]/div[1]/div/div/div[5]/div/div")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div[7]/div[3]/div/div[2]/div[2]/div/div/div/div[2]/div/div[1]/div/div/div[8]/div/div[1]/div[2]/div/table/tbody/tr[1]")).click();
        Thread.sleep(9000);

        // Click Here link
        driver.findElement(By.linkText("Click Here")).click();
        Thread.sleep(2000);

        // Switch to the new window
        Set<String> windowHandles = driver.getWindowHandles();
        for (String windowHandle : windowHandles) {
            if (!windowHandle.equals(driver.getWindowHandle())) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }

        Thread.sleep(10000);
    
    		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Atul Bankar");
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//input[@placeholder='Mobile (Login Id)']")).sendKeys("9604258894");
			Thread.sleep(2000);
			
//			driver.findElement(By.xpath("//input[@placeholder='Email ID']")).sendKeys("atul.b@aiqod.com");
//			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Atul.b@123");
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//input[@placeholder='Confirm Password']")).sendKeys("Atul.b@123");
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//input[@name='trmcond']")).click();
			Thread.sleep(2000);
			
			
			driver.findElement(By.xpath("//div[@class='col-sm-4 col-md-4 col-lg-4 hero-text']//button[@class='upSignUp'][normalize-space()='SEND OTP']")).click();
			Thread.sleep(30000);
     }
     
     public void SignIn() throws InterruptedException {
         // Switch to a new tab
     	 WebDriver driver= new ChromeDriver();
         driver.switchTo().newWindow(WindowType.TAB);
     
     driver.findElement(By.name("txtMobile")).sendKeys("8358026474");
		driver.findElement(By.name("txtPassword")).sendKeys("Surbhi@123");
		driver.findElement(By.className("signin-btn")).click();
		Thread.sleep(2000);
		
		
	
			
			driver.findElement(By.xpath("//*[@id=\"fav-process-1\"]/div/a")).click();
			Thread.sleep(2000);
			
			//TASK
			driver.findElement(By.xpath("//input[@name='Task']")).sendKeys("New selenium task-01");
			Thread.sleep(2000);
			
			//DEPT
			driver.findElement(By.xpath("//button[@data-id='drpVal-Department']")).click();
			Thread.sleep(2000);
			
			
			
			driver.findElement(By.xpath("/html/body/modal-container/div/div/app-dynamic-form-builder/div/div/div[2]/div/div/app-additional-info/div/form/div[1]/div[2]/div/app-dropdown-select/div/div/div/div/input")).sendKeys("IT");
			
			Thread.sleep(3000);
			driver.findElement(By.xpath("//span[@class='text'][normalize-space()='IT']")).click();
			Thread.sleep(2000);
//				List<WebElement>dynamicList=driver.findElements(By.xpath("//div[@class='btn-group bootstrap-select custom-drop-down custom-picker-Department -Department show-menu-arrow ng-untouched ng-pristine ng-valid open']//li"));
//				
//				for(int i=0;i<dynamicList.size();i++)
//				{
//					String text=dynamicList.get(i).getText();
//					
//					System.out.println("Text is"+text);
//					if(text.contains("ÏT"))
//					{
//						
//						dynamicList.get(i).click();
//						break;
//						
//						
//					}
//					
//					
//					
//					
//					
//				}
//				
			//PROJECT	
			   // driver.findElement(By.xpath("//input[@name='Project']")).sendKeys("Project1");
				Thread.sleep(2000);
				
				//START_DATE
				 WebElement dateTimeInput=driver.findElement(By.cssSelector("input[name='Start Date']"));
				 dateTimeInput.clear();
//				 Actions actions = new Actions(driver);
//				 actions.sendKeys(dateTimeInput, "29032024");
//				 
//				 actions.perform();
				// Thread.sleep(5000);
				// dateTimeInput.sendKeys("28032024");
				 Thread.sleep(2000);
				 dateTimeInput.sendKeys("01042024");
				 Thread.sleep(5000);
				 dateTimeInput.sendKeys(Keys.TAB);
				// Thread.sleep(2000);
				 dateTimeInput.sendKeys("0731PM");
				 
				 
				 Thread.sleep(2000);
				 
				 
					
					//PROJECT	
					    driver.findElement(By.xpath("//input[@name='Project']")).sendKeys("new project-01");
						Thread.sleep(2000);
				 
				 
				 
				 
				 //PRIORITY
				 driver.findElement(By.xpath("//button[@title='Urgent']//span[@class='caret']")).click();
				Thread.sleep(2000);
//				driver.findElement(By.xpath("//button[@title='Urgent']//span[@class='caret']")).click();
//				Thread.sleep(2000);
				driver.findElement(By.xpath("/html/body/modal-container/div/div/app-dynamic-form-builder/div/div/div[2]/div/div/app-additional-info/div/form/div[1]/div[5]/div/app-dropdown-select/div/div/div/div/input")).sendKeys("Urgent");
			
				Thread.sleep(2000);
				driver.findElement(By.xpath("//li[@class='selected active']//a[@role='option']")).click();
				Thread.sleep(2000);
				
				
				
				//DUE_DATE
				WebElement dateTimeInput2=driver.findElement(By.xpath("//input[@name='Due Date']"));
//				 dateTimeInput2.clear();
//				 Actions actions2 = new Actions(driver);
//				 actions2.sendKeys(dateTimeInput2, "31032024");
//				 actions2.perform();
				 Thread.sleep(2000);
				 dateTimeInput2.sendKeys("03042024");
				 Thread.sleep(2000);
				 dateTimeInput2.sendKeys(Keys.TAB);
				 Thread.sleep(2000);
				 dateTimeInput2.sendKeys("0245PM");
				 
				 
				 //ASSIGN_TO
				Thread.sleep(2000);
				driver.findElement(By.xpath("//button[@data-id='drpVal-Assign_To']//span[@class='caret']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("/html/body/modal-container/div/div/app-dynamic-form-builder/div/div/div[2]/div/div/app-additional-info/div/form/div[1]/div[7]/div/app-dropdown-select/div/div/div/div/input")).sendKeys("Atul Bankar");
				Thread.sleep(3000);
				driver.findElement(By.xpath("/html/body/modal-container/div/div/app-dynamic-form-builder/div/div/div[2]/div/div/app-additional-info/div/form/div[1]/div[7]/div/app-dropdown-select/div/div/div/ul/li[2]/a/span[1]")).click();
				Thread.sleep(3000);
			
				
				
				//TASK_DESCRIPTION
				driver.findElement(By.xpath("//textarea[@placeholder='Add Description']")).sendKeys("this is project description");
					Thread.sleep(2000);
					
					//jse.executeScript("window.scrollBy(0,100)");
					Thread.sleep(2000);
					driver.findElement(By.xpath("//button[normalize-space()='Proceed']")).click();
					Thread.sleep(3000);
					
					
					driver.findElement(By.xpath("//*[@id=\"Home_id\"]")).click();
					Thread.sleep(3000);
					
					
					driver.findElement(By.xpath("//*[@id=\"fav-process-1\"]/div/a")).click();
					Thread.sleep(4000);
					
					//TASK
					driver.findElement(By.xpath("//input[@name='Task']")).sendKeys("New selenium task-02");
					Thread.sleep(2000);
					
					//DEPT
					driver.findElement(By.xpath("//button[@data-id='drpVal-Department']")).click();
					Thread.sleep(2000);
					
					
					
					driver.findElement(By.xpath("/html/body/modal-container/div/div/app-dynamic-form-builder/div/div/div[2]/div/div/app-additional-info/div/form/div[1]/div[2]/div/app-dropdown-select/div/div/div/div/input")).sendKeys("IT");
					
					Thread.sleep(3000);
					driver.findElement(By.xpath("//span[@class='text'][normalize-space()='IT']")).click();
					Thread.sleep(2000);
//						List<WebElement>dynamicList=driver.findElements(By.xpath("//div[@class='btn-group bootstrap-select custom-drop-down custom-picker-Department -Department show-menu-arrow ng-untouched ng-pristine ng-valid open']//li"));
//						
//						for(int i=0;i<dynamicList.size();i++)
//						{
//							String text=dynamicList.get(i).getText();
//							
//							System.out.println("Text is"+text);
//							if(text.contains("ÏT"))
//							{
//								
//								dynamicList.get(i).click();
//								break;
//								
//								
//							}
//							
//							
//							
//							
//							
//						}
//						
	
					 
						Thread.sleep(2000);
						
						//START_DATE
						 WebElement dateTimeInput3=driver.findElement(By.cssSelector("input[name='Start Date']"));
						 dateTimeInput3.clear();
//						 Actions actions = new Actions(driver);
//						 actions.sendKeys(dateTimeInput, "29032024");
//						 
//						 actions.perform();
						// Thread.sleep(5000);
						// dateTimeInput.sendKeys("28032024");
						 Thread.sleep(2000);
						 dateTimeInput3.sendKeys("01042024");
						 Thread.sleep(5000);
						 dateTimeInput3.sendKeys(Keys.TAB);
						// Thread.sleep(2000);
						 dateTimeInput3.sendKeys("0731PM");
						 
						 
						 Thread.sleep(2000);
						 
						 
							
							//PROJECT	
							    driver.findElement(By.xpath("//input[@name='Project']")).sendKeys("new project-02");
								Thread.sleep(2000);
						 
						 
						 
						 
						 //PRIORITY
						 driver.findElement(By.xpath("//button[@title='Urgent']//span[@class='caret']")).click();
						Thread.sleep(2000);
						driver.findElement(By.xpath("/html/body/modal-container/div/div/app-dynamic-form-builder/div/div/div[2]/div/div/app-additional-info/div/form/div[1]/div[5]/div/app-dropdown-select/div/div/div/div/input")).sendKeys("Urgent");
				         Thread.sleep(2000);
						driver.findElement(By.xpath("//li[@class='selected active']//a[@role='option']")).click();
						Thread.sleep(2000);
						
						
						
						//DUE_DATE
						WebElement dateTimeInput4=driver.findElement(By.xpath("//input[@name='Due Date']"));
						 dateTimeInput4.clear();
//						 Actions actions2 = new Actions(driver);
//						 actions2.sendKeys(dateTimeInput2, "31032024");
//						 actions2.perform();
						 Thread.sleep(2000);
						 dateTimeInput4.sendKeys("03042024");
						 Thread.sleep(2000);
						 dateTimeInput4.sendKeys(Keys.TAB);
						 Thread.sleep(2000);
						 dateTimeInput4.sendKeys("0245PM");
						 
						 
						 //ASSIGN_TO
						Thread.sleep(2000);
						driver.findElement(By.xpath("//button[@data-id='drpVal-Assign_To']//span[@class='caret']")).click();
						Thread.sleep(2000);
						driver.findElement(By.xpath("/html/body/modal-container/div/div/app-dynamic-form-builder/div/div/div[2]/div/div/app-additional-info/div/form/div[1]/div[7]/div/app-dropdown-select/div/div/div/div/input")).sendKeys("Atul Bankar");
						Thread.sleep(3000);
						driver.findElement(By.xpath("/html/body/modal-container/div/div/app-dynamic-form-builder/div/div/div[2]/div/div/app-additional-info/div/form/div[1]/div[7]/div/app-dropdown-select/div/div/div/ul/li[2]/a/span[1]")).click();
						Thread.sleep(3000);
					
						
						
						//TASK_DESCRIPTION
						driver.findElement(By.xpath("//textarea[@placeholder='Add Description']")).sendKeys("this is project description");
							Thread.sleep(2000);
							
							
							driver.findElement(By.xpath("//button[normalize-space()='Proceed']")).click();
						    Thread.sleep(3000);
							
					
				
			
		
		
		
				
				//checking_task
			//	driver.findElement(By.xpath("//a[contains(text(),'Home')]")).click();
				//Thread.sleep(5000);
				
				
				
			//	driver.findElement(By.xpath("//div[@id='cart-mytasks']//div[@class='tile-view']")).click();
				//Thread.sleep(5000);
				
				
			//	driver.findElement(By.xpath("//span[@class='fa fa-caret-down']")).click();
				//Thread.sleep(3000);
				
				//driver.findElement(By.xpath("//span[normalize-space()='Task created by me']")).click();
				//Thread.sleep(2000);
				
			//	driver.findElement(By.xpath("//div[@id='drpTask']//div[1]//div[1]")).click();
			//	Thread.sleep(2000);
				
			//	driver.findElement(By.xpath("//button[normalize-space()='Fetch task']")).click();
			//	Thread.sleep(5000);
				
			//	driver.findElement(By.xpath("//body[1]/app-root[1]/ui-view[1]/app-root[1]/ui-view[1]/app-web-main-layout[1]/ui-view[1]/app-process-container[1]/ui-view[1]/app-new-task-list[1]/div[2]/div[2]/tabset[1]/div[1]/tab[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/label[1]/div[1]/span[1]/i[1]")).click();
				//Thread.sleep(5000);
				
				
				
				//driver.findElement(By.xpath("//button[@type='submit']")).click();
				//Thread.sleep(2000);
				//driver.findElement(By.xpath("//button[normalize-space()='Save and Continue']")).click();
			   
				
				//Thread.sleep(2000);
				
		
//				
//				Thread.sleep(2000);
//				
//				driver.findElement(By.xpath("//button[normalize-space()='Save and Continue']")).click();
//				
//		          MERGING_HERE
			     driver.switchTo().newWindow(WindowType.TAB);
			     Thread.sleep(2000);
			     driver.get("https://staging.aiqod.com:843/");
			     Thread.sleep(2000);
			     
			
}
}

