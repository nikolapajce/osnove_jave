package d10_06_2022;

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
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

        String url = "https://s.bootsnipp.com/iframe/Dq2X";

        driver.navigate().to(url);

        List<WebElement> iksevi = driver.findElements(By.className("close"));


        for (int i = 0; i < iksevi.size(); i++) {

            iksevi.get(i).click();
            Thread.sleep(1000);
            if (elementExist(driver, By.xpath("//div[last()]//span[contains(@class, 'glyphicon')]"))) {
                System.out.println("Element postoji.");
            } else {
                System.out.println("Element ne postoji.");
            }

        Thread.sleep(1000);
    }

        Thread.sleep(1000);
        driver.quit();
}

    public static boolean elementExist(WebDriver driver, By by) {
        boolean elementExist = true;
        try {
            driver.findElement(by);
        } catch (Exception e) {
            elementExist = false;
        }
        return elementExist;
    }
}
