package com.virgosol.stepImpl;

import com.virgosol.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class OrangeLoginStepImpl extends Driver{


    @Given("{string} sitesini aç.")
    public void sitesini_aç(String website) {

        try {
            String browser = "firefox";
            page = createPlaywrightPageInstance(browser);
            page.navigate(website);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Then("Login syfasında olduğunu doğrula.")
    public void login_syfasında_olduğunu_doğrula() {
        page.locator("//h5[.='Login']").isVisible();
    }
    @Then("Enter username as {string}")
    public void enter_username_as(String username) {
        page.locator("//input[@name='username']").fill(username);
    }
    @Then("Enter password as {string}")
    public void enter_password_as(String password) {
        page.locator("//input[@name='password']").fill(password);
    }
    @Then("Click Login button")
    public void click_login_button() {
        page.locator("button[type='submit']").click();
    }
    @Then("Verify on login page")
    public void verify_on_login_page() {
        page.locator("//h6[.='Dashboard']").isVisible();
    }

}
