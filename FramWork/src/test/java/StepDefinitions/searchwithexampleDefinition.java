package StepDefinitions;

import Objects.HomePage;
import base.ApplicationPageBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class searchwithexampleDefinition extends ApplicationPageBase {
    HomePage homePage = PageFactory.initElements(driver,HomePage.class);
    @Given("^User has to be the the HoePage$")
    public void user_has_to_be_the_the_HoePage() {
        String value=driver.getTitle();
        System.out.println(value);

    }

    @When("^They'll click the search buttom to \"([^\"]*)\"they want to find$")
    public void they_ll_click_the_search_buttom_to_they_want_to_find(String arg1)  {
        homePage.Search(arg1);


    }

    @Then("^User will get \"([^\"]*)\" result$")
    public void user_will_get_result(String arg1)  {
        String actualresult=homePage.gettheresult();
        Assert.assertEquals(actualresult,arg1);

    }

}
