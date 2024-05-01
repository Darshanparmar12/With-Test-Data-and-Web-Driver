package org.example;


import org.junit.Assert;
import org.openqa.selenium.By;

public class RegisterResultPage extends Utils {

    // adding assert point for comparison between actual and expected
    String expectedRegisterSuccessMessage = "Your registration completed";


    public void verifyUserRegisteredSuccessfully() {

        //waitUntilElementIsVisible(5);

        Assert.assertEquals(getTextFromElement(By.xpath("//div[@class='result']")), expectedRegisterSuccessMessage);
    }
}
