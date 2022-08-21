package com.tostanco.stepDefs;

import com.tostanco.Belly;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class TestExample {


    @Given("^I have (\\d+) cukes in my belly$")
    public void I_have_cukes_in_my_belly(int cukes) throws Throwable {
        Belly belly = new Belly();
        belly.eat(cukes);
    }

    @When("^I wait (\\d+) hour$")
    public void i_wait_hour(int arg1) throws Throwable {
        System.out.println("Waiting, waiting, waiting");
    }

    @Then("^my belly should growl$")
    public void my_belly_should_growl() {
        System.out.println("growl, growl...");
    }

}
