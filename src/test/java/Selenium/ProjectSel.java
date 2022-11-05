package Selenium;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


public class ProjectSel {

    //Zadanie nr 1

    @Test
    void CheckEmptyLoginField() {
        System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\bin\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.get("https://www.saucedemo.com/");
        WebElement passwordInput = driver.findElement(By.id("password"));
        WebElement submitButton = driver.findElement(By.id("login-button"));
        passwordInput.sendKeys("Haslo123");
        submitButton.click();
        WebElement errorBox = driver.findElement(By.cssSelector(".error-message-container"));
        Assertions.assertEquals("Epic sadface:Username is required", errorBox.getText());
        driver.quit();

    }

                    //  Zadanie nr 2
    @Test
    void CheckEmptyPasswordField() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\bin\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.get("https://www.saucedemo.com/");
        WebElement loginInput = driver.findElement(By.id("user-name"));
        WebElement submitButton = driver.findElement(By.id("login-button"));
        loginInput.sendKeys("loginTest");
        submitButton.click();
        WebElement errorBox = driver.findElement(By.cssSelector(".error-message-container"));
        Assertions.assertEquals("Epic sadface:Password is required", errorBox.getText());
        driver.quit();

    }
        //Zadanie nr 3

    @Test
    void CheckLogoFiled() {
        System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\bin\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.get("http://automationpractice.com/");
        Assertions.assertTrue(driver.findElement(By.xpath("//img[@class = 'logo img-responsive']")).isDisplayed());
        Assertions.assertTrue(driver.findElement(By.id("search_query_top")).isDisplayed());
        driver.findElement(By.xpath("//a[@class = 'login']")).click();
        Assertions.assertTrue(driver.findElement(By.xpath("//img[@class = 'logo img-responsive']")).isDisplayed());
        Assertions.assertTrue(driver.findElement(By.id("search_query_top")).isDisplayed());
        driver.quit();

    }
       // Zadanie nr 4
    @Test
    void homePageToContactPage() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\bin\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.get("http://automationpractice.com/index.php");
        driver.findElement(By.id("contact-link")).click();
        driver.findElement(By.xpath("//a[@title = 'Contact us']")).isDisplayed();
        driver.quit();

    }
        // Zadanie nr 5
    @Test
    void loginPageToMainPage() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\bin\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
        driver.findElement(By.id("img-responsive")).click();
        driver.quit();


    }
    // Zadanie nr 6

    @Test
    void ProductAddToCart() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        WebElement passwordInput = driver.findElement(By.id("password"));
        WebElement emailInput = driver.findElement(By.id("user-name"));
        WebElement submitButton = driver.findElement(By.id("login-button"));
        passwordInput.sendKeys("secret_sauce");
        emailInput.sendKeys("standard_user");
        submitButton.click();
        WebElement errorBox = driver.findElement(By.cssSelector(".error-message-container"));
        Assertions.assertEquals("Epic sadface:Password is required", errorBox.getText());
        driver.quit();
        WebElement errorBox = driver.findElement(By.cssSelector(".error-message-container"));
        Assertions.assertEquals("Epic sadface:Username is required", errorBox.getText());
        driver.quit();
        WebElement ProductAddToCart = driver.findElement(By.cssSelector("add-to-cart-sauce-labs-onesie"));
        ProductAddToCart.click();
        WebElement errorBox = driver.findElement(By.cssSelector(".Failed"));
        Assertions.assertEquals("sauce-lab-onesie-has-been-added-to-cart", errorBox.getText());
        driver.quit();

    }
        //Zadanie nr 7

        //WebDriver driver;
        String email = "standard_user";
        String password = "secret_sauce";

        @BeforeAll
        static void RemoveProductToCart() {
            System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\bin\\chromedriver.exe");
            WebDriver = new ChromeDriver();
            drive.manage().window().fullscreen();
            driver.get("https://www.saucedemo.com");
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            driver.navigateLoginPage().to("standard_user", "secret_sauce");
        }

        @AfterAll
        static void RemoveProductToCart () {
            driver.quit();
        }

        @Test
        void  RemoveProductToCart() {
            driver.findElement(By.id("remove-from-cart-sauce-labs-onesie")).click();
            Assertions.assertTrue(driver.findElement(By.id("remove-sauce-labs-backpack")).isDisplayed());
            WebElement = driver.findElement(By.cssSelector(".shopping_cart_container")).getText();
            Assertions.assertTrue(Boolean.parseBoolean("1"));
            driver.quit();

    }
}
