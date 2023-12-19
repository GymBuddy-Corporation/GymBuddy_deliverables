package com.example.seleniumhomeworkalexandrunazare;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Main {

    @Test
    public void test(){
        System.setProperty("webdriver.gecko.driver", "src/test/java/drivers/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.convertitore-euro.it/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[4]/div[4]/div/div[2]/div[1]/input")).sendKeys("0");
        WebElement a=driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div[4]/div[4]/div/div[2]/div[2]/div[2]/div"));
        assertTrue(Float.valueOf(a.getText().replace(',','.'))>=10.0);
    }


    public static void main(String[] args) {

       System.setProperty("webdriver.gecko.driver", "src/test/java/drivers/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://it.wikipedia.org/wiki/Joe_Biden");
        driver.manage().window().maximize();
        WebElement a=driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[5]/div[1]/table[1]/tbody/tr[6]/td"));
        System.out.println("Joe biden entred the presidential office on date:"+a.getText());
    }
}
