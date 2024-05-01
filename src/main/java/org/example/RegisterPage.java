package org.example;

import org.openqa.selenium.By;

import static java.lang.Math.random;

public class RegisterPage extends Utils {

    //to generate random email each time we run the test
    static String email = "Don" + random() + "@gmail.com";

    //enter registration details
    public void enterRegistrationDetails() {

        typeIn(By.id("FirstName"), "TestFirst");
        typeIn(By.id("LastName"), "TestLast");
        typeIn(By.id("Email"), email);
        typeIn(By.name("Password"), "test1234");
        typeIn(By.name("ConfirmPassword"), "test1234");
        clickOnElement(By.id("register-button"));
    }
}
