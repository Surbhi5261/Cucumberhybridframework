package stepDefinitions;
import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Mainsteps {
	WebDriver driver = new ChromeDriver();
	JavascriptExecutor jse = (JavascriptExecutor) driver;
	
	public Mainsteps() {
        // Initialize WebDriver
        // Initialize JavascriptExecutor
        // Set implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); // Adjust the timeout value as needed
    }

	// setup_wizard
	@Given("user on login page" )
	public void subscriber_will_enter_user_name_and_password() throws InterruptedException {
		//driver.switchTo().newWindow(WindowType.TAB);
		Thread.sleep(2000);
		driver.get("https://product.aiqod.com//");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.name("txtMobile")).sendKeys("8319752772");
		driver.findElement(By.name("txtPassword")).sendKeys("Surbhi@123");
	}
		@And("user will click the login button")
		public void Admin_will_click_the_login_button() {
			driver.findElement(By.className("signin-btn")).click();
		}

		@Then("user should be logged in to the account")
		public void Admin_should_be_logged_in_to_the_account() throws InterruptedException {
			System.out.println("user logged in successfully");
			Thread.sleep(3000);


	}
}