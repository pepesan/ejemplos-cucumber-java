package com.cursosdedesarrollo.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NuevaSteps {
    @Given("dado tal")
    public void dadoTal() {
        System.out.println("Dado tal");
    }

    @When("hago al cosa")
    public void hagoAlCosa() {
        System.out.println("Hago al cosa");
    }

    @Then("pasa esto")
    public void pasaEsto() {
        System.out.println("Pasa esto");
    }
}
