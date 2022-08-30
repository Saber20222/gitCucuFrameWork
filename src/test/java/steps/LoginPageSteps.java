package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.CommonMethods;
import utils.ConfigReader;

public class LoginPageSteps extends CommonMethods {

    @When("user enters user name and password")
    public void user_enters_user_name_and_password() {
        sendText(login.usernameTextField, ConfigReader.getPropertyValue("username"));
        sendText(login.passwordTextField, ConfigReader.getPropertyValue("password"));
    }

    @And("user clicking the login button")
    public void user_clicking_the_login_button() {
        click(login.loginButton);
    }

    @Then("user is able to log in")
    public void user_is_able_to_log_in() {
        System.out.println("User is able to login to " + driver.getTitle());
    }
}