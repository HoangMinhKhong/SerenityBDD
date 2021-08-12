package gapoUis;

import org.openqa.selenium.By;

public class LoginForm {
    public static By EMAIL_FIELD = By.name("email");
    public static By PASS_FIELD = By.xpath("//input[@type='%s']");
    public static By LOGIN_CHECK = By.xpath("//a[@class='avatarlink']//span");
}