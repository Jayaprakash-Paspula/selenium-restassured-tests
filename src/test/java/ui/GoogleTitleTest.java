package ui;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTitleTest extends BaseTest {

    @Test
    public void verifyGoogleTitle() {
        driver.get("https://www.google.com");
        Assert.assertTrue(driver.getTitle().contains("Google"));
    }
}
