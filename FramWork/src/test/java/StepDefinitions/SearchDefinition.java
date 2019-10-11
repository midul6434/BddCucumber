package StepDefinitions;

import Objects.HomePage;
import base.ApplicationPageBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SearchDefinition extends ApplicationPageBase {
HomePage homePage = PageFactory.initElements(driver,HomePage.class);

    @Given("^User will come to the home page first$")
    public void user_will_come_to_the_home_page_first() {
        // Write code here that turns the phrase above into concrete actions
       String title = driver.getTitle();
        System.out.println(title);
    }

    @When("^user click the search box to search something$")
    public void user_click_the_search_box_to_search_something()  {
        // Write code here that turns the phrase above into concrete actions
        homePage.Search("pants");
    }

    @Then("^user will get the proper result$")
    public void user_will_get_the_proper_result()  {
        // Write code here that turns the phrase above into concrete actions
       String actualresult = homePage.gettheresult();
       Assert.assertEquals(actualresult,"No results were found for your search \"pants\"");
    }


}
