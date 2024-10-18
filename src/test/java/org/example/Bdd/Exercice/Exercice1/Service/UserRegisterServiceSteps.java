package org.example.Bdd.Exercice.Exercice1.Service;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class UserRegisterServiceSteps {

    private UserRegisterService userRegisterService;

    @Given("User access register form")
    public void user_access_register_form() {
        userRegisterService = new UserRegisterService();
    }

    @When("Given User who want to register")
    public void given_user_who_want_to_register() {
        userRegisterService.setAccess(true);
    }

    @Then("User can access to register page")
    public void user_can_access_to_register_page() {
        Assert.assertTrue(userRegisterService.getAccess());
    }

    @When("Given User who want to register")
    public void given_user_who_want_to_register() {
        userRegisterService.setUsername("test");
        userRegisterService.setPassword("test");
        userRegisterService.setEmail("test@test.com");
    }

    @Then("User give his informations")
    public void user_can_access_to_register_page() {
        Assert.assertTrue(userRegisterService.getAllInfos());
    }

    @When("Given User who want to register")
    public void given_user_who_want_to_register() {
        userRegisterService.setUsername("test");
        userRegisterService.setPassword("test");
        userRegisterService.setEmail("test@test.com");
    }

    @Then("User give his informations")
    public void user_can_access_to_register_page() {
        Assert.assertTrue(userRegisterService.getAllInfos());
    }


    //
    //  Scenario: User account create
    //    Given User who want to register
    //    When all User informations are here
    //    Then User get confirm
    //
    //  Scenario: Error while creating account
    //    Given User who want to register
    //    When a username already exist
    //    Then User get error
}

