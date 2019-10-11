package Objects;

import base.ApplicationPageBase;
import cucumber.api.DataTable;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Login extends ApplicationPageBase {
    @FindBy(how = How.XPATH,using = "//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")
    WebElement signin;

    @FindBy(how = How.ID,using = "email")
    WebElement email;

    @FindBy(how=How.ID,using = "passwd")
    WebElement passowd;

    @FindBy(how = How.XPATH,using = "//*[@id=\"SubmitLogin\"]/span")
    WebElement submit;

    @FindBy(how = How.XPATH,using = "//*[@id=\"center_column\"]/div[1]")
    WebElement result;

    public void login(String Email,String pass) {

        sendKeys(email, "emailbox", Email);
        sendKeys(passowd, "passwordbox", pass);
        click(submit, "submitbox");
    }
public void signin(){
            signin.click();
        }


public String getresult(){
        String actualresult=result.getText();
        return actualresult;

}



}
