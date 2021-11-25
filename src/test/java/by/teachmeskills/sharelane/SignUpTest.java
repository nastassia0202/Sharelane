package by.teachmeskills.sharelane;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SignUpTest {

    @Test
    public void pozTestForRegistration() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");

        driver.findElement(By.name("zip_code")).sendKeys("11111");
        driver.findElement(By.cssSelector("[value='Continue']")).click();

        driver.findElement(By.name("first_name")).sendKeys("Ivan");
        driver.findElement(By.name("email")).sendKeys("ivan_malevich@mail.com");
        driver.findElement(By.name("password1")).sendKeys("12345678");
        driver.findElement(By.name("password2")).sendKeys("12345678");
        driver.findElement(By.cssSelector("[value='Register']")).click();

        Thread.sleep(50000);
        driver.quit();
    }
    }
