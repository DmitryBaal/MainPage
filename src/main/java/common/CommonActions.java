package common;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import java.util.concurrent.TimeUnit;
import static common.Config.BROWSER;
import static constants.Constants.TimeoutVariables.IMPLICIT_WAIT;

public class CommonActions {
    public static WebDriver createDriver(){
            WebDriver driver = null;
            switch (BROWSER){
                case "CHROME" :
                    System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
                    driver = new ChromeDriver();
                    break;
                case "MOZILLA" :
                    System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver.exe");
                    driver = new FirefoxDriver();
                    break;
                case "OPERA" :
                    System.setProperty("webdriver.opera.driver", "src/main/resources/operadriver.exe");
                    driver = new OperaDriver();
                    break;
                default:
                    Assertions.fail("INCORRECT BROWSER NAME" + BROWSER);
            }
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(IMPLICIT_WAIT, TimeUnit.SECONDS);
            return driver;
    }
}
