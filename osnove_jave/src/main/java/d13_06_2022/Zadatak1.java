package d13_06_2022;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.time.Duration;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
public class Zadatak1 {
    public static void main(String[] args) throws InterruptedException {
        Scanner s = new Scanner(System.in);
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Random random = new Random();
        File pic1 = new File("src/main/resources/front_nikola_pavlovic.jpg");
        File pic2 = new File("src/main/resources/back_nikola_pavlovic.jpg");
        File pic3 = new File("src/main/resources/left_nikola_pavlovic.jpg");
        File pic4 = new File("src/main/resources/right_nikola_pavlovic.jpg");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        String url = "https://boomf.com/apps/proxy/boomf-bomb/i-bloody-love-you";
        driver.navigate().to(url);
        driver.manage().window().maximize();

        driver
                .findElement(By.xpath("//img[@alt = 'image 1']"))
                .click();
        driver
                .findElement(By.xpath("//div[text() ='+ Add photo']"))
                .click();
        driver
                .findElement(By.xpath("//input[@type ='file']"))
                .sendKeys(pic1.getAbsolutePath());
        wait.until(ExpectedConditions.numberOfElementsToBe(By.className("kAzmBp"), 1));
        driver
                .findElement(By.xpath("//div[contains(@class, 'gmXCBU')]/img[last()]"))
                .click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class, 'dxCajp')]")));
        driver
                .findElement(By.xpath("//button[text() ='Use One Side Only']"))
                .click();

        driver
                .findElement(By.xpath("//img[@alt = 'image 2']"))
                .click();
        driver
                .findElement(By.xpath("//div[text() ='+ Add photo']"))
                .click();
        driver
                .findElement(By.xpath("//input[@type ='file']"))
                .sendKeys(pic2.getAbsolutePath());
        wait.until(ExpectedConditions.numberOfElementsToBe(By.className("haLJiC"), 2));
        driver
                .findElement(By.xpath("//*[contains(@class, 'kAzmBp')]/div[2]/div/img"))
                .click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class, 'dxCajp')]")));
        driver
                .findElement(By.xpath("//button[text() ='Use One Side Only']"))
                .click();
        driver
                .findElement(By.xpath("//img[@alt = 'image 3']"))
                .click();
        driver
                .findElement(By.xpath("//div[text() ='+ Add photo']"))
                .click();
        driver
                .findElement(By.xpath("//input[@type ='file']"))
                .sendKeys(pic3.getAbsolutePath());
        wait.until(ExpectedConditions.numberOfElementsToBe(By.className("haLJiC"), 3));
        driver
                .findElement(By.xpath("//*[contains(@class, 'kAzmBp')]/div[3]/div/img"))
                .click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class, 'dxCajp')]")));
        driver
                .findElement(By.xpath("//button[text() ='Use One Side Only']"))
                .click();
        driver
                .findElement(By.xpath("//img[@alt = 'image 4']"))
                .click();
        driver
                .findElement(By.xpath("//div[text() ='+ Add photo']"))
                .click();
        driver
                .findElement(By.xpath("//input[@type ='file']"))
                .sendKeys(pic4.getAbsolutePath());
        wait.until(ExpectedConditions.numberOfElementsToBe(By.className("haLJiC"), 4));
        driver
                .findElement(By.xpath("//*[contains(@class, 'kAzmBp')]/div[4]/div/img"))
                .click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class, 'dxCajp')]")));
        driver
                .findElement(By.xpath("//button[text() ='Use One Side Only']"))
                .click();
        Thread.sleep(3000);
        List<WebElement> confetti = driver.findElements(By.xpath("//*[contains(@class, 'sc-jhzXDd')]"));
        confetti.get(random.nextInt(confetti.size())).click();
        Thread.sleep(3000);
        driver
                .findElement(By.xpath("//button[@type='submit']"))
                .click();
        if (elementExist(driver, By.xpath("//*[@action='error']"))){
            System.out.println("Error message exists");
        } else {
            System.out.println("Error message does not exist");
        }
        driver.quit();



    }
    public static boolean elementExist(WebDriver driver, By by) {
        boolean elementExist = true;
        try {
            driver.findElement(by);
        } catch (Exception e) {
            elementExist = false;
        }
        return  elementExist;
    }
}