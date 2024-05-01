package org.example;


import org.openqa.selenium.By;
import org.testng.Assert;

public class ShoppingCartPage extends Utils {

    LoadProp loadProp = new LoadProp();
    //verifying expected add to cart matches with product present in shopping cart

    String expectedMsg = "Build your owner computer n" +
            "Processor: 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00]\n" +
            "RAM: 4GB [+$20.00]\n" +
            "HDD: 400 GB [+$100.00]\n" +
            "OS: Vista Home [+$50.00]\n" +
            "Software: Microsoft Office [+$50.00]";

    String actualMsg = getTextFromElement(By.xpath("//a[@class='product-name']"));


    public void verifyShoppingCartPage() {
        //      Assert.assertEquals(getTextFromElement(By.xpath("//div[@class='attributes']")), loadProp.getProperty("expectedResultForComputer"));
        Assert.assertEquals(actualMsg, expectedMsg, "Different Product");
    }
}
