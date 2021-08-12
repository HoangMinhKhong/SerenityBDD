package navigation;

import gapoUis.LoginForm;
import gapoUis.PostUi;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.gapowork.vn/login/")
public class GapoLoginPage extends PageObject {
    public void clickToElement(){
        withAction().moveToElement($(PostUi.POST_TITLES_DETAIL)).perform();
    }
}
