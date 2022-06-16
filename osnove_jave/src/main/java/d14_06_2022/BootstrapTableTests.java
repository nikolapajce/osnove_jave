package d14_06_2022;
import org.openqa.selenium.*;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Random;

public class BootstrapTableTests {
    private WebDriver driver;
    private String baseUrl = "https://s.bootsnipp.com";
    private WebDriverWait wait;
    private String firstName = "Nikola";
    private String lastName = "Pavlovic";
    private String middleName = "Mile";


    @BeforeClass
    public void beforeClass(){
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    }

    @BeforeMethod
    public void beforeMethod(){
        driver.navigate().to(baseUrl);

    }

    @Test (priority = 1)
    public void editRow() throws InterruptedException {
        driver.navigate().to(baseUrl + "/iframe/K5yrx");

        Assert.assertEquals(driver.getTitle(),"Table with Edit and Update Data - Bootsnipp.com","[Error] Title does not match");

        driver.findElements(By.className("update")).get(0).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("edit")));

        driver.findElement(By.id("fn")).clear();
        driver.findElement(By.id("fn")).sendKeys(firstName);
        driver.findElement(By.id("ln")).clear();
        driver.findElement(By.id("ln")).sendKeys(lastName);
        driver.findElement(By.id("mn")).clear();
        driver.findElement(By.id("mn")).sendKeys(middleName);

        driver.findElement(By.id("up")).click();

        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("edit")));

        Assert.assertTrue(driver.findElement(By.id("f1")).getText().equals(firstName), "[ERROR] First name does not match");
        Assert.assertTrue(driver.findElement(By.id("l1")).getText().equals(lastName), "[ERROR] Last name does not match");
        Assert.assertTrue(driver.findElement(By.id("m1")) .getText().equals(middleName), "[ERROR] Middle name does not match");
    }
    @Test (priority = 2)
    public void deleteRow() throws InterruptedException {
        driver.navigate().to(baseUrl + "/iframe/K5yrx");

        List<WebElement> beforeDelete = driver.findElements(By.className("delete"));

        Assert.assertEquals(driver.getTitle(),"Table with Edit and Update Data - Bootsnipp.com", "[ERROR] Title does not match");

        driver.findElement(By.xpath("//tr[@id = 'd1']//button[contains(@class, 'delete')]")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("delete")));
        driver.findElement(By.id("del")) .click();
     //   Thread.sleep(5000);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("delete")));
      //  Thread.sleep(5000);
        List<WebElement> afterDelete = driver.findElements(By.className("delete"));

        Assert.assertEquals(afterDelete.size(), beforeDelete.size() - 1, "[Error] Number of rows is not adequate");
    }

    @Test (priority = 3)
    public void takeAScreenshot() throws IOException {
        driver.navigate().to(baseUrl + "/iframe/K5yrx");

        Assert.assertEquals(driver.getTitle(),"Table with Edit and Update Data - Bootsnipp.com", "[ERROR] Title does not match");

        TakesScreenshot screen = (TakesScreenshot) driver;
        File screenshot = screen.getScreenshotAs(OutputType.FILE);
        FileHandler.copy(screenshot, new File("src/main/resources/WebPageScreenshot.jpg"));

    }
    @AfterMethod
    public void afterMethod(){
    }

    @AfterClass
    public void afterClass(){
        driver.quit();
    }
}
