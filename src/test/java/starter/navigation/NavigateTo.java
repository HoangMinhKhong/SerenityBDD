package starter.navigation;

import net.thucydides.core.annotations.Step;

public class NavigateTo {

    GapoLoginPage homePage;

    @Step("Open the Wikipedia home page")
    public void theLoginPage() {
        homePage.open();
    }
}