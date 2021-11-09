package pages.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;
import static constants.Constants.TimeoutVariables.EXPLICIT_WAIT;
import static constants.Constants.TimeoutVariables.IMPLICIT_WAIT;

public class BasePage {
    public WebDriver driver;
    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    /**Method for open URL */
    public void openUrl(String url){
        driver.get(url);
    }

    /**Wait for visibility elements */
    public void waitElementIsVisible(WebElement element){
        new WebDriverWait(driver, EXPLICIT_WAIT).until(ExpectedConditions.visibilityOf(element));
    }

    /** Wait */
public void waitImplicit (){
        driver.manage().timeouts().implicitlyWait(IMPLICIT_WAIT, TimeUnit.SECONDS);;
}








}
