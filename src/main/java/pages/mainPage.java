package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class mainPage {
    public WebDriver driver;
    private By empleoB = By.linkText("Empleos");


    public mainPage(WebDriver driver){
        this.driver = driver;
    }

    public String empleoText(){
        return driver.findElement(empleoB).getText();
    }


    public empleoPage empleoButton(String name){
        driver.findElement(empleoB).click();
        return new empleoPage(driver);
    }


}
