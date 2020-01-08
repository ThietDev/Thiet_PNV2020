package pages;

import runner.TestRunner;

public class CommonPage {
    public void closeAlertPopup() {
        TestRunner.driver.switchTo().alert().accept();
    }
}