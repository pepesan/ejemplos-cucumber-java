package com.cursosdedesarrollo.steps;

import com.cursosdedesarrollo.Calculadora;
import io.cucumber.java.en.*;

import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraSteps {
    private Calculadora calculadora;

    @Given("que tengo una calculadora")
    public void que_tengo_una_calculadora() {
        calculadora = new Calculadora();
    }

    @Given("que el valor inicial es {int}")
    public void que_el_valor_inicial_es(Integer valor) {
        calculadora.setValor(valor);
    }

    @When("sumo {int}")
    public void sumo(Integer n) {
        calculadora.sumar(n);
    }

    @When("resto {int}")
    public void resto(Integer n) {
        calculadora.restar(n);
    }

    @When("multiplico por {int}")
    public void multiplico_por(Integer n) {
        calculadora.multiplicar(n);
    }

    @Then("el resultado debe ser {int}")
    public void el_resultado_debe_ser(Integer esperado) {
        assertEquals(esperado, calculadora.getValor());
    }
}
