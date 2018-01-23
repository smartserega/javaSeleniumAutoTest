package smartserega;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class FirstTest {

    private static WebDriver driver;

    @BeforeClass
    public static void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.tutu.ru/");
    }


   /* Сценарий:Расписание
    Когда Пользователь заходит на сайт "Туту-ру" (https://www.tutu.ru/
    И вводит станцию отправления "Петровско-Разумовская"
    И вводит конечный пунт назначения "Тверь"
    И нажимает кнопку "Найти"
    Тогда Пользователь может увидеть расписание поездов "Петровско-Разумовская Тверь"*/




 /*   @Test
    public void userLogin() {


        WebElement loginField = driver.findElement(By.id("login"));
        loginField.sendKeys("autotestorgua");
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("testpass");
        WebElement loginButton = driver.findElement(By.xpath("//button[text()='Войти']"));
        loginButton.click();
        WebElement profileUser = driver.findElement(By.cssSelector(".login-button__user"));
        String mailUser = profileUser.getText();
        Assert.assertEquals("autotestorgua@ukr.net", mailUser);
    }

    @AfterClass
    public static void tearDown() {
        WebElement menuUser = driver.findElement(By.cssSelector(".login-button__menu-icon"));
        menuUser.click();
        WebElement logoutButton = driver.findElement(By.id("login__logout"));
        logoutButton.click();
        driver.quit();
    }*/
}
