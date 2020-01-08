package tests;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static tests.PageProvider.getCustomerLoginPage;

public class loginTest {
    @When("^I click customer name as (.*)$")
    public void chooseCustomerName(String customerNameSelected) throws InterruptedException {
        getCustomerLoginPage().chooseCustomerName(customerNameSelected);
        Thread.sleep(3000);
    }

    @And("^I click login button$")
    public void clickLoginButton() throws InterruptedException {
        getCustomerLoginPage().clickLoginButton();
        Thread.sleep(3000);
    }

    @Then("^I verify login successfully with (.*)$")
    public void verifyLoginSuccessfully(String customerNameSelected) throws InterruptedException{
        getCustomerLoginPage().verifyLoginSuccessfully(customerNameSelected);
        Thread.sleep(2000);
    }
}
