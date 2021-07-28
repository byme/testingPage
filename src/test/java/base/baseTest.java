package base;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.mainPage;

public class baseTest {
    private WebDriver driver;
    protected mainPage hPage;
    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.choucairtesting.com/");
        hPage = new mainPage(driver);
        //
    }

    @AfterClass
    public void shutDown(){
        driver.quit();
    }

}
