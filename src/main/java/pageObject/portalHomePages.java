package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class portalHomePages {

    public WebDriver driver;
    private By searchBox = By.name("query");


    public portalHomePages(WebDriver driver)
    {
        this.driver = driver;
    }

    public WebElement getSearchBox(){

        return driver.findElement(searchBox);
    }


    }


