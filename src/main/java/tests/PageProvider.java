package tests;

import org.openqa.selenium.support.PageFactory;
import pages.CommonPage;
import pages.LoginPage;
import runner.TestRunner;

public class PageProvider {

    private static CommonPage commonPage;
    private static LoginPage customerLoginPage;


    public static CommonPage getCommonPage() {
        if (commonPage == null) {
            commonPage = PageFactory.initElements(TestRunner.driver, CommonPage.class);
        }
        return commonPage;
    }

    public static LoginPage getCustomerLoginPage(){
        if(customerLoginPage == null){
            customerLoginPage = PageFactory.initElements(TestRunner.driver, LoginPage.class);
        }
        return customerLoginPage;
    }

}
