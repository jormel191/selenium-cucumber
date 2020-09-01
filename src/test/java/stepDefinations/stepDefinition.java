package stepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pageObject.LadingPage;
import pageObject.LoginPage;
import pageObject.portalHomePages;
import resources.base;

import java.io.IOException;

public class stepDefinition extends base {

    @Given("^Initialize the browser with chrome$")
    public void initialize_the_browser_with_chrome() throws IOException {
        // Write code here that turns the phrase above into concrete actions
        driver = initializedDriver();

    }
    @Given("^Navigate to \"([^\"]*)\" Site$")
    public void navigate_to_site(String arg1) {
        driver.get(arg1);
        // Write code here that turns the phrase above into concrete actions

    }
    @Given("^Click on Login link in home page to land on secure sing in page$")
    public void Click_on_Login_link_in_home_page_to_land_on_secure_sing_in_page() {
        LadingPage l = new LadingPage(driver);
        //Esto es si y solo si cuando entro a una pagina aparece algún popUp
        if (l.getPopUpSize()>0){
            l.getPopUP().click();
        }
        l.getLogin();

    }
    @When("User enters (.+) and (.+) and logs in$")
    public void user_enters_and_and_logs_in(String username, String password) {
        LoginPage lp = new LoginPage(driver);
        lp.getEmail().sendKeys(username);
        lp.getpassword().sendKeys(password);
        lp.getLogin1().click();


    }

    @Then("^Verify that user is succesfully logged in$")
    public void Verify_that_user_is_succesfully_logged_in() throws Throwable{
        portalHomePages p=new portalHomePages(driver);
        Assert.assertTrue(p.getSearchBox().isDisplayed());
    }

    @And("^Close Browsers$")
        public void close_browser() {
            driver.quit();
        }
    }

