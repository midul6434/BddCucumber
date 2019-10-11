package Objects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {
    @FindBy(how = How.XPATH, using = "//*[@id=\"search_query_top\"]")
    WebElement Id;
    @FindBy(how = How.ID, using = "search")
    WebElement button;
    @FindBy(how = How.CLASS_NAME, using = "heading-counter")
    WebElement result;
    @FindBy(how = How.PARTIAL_LINK_TEXT, partialLinkText = "Contact us")
    WebElement contactUs;
    @FindBy(how = How.PARTIAL_LINK_TEXT, partialLinkText = "Sign in")
    WebElement signInButton;


    public void Contactus() {
        contactUs.click();

    }

    public void SignIn(){
        signInButton.click();
    }

    public void Search(String obj){
        Id.sendKeys(obj, Keys.ENTER);

    }

    public String gettheresult(){
        String actualresult = result.getText();
        return actualresult;
    }

}