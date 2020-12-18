package com.techproed.pages;

import com.techproed.utilities.Driver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class GlbSignUpPage {

    public GlbSignUpPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }


}
