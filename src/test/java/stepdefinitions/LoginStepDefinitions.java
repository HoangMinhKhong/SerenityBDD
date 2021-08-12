package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import navigation.NavigateTo;
import net.thucydides.core.annotations.Steps;
import gapoActions.LoginEnterFor;

import static org.assertj.core.api.Assertions.assertThat;


public class LoginStepDefinitions {

    @Steps
    NavigateTo navigateTo;

    @Steps
    LoginEnterFor loginEnterFor;

    @Steps
    gapoActions.LoginResult LoginResult;

    @Given("^(?:.*) is researching things on the internet")
    public void i_am_on_the_Gapo_login_page() {
        navigateTo.theLoginPage();
    }

    @When("she/he enter email {string}")
    public void i_enter_email(String email) {
        loginEnterFor.email(email);
    }

    @When("she/he enter pass {string}")
    public void i_enter_pass(String pass) {
        loginEnterFor.pass(pass);
    }

    @Then("she/he should see information about {string}")
    public void avatar(String term) {
        assertThat(LoginResult.displayed()).contains(term);
    }
}

