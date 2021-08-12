package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import gapoActions.PostAction;

import static org.assertj.core.api.Assertions.assertThat;

public class PostStepDefinitions {

    @Steps
    PostAction postAction;

    @Given("^(?:.*) click title post")
    public void i_am_click_on_title_post() {
        postAction.clickPost();
    }

    @When("she/he enter post detail {string}")
    public void i_enter_post_detail(String postDetail) {
        postAction.enterPost(postDetail);
    }

    @When("she/he click share")
    public void i_enter_pass() {
        postAction.clickShare();
    }

//    @Then("she/he should see information about {string}")
//    public void avatar(String term) {
//        assertThat(LoginResult.displayed()).contains(term);
//    }
}
