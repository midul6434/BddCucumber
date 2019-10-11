package StepDefinitions;

import Objects.Login;
import base.ApplicationPageBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class loginDefinition extends ApplicationPageBase {
    Login login = PageFactory.initElements(driver,Login.class);

    @Given("^user has to be in the log in page$")
    public void user_has_to_be_in_the_log_in_page()  {
       login.signin();
    }

    @When("^User will put the \"([^\"]*)\" &\"([^\"]*)\"$")
    public void user_will_put_the(String arg1, String arg2)  {
       login.login(arg1,arg2);
    }

    @Then("^It will say Authentication failed\\.$")
    public void it_will_say_Authentication_failed()  {
        String actualresult=login.getresult();
        Assert.assertEquals(actualresult,"There is 1 error\n" +
                "Authentication failed.");

    }

}
