import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class FirstTest {
    private static final String URL = "https://cloud.swivl.com/register/";
    /*@BeforeTest
    void setUp(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }*/

    @Test
    void registrationTest(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        driver.get(URL);

        WebElement NamePlaceholderElement = driver.findElement(By.id("swivl_registration_firstName"));
        NamePlaceholderElement.sendKeys("John");

        WebElement LastNamePlaceholderElement = driver.findElement(By.id("swivl_registration_lastName"));
        LastNamePlaceholderElement.sendKeys("Smith");

        WebElement EmailPlaceholderElement = driver.findElement(By.id("swivl_registration_email"));
        EmailPlaceholderElement.sendKeys("fmvmug@midiharmonica.com");

        WebElement PasswordPlaceholderElement = driver.findElement(By.id("swivl_registration_plainPassword_first"));
        PasswordPlaceholderElement.sendKeys("fmvmug@midiharmonica.com");

        WebElement ConfirmPasswordPlaceholderElement = driver.findElement(By.id("swivl_registration_plainPassword_second"));
        ConfirmPasswordPlaceholderElement.sendKeys("fmvmug@midiharmonica.com");

        Select AgeDropDownPlaceholder = new Select(driver.findElement(By.id("swivl_registration_age")));
        AgeDropDownPlaceholder.selectByIndex(2);

        Select CountryDropDownPlaceholder = new Select(driver.findElement(By.id("swivl_registration_country")));
        CountryDropDownPlaceholder.selectByVisibleText("Japan");

        Select RoleDropDownPlaceholder = new Select(driver.findElement(By.id("swivl_registration_role_rolePreset")));
        RoleDropDownPlaceholder.selectByVisibleText("IT");

        WebElement SignUpButton = driver.findElement(By.id("formSubmit"));
        SignUpButton.click();


        //Assert.assertEquals("We do not recognize your email and/or password.", driver.findElement(By.className("form__error")).getText());


    }

    /*@AfterTest
    void tearDown(){
        driver.quit();
    }*/




}
