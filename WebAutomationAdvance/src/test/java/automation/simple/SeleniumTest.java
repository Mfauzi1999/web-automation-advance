package automation.simple;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class SeleniumTest {

    WebDriver driver;

    @Test
    public void loginTest() {
        //open browser
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.makemytrip.com");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        //Tunggu halaman sampai terinput sempurna
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[.='Search']")));
        driver.findElement(By.xpath("//a[.='Search']")).click();


    }

}



