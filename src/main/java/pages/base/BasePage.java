package pages.base;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;
import static com.codeborne.selenide.Selenide.*;

public class BasePage {

    /**
     * Method for open URL
     */
    public void openUrl(String url) {
        open(url);
    }

    protected void clearAndType(SelenideElement element, String value){
        while (!element.getAttribute("value").equals((""))) element.sendKeys((Keys.BACK_SPACE));
        element.sendKeys(value);
    }
}
