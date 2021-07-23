package starter.search;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

class LoginForm {
    static By EMAIL_FIELD = By.name("phone");
    static By PASS_FIELD = By.xpath("//input[@type='password']");
    static By LOGIN_CHECK = By.xpath("//a[@class='avatarlink']//span");
}