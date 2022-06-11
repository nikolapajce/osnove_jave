package d09_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;
import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) throws InterruptedException {
        Scanner s = new Scanner(System.in);
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        String url = "https://s.bootsnipp.com/iframe/WaXlr";
        driver.navigate().to(url);

        List<WebElement> zvezdice = driver.findElements(By.xpath("//button[contains(@id, 'rating-star')]"));
        System.out.println("Koliko zvezdica?");
        int n = s.nextInt();

        zvezdice.get(n-1).click();

        Thread.sleep(3000);

        driver.quit();
    }
}
