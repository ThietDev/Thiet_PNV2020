package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class LoginPage {
    private WebDriver driver;

    @FindBy(id = "userSelect")
    WebElement userSelect;

    @FindBy(xpath = "//div/form/button")
    WebElement loginButton;

    @FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[1]/strong/span")
    WebElement nameLogin;

    @FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[3]/button[2]/html/body/div[3]/div/div[2]/div/div[3]/button[2]")
    WebElement depositButton;

    //Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void chooseCustomerName(String customerNameSelected) throws InterruptedException {
        Thread.sleep(2000);
        Select userSelects = new Select(userSelect);
        userSelects.selectByVisibleText(customerNameSelected);
    }

    public void clickLoginButton() throws InterruptedException {
        Thread.sleep(2000);
        loginButton.click();
    }


    public void verifyLoginSuccessfully(String customerNameSelected) {
        String customerName = nameLogin.getText();
        Assert.assertEquals(customerName, customerNameSelected, "Function login is failed");
    }

    public void clickDepositButton() throws InterruptedException {
        Thread.sleep(2000);
        depositButton.click();
    }
}
