package smartserega;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class FirstTest {

    private static WebDriver driver;

    @BeforeClass
    public static void setup() {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://google.com");
    }
    @Test
    public void userLogin() {
       /* ТУТ НЕ МОЙ АВТОТЕСТ НАЧИНАЕНТСЯ (т.е. селекторы и прочье не моё),
       Я СВОИ ХОЧУ ПОДСТАВИТЬ ЭЛЛЕМЕНТЫ, МНЕ ГЛАВНОЕ ПОНЯТЬ КАК ГУГЛ ЗАПУСТИТЬ,
       ДЕЛАТЬ КЛИКИ, ТЕКСТ ПИСАТЬ И Т.Д. Т,Е, ВВСЕ МЕТОДЫ НЕОБЪОДИМЫ ДЛЯ ТЕСТИРОВАНИЯ


        WebElement loginField = driver.findElement(By.id("login"));
        loginField.sendKeys("autotestorgua");
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("testpass");
        WebElement loginButton = driver.findElement(By.xpath("//button[text()='Войти']"));
        loginButton.click();
        WebElement profileUser = driver.findElement(By.cssSelector(".login-button__user"));
        String mailUser = profileUser.getText();
        Assert.assertEquals("autotestorgua@ukr.net", mailUser);*/
    }
    @AfterClass
    public static void tearDown() {
        /*WebElement menuUser = driver.findElement(By.cssSelector(".login-button__menu-icon"));
        menuUser.click();
        WebElement logoutButton = driver.findElement(By.id("login__logout"));
        logoutButton.click();
        driver.quit();*/
    }
}
