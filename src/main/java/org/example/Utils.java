package org.example;

import org.junit.Assert;
import org.openqa.selenium.By;

public class Utils extends BasePage {

    //any reusable method will come here
    public static void clickOnElement(By by) {

        driver.findElement(by).click();
    }

    public static void typeIn(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }

    public static String getTextFromElement(By by) {
        return driver.findElement(by).getText();

    }

    public static void verifyURLContains(String url) {
        Assert.assertTrue(driver.getCurrentUrl().contains(url));
    }

    public static void addToCart() {
        //adding here since it will be required more in future.
        clickOnElement(By.id("add-to-cart-button-1"));
    }

//to reuse shopping cart
    public static void shoppingCart() {
        clickOnElement(By.className("cart-label"));
    }

    // to email a friend every now and then.
    public static void emailAFriend() {   //created to use this method for other products
        clickOnElement(By.className("email-a-friend"));
        typeIn(By.id("FriendEmail"), ("a123@gmail.com"));
        clickOnElement(By.id("YourEmailAddress"));
        clickOnElement(By.xpath("//button[@class='button-1 send-email-a-friend-button']"));
    }

}
