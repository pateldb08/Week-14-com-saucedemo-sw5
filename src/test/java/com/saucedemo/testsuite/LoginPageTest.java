package com.saucedemo.testsuite;

import com.saucedemo.pages.LoginPage;
import com.saucedemo.pages.ProductPage;
import com.saucedemo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {

    ProductPage productPage;   // declare variable
    LoginPage loginPage;

    @BeforeMethod(groups = {"smoke","regression","sanity"})
    public void inIt(){
        productPage = new ProductPage();     // initialize object
        loginPage = new LoginPage();

    }

    @Test(groups = {"sanity","regression"})
    public void verifyuserSholdLoginSuccessfullyWithValidCredentials() {
        loginPage.enterUserName("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickOnLoginButton();
        String expectedText = "Products";
        // String actualText = productPage.getProductText();
        Assert.assertEquals(expectedText, productPage.getProductText());

    }

    @Test(groups = {"smoke","regression"})
    public void verifyThatSixProductsAreDisplayedOnPage() {
        loginPage.enterUserName("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickOnLoginButton();
       // productPage.numberOfProducts(6);

    }

}
