package d09_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;
import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) throws InterruptedException {
        Scanner s = new Scanner(System.in);
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        String url = "https://www.tutorialrepublic.com/snippets/bootstrap/table-with-add-and-delete-row-feature.php";
        String name = "Nikola Pavlovic";
        String department = "QA";
        String phone = "0604112555";
        driver.navigate().to(url);

        for (int i = 0; i < 5; i++) {
            driver
                    .findElement(By.className("add-new"))
                    .click();
            driver
                    .findElement(By.name("name"))
                    .sendKeys(name);
            driver
                    .findElement(By.name("department"))
                    .sendKeys(department);
            driver
                    .findElement(By.name("phone"))
                    .sendKeys(phone);
            driver
                    .findElement(By.xpath("//tr[last()]//a[@class = 'add']"))
                    .click();
            Thread.sleep(500);
        }

        Thread.sleep(3000);
        driver.quit();
    }
}
