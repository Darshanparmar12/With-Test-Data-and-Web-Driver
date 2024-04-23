package org.example;

import org.testng.annotations.Test;


public class TestSuite extends BaseTest {


    HomePage homePage = new HomePage();

    RegisterPage registerPage = new RegisterPage();

    BuildYourOwnSelection buildYourOwnSelection = new BuildYourOwnSelection();


    RegisterResultPage registerResultPage = new RegisterResultPage();

    ReferAFriendProducts referAFriend = new ReferAFriendProducts();

    @Test
    public void verifyUserShouldAbleToRegisterSuccessfully() {
        //click on register button
        homePage.clickOnRegisterButton();

        //enter registration details
        registerPage.enterRegistrationDetails();
        //verify
        registerResultPage.verifyUserRegisteredSuccessfully();


    }

    @Test
    public void verifyRegisteredUserShouldLogin() {
//user login

        homePage.logInUser();
    }

    @Test
    public void verifyRegisteredUserShouldReferAProduct() {
        homePage.logInUser(); //log in from login details previously used
        referAFriend.referAProductComputer(); //Camera-photo product referral in this case.
        emailAFriend(); //emailing a friend

    }

    @Test
    public void verifyBuildMyOwnComputerSuccessful() {
        //open product from homepage
        homePage.clickOnBuildMyOwnComputer();//
        // selecting second option of the selected product to be added in cart
        buildYourOwnSelection.computerAdding();
        // adding selected product to cart.
        addToCart();
        //verifying same product in shopping cart.
        shoppingCart();

    }

}
