package com.techproed.tests;

import com.techproed.utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class D14_KeyboardActions3 extends TestBase {
    @Test
    public void iFrameTest() throws InterruptedException {
        driver.get("https://html.com/tags/iframe/");
        //1.adim iFrame'e nasil gecis yapacagimiza(switch) karar veririz
        //  index,id,webElement olarak locate ederiz
        //  biz bu soruda 3.yolu tercih ettik
        Thread.sleep(2000);
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN).perform();
        WebElement iFrame = driver.findElement(By.xpath("//iframe[@class='lazy-loaded']"));
        // 2. adim iFrame'e switchTo() ile gecis yapiyoruz
        driver.switchTo().frame(iFrame);
        // 3. adim : iframe icinde istedigimiz WebElementinini locate edip istedigimiz islemi yapabiliriz
        driver.findElement(By.xpath("//button[@class='ytp-large-play-button ytp-button']")).click();

    }
}