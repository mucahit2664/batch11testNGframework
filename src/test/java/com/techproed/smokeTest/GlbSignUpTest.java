package com.techproed.smokeTest;

import com.techproed.pages.GlbSignUpPage;
import com.techproed.utilities.ConfigReader;
import com.techproed.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GlbSignUpTest {

    @Test(groups = "grup1")
    public void signUp() throws InterruptedException {

        Driver.getDriver().get(ConfigReader.getProperty("gt_signUp_url"));
        GlbSignUpPage glbSignUpPage=new GlbSignUpPage();
        glbSignUpPage.email.sendKeys(ConfigReader.getProperty("gt_email"));
        glbSignUpPage.name.sendKeys(ConfigReader.getProperty("gt_name"));
        glbSignUpPage.mobile.sendKeys(ConfigReader.getProperty("gt_tel"));
        glbSignUpPage.passText.sendKeys(ConfigReader.getProperty("gt_pasword"));
        glbSignUpPage.repassText.sendKeys(ConfigReader.getProperty("gt_pasword"));

        glbSignUpPage.loginButton.click();
        Thread.sleep(10000);

        Assert.assertEquals(glbSignUpPage.successTex.getText(),"Success! !");
        Driver.closeDriver();


    }
}
