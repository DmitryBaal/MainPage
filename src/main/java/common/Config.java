package common;

import com.codeborne.selenide.Configuration;

public class Config {
    /**
     * Choose a browser for tests
     */
    public static final String BROWSER = "CHROME";
    /** Clean cookies after test*/
    public static final Boolean CLEAR_COOKIES = true;
    /*** Keep browser open after tests*/
    public static final Boolean HOLD_BROWSER_OPEN = true;

    static {
        Configuration.browser = BROWSER;
       // Configuration.startMaximized(true);
    }


}
