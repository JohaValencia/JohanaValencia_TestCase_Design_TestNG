package org.espn;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

private WebDriver driver;

public Driver() {
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
}

    public WebDriver getDriver() {
        return this.driver;
    }
}
