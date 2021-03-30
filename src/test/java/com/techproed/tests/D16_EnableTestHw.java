package com.techproed.tests;

import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class D16_EnableTestHw extends TestBase {
    //1. Bir class olusturun : EnableTest
    //2. Bir metod olusturun : isEnabled()
    //3. https://the-internet.herokuapp.com/dynamic_controls adresine gidin.
    //4. Textbox'in etkin olmadigini(enabled) dogrulayın
    //5. Enable butonuna tıklayın ve textbox etkin oluncaya kadar bekleyin
    //6. "It's enabled!" mesajinin goruntulendigini dogrulayın.
    //7. Textbox'in etkin oldugunu(enabled) dogrulayın.
    @Test
    public void isEnabled() throws InterruptedException {
        //3. https://the-internet.herokuapp.com/dynamic_controls adresine gidin.
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
        SoftAssert softAssert=new SoftAssert();
        //4. Textbox'in etkin olmadigini(enabled) dogrulayın
        WebElement textBoxEnabledElement=driver.findElement(By.xpath("//input[@type='text']"));
        softAssert.assertFalse(textBoxEnabledElement.isEnabled());
        //5. Enable butonuna tıklayın ve textbox etkin oluncaya kadar bekleyin
        driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
        Thread.sleep(5000);
        //6. "It's enabled!" mesajinin goruntulendigini dogrulayın.
        WebElement enableMesajElementi=driver.findElement(By.xpath("//p[@id='message']"));
        softAssert.assertTrue(enableMesajElementi.isDisplayed());
        //7. Textbox'in etkin oldugunu(enabled) dogrulayın.
        softAssert.assertTrue(textBoxEnabledElement.isEnabled());
    }
}
