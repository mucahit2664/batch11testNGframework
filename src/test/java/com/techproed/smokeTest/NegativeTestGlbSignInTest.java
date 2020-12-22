package com.techproed.smokeTest;

import com.techproed.pages.GlbHomePage;
import com.techproed.utilities.ConfigReader;
import com.techproed.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NegativeTestGlbSignInTest {
    @Test(groups = "grup1")
    public void yanlisSifre() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("gt_signUp_url"));
        GlbHomePage glbHomePage=new GlbHomePage();
        glbHomePage.signInButonu.click();
        glbHomePage.mail.sendKeys(ConfigReader.getProperty("gt_email"));
        glbHomePage.password.sendKeys((ConfigReader.getProperty("gt_wrong_pass")));
        Thread.sleep(3000);
        glbHomePage.loginButonu.click();
        Thread.sleep(3000);

        Assert.assertTrue(glbHomePage.girisBasarisiz.getText().contains(ConfigReader.getProperty("gt_giris_basarisiz_yazi")));
        Driver.closeDriver();
    }
    @Test(groups = {"group1","grup2"})
    public void yanlisKullanici() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("gt_signUp_url"));
        GlbHomePage glbHomePage=new GlbHomePage();
        glbHomePage.signInButonu.click();
        glbHomePage.mail.sendKeys(ConfigReader.getProperty("gt_invalid_email"));
        glbHomePage.password.sendKeys((ConfigReader.getProperty("gt_pasword")));
        Thread.sleep(3000);
        glbHomePage.loginButonu.click();
        Thread.sleep(3000);

        Assert.assertTrue(glbHomePage.girisBasarisiz.getText().contains(ConfigReader.getProperty("gt_giris_basarisiz_yazi")));
        Driver.closeDriver();
    }
    @Test(groups = {"group1","grup2","grup3"})
    public void yanlisSifreVeKullanici() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("gt_signUp_url"));
        GlbHomePage glbHomePage=new GlbHomePage();
        glbHomePage.signInButonu.click();
        glbHomePage.mail.sendKeys(ConfigReader.getProperty("gt_invalid_email"));
        glbHomePage.password.sendKeys((ConfigReader.getProperty("gt_wrong_pass")));
        Thread.sleep(3000);
        glbHomePage.loginButonu.click();
        Thread.sleep(3000);

        Assert.assertTrue(glbHomePage.girisBasarisiz.getText().contains(ConfigReader.getProperty("gt_giris_basarisiz_yazi")));
        Driver.closeDriver();
    }


}