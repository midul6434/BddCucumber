package StepDefinitions;

import Objects.Login;
import base.ApplicationPageBase;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Map;

public class databasesDefition  extends ApplicationPageBase {
    Login login = PageFactory.initElements(driver,Login.class);
    @Given("^User is in login page$")
    public void user_is_in_login_page()  {
        login.signin();
    }

    @When("^Enter invalid email and password from Data_Table$")
    public void enter_invalid_email_and_password_from_Data_Table(DataTable arg1) {
        List<Map<String, String>> datatable = arg1.asMaps(String.class,String.class);
        login.login(datatable.get(0).get("username"),datatable.get(0).get("password"));
    }

    @Then("^Error message appear$")
    public void error_message_appear() {

    }


}
