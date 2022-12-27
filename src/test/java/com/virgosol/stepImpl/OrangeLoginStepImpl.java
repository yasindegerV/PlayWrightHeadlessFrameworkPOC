package com.virgosol.stepImpl;

import com.virgosol.utilities.DriverPW;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrangeLoginStepImpl extends DriverPW {


    @Given("{string} sitesini aç.")
    public void sitesini_aç(String website) {

        try {
            String browser = "chromium";
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


    /**sandbox
     *
     */



    @When("Login linkine tıkla.")
    public void login_linkine_tıkla() {
        page.locator("//span[contains(@class,'login')]//a").click();
    }
    @Then("Giriş sayfasında olduğunu doğrula.")
    public void giriş_sayfasında_olduğunu_doğrula() {
        page.locator("#loginbtn").isVisible();
    }
    @Then("{string} username gir.")
    public void gir(String username) {
        page.locator("//input[@id='username']").fill(username);
    }
    @Then("{string} password gir.")
    public void girPass(String password) {
        page.locator("//input[@id='password']").fill(password);
    }

    @Then("Login butonuna tıkla.")
    public void login_butonuna_tıkla() {
        page.locator("//button[@id='loginbtn']").click();
    }
    @Then("{string} title'ın görüldüğünü doğrula.")
    public void title_ın_görüldüğünü_doğrula(String title) {
        page.locator("(//h2)[1]").innerText().contains(title);

    }
}
