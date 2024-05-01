package org.example;

import org.openqa.selenium.By;

public class HomePage extends Utils {

    RegisterPage registerPage = new RegisterPage();


    //create a method to click on Register button
    public void clickOnRegisterButton() {
        clickOnElement(By.linkText("Register"));
    }

    public void logInUser() {
        //creating log in method to use
        clickOnElement(By.className("ico-login"));
        typeIn(By.id("Email"), "abcd@gmail.com");
        typeIn(By.id("Password"), "Test1234");
        clickOnElement(By.xpath("//button[@class='button-1 login-button']"));
    }

    //to navigate to product from home page.
    public void clickOnBuildMyOwnComputer() {
        clickOnElement(By.xpath("//h2[@class='product-title']/a[@href='/build-your-own-computer']"));


    }

}
