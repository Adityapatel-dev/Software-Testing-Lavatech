package com.lavatech.tests;

import com.lavatech.www.RegisterPage;
import com.lavatech.www.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RegisterAndLoginTest {
    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demowebshop.tricentis.com/");
    }

    @Test(priority = 1)
    public void testRegister() {
        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.clickRegisterLink();
        registerPage.fillRegistrationForm("John", "Doe", "john.doe@example.com", "Password123");
        registerPage.clickRegisterButton();
    }

    @Test(dependsOnMethods = "testRegister")
    public void testLogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickLoginLink();
        loginPage.fillLoginForm("john.doe@example.com", "Password123");
        loginPage.clickLoginButton();
        
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
