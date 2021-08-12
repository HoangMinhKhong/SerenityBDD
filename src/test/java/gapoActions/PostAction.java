package gapoActions;

import gapoUis.PostUi;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;


public class PostAction extends UIInteractionSteps {
    @Step("Click title post")
    public void clickPost() {
        $(PostUi.POST_TITLES).click();
    }

    @Step("Enter post detail {0}")
    public void enterPost(String postDetail) {
//        JavascriptExecutor js = (JavascriptExecutor)getDriver();
//        js.executeScript("arguments[0].value='"+postDetail+"'", $(PostUi.POST_TITLES_DETAIL));
        $(PostUi.POST_TITLES_DETAIL).sendKeys(postDetail);
    }

    @Step("Click share")
    public void clickShare() {
        $(PostUi.BUTTON_SHARE).click();
    }

    @Step("Click title post")
    public void postImage() {
        $(PostUi.POST_TITLES).click();
    }
}
