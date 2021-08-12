package gapoActions;

import gapoUis.LoginForm;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.Keys;

public class LoginEnterFor extends UIInteractionSteps {

    @Step("Search for email {0}")
    public void email(String term) {
        $(LoginForm.EMAIL_FIELD).clear();
        $(LoginForm.EMAIL_FIELD).sendKeys(term, Keys.ENTER);
    }

    @Step("Search for pass {0}")
    public void pass(String term) {
        $(LoginForm.PASS_FIELD).clear();
        $(LoginForm.PASS_FIELD).sendKeys(term, Keys.ENTER);
    }
}
