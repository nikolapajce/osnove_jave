package d10_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) throws InterruptedException {
        Scanner s = new Scanner(System.in);
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Random random = new Random();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

        String url = "https://geodata.solutions/";

        driver.navigate().to(url);

        Select country = new Select(driver.findElement(By.id("countryId")));
        List<WebElement> listaCountry = country.getOptions();
        country.selectByIndex(random.nextInt(listaCountry.size()));
        Thread.sleep(1000);
        Select state = new Select(driver.findElement(By.id("stateId")));
        List<WebElement> listaState = state.getOptions();
        state.selectByIndex(random.nextInt(listaState.size()));
        Thread.sleep(1000);
        Select city = new Select(driver.findElement(By.id("cityId")));
        List<WebElement> listaCity = city.getOptions();
        city.selectByIndex(random.nextInt(listaCity.size()));

        Thread.sleep(1000);
        driver.quit();
    }

}
