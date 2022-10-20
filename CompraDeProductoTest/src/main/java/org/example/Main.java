package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Main {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));

        driver.get("http://automationpractice.com/index.php");
        driver.findElement(By.cssSelector("#header > div.nav > div > div > nav > div.header_user_info > a")).click();
        driver.findElement(By.cssSelector("#email")).sendKeys("klkmanito@yopmail.com");
        driver.findElement(By.cssSelector("#passwd")).sendKeys("klkmanito");
        driver.findElement(By.cssSelector("#SubmitLogin")).click();
        driver.findElement(By.cssSelector("#block_top_menu > ul > li:nth-child(3) > a")).click();
        driver.findElement(By.cssSelector("#center_column > ul > li > div > div.right-block > div.button-container > a.button.ajax_add_to_cart_button.btn.btn-default")).click();
        driver.findElement(By.cssSelector("#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > a")).click();
        driver.findElement(By.cssSelector("#center_column > p.cart_navigation.clearfix > a.button.btn.btn-default.standard-checkout.button-medium")).click();
        driver.findElement(By.cssSelector("#center_column > form > p > button")).click();
        driver.findElement(By.cssSelector("#form > p > button")).click();
        driver.findElement(By.cssSelector("#order > div.fancybox-overlay.fancybox-overlay-fixed > div > div > a")).click();
        driver.findElement(By.cssSelector("#cgv")).click();
        driver.findElement(By.cssSelector("#form > p > button")).click();
        driver.findElement(By.cssSelector("#HOOK_PAYMENT > div:nth-child(1) > div > p > a")).click();
        driver.findElement(By.cssSelector("#cart_navigation > button")).click();










    }
}