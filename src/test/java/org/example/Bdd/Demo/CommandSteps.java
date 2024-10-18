package org.example.Bdd.Demo;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CommandSteps {
    private Command command;

    @Given("Customer who want to command stuff for someone : {string}")
    public void customer_who_want_to_command_stuff_for_someone(String string) {
        command = new Command();
        command.setFrom("test");
    }

    @When("a Command is made for someone")
    public void a_Command_is_made_for_someone() {
        command.setTo("json");
    }

    @Then("there is no product in the Command")
    public void there_is_no_product_in_the_Command() {
        Assert.assertTrue(command.getProducts().isEmpty());
    }

    @And("the command come from Customer")
    public void the_command_come_from_Customer() {
        Assert.assertEquals("test", command.getFrom());
    }
}
