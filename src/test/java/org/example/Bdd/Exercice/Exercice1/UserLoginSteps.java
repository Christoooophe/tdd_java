package org.example.Bdd.Exercice.Exercice1;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Bdd.Exercice.Exercice1.Exceptions.WrongPasswordException;
import org.example.Bdd.Exercice.Exercice1.Model.User;
import org.example.Bdd.Exercice.Exercice1.Repository.UserRepository;
import org.example.Bdd.Exercice.Exercice1.Service.UserService;
import org.junit.Assert;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

public class UserLoginSteps {
    private UserRepository userRepository;
    private UserService userService;
    private String message;
    private User user;

    @Given("A User try to connect")
    public void loginAUser() {
        user = new User();
        userRepository = Mockito.mock(UserRepository.class);
        userService = new UserService(userRepository);
    }

    @When("A User send is {string} and {string}")
    public void loginAUserSend(String username, String userPassword) {
        user.setUsername(username);
        user.setPassword(userPassword);
    }

    @And("the User is log to the app")
    public void loginAUserIsLogToTheApp() {
        List<User> users = new ArrayList<>();
        users.add(new User("root@test.com", "root", "root"));
        Mockito.when(userRepository.findByName(user.getUsername())).thenReturn(users);
        message = userService.login(user);
    }

    @Then("there is a message of validation")
    public void loginAMessageOfValidation() {
        Assert.assertEquals("Connection Successful", userService.login(user));
    }

    @When("A user send is {string} and {string}")
    public void loginAUserWhoNotExists(String username, String userPassword) {
        user.setUsername(username);
        user.setPassword(userPassword);
    }

    @Then("there is an error messsage")
    public void loginAMessageOfError() {
        Assert.assertEquals("wrong username or password", userService.login(user));
    }


    @When("A User send is {string} and bad password {string}")
    public void loginAUserSendIsIs(String username, String userPassword) {
        user.setUsername(username);
        user.setPassword(userPassword);
    }

    @Then("there is an error for the password")
    public void loginAErrorMessageOfValidation() {
        //J'ai une erreur comme quoi rien n'est throw, je ne comprends pas pourquoi
        Assert.assertThrows(WrongPasswordException.class, () -> userService.login(user));
    }

}
