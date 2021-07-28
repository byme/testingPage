package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class empleoPage {
    private By empleoB = By.className("elementor-button-text");
    private By magnetoB = By.className("elementor-button-link elementor-button elementor-size-sm");

    public WebDriver driver;


    public empleoPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickEmpleo(){
        driver.findElement(empleoB).click();
    }
    public void clickMagneto(){
        driver.findElement(magnetoB).click();
    }


    public magnetoPage empleoButton(String name){
        driver.findElement(empleoB).click();
        return new magnetoPage(driver);
    }

}
