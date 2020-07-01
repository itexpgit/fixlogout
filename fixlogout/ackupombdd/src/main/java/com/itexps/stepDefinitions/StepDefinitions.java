/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itexps.stepDefinitions;

import com.itexps.pages.CartPage;
import com.itexps.pages.CheckOutPage;
import com.itexps.pages.LocationPage;
import com.itexps.pages.LoginPage;
import com.itexps.pages.LogoutPage;
import com.itexps.pages.ProductsPage;
import com.itexps.util.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

/**
 *
 * @author Uma
 */
public class StepDefinitions extends BaseClass {
    LoginPage loginpage;
    LocationPage locationpage;
    ProductsPage productspage;
    CartPage cartpage;
    CheckOutPage checkoutpage;
    LogoutPage logoutpage;
    
    @Given("^user opens browser$")
public void user_opens_browser() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    BaseClass.initialization();
}

@When("^user is on login page$")
public void user_is_on_login_page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    loginpage = new LoginPage();
    String loginpagetitle = loginpage.validateLoginPageTitle();
    Assert.assertEquals(prop.getProperty("title"), loginpagetitle);
}

@Then("^user enters emailid password and submit button$")
public void user_enters_emailid_password_and_submit_button() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    loginpage.login(prop.getProperty("emailid"), prop.getProperty("password"));
}

@Then("^user selects location and mainmenu$")
public void user_selects_location_and_mainmenu() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    locationpage = new LocationPage();
    locationpage.LocationPage();
}

@Then("^user logoff web application$")
public void user_logoff_web_application() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    logoutpage = new LogoutPage();
    logoutpage.LogoutPage();
}
    
}

    

