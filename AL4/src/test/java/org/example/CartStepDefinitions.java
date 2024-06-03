package org.example;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CartStepDefinitions {

    private Cart cart;

    @Autowired
    public CartStepDefinitions() {
        this.cart = new Cart();
    }

    @Given("an empty cart")
    public void anEmptyCart() {
        this.cart = new Cart();
    }

    @When("I add a product {string} with price {double}")
    public void iAddAProductWithPrice(String name, double price) {
        Product product = new Product(name, price);
        cart.addProduct(product);
    }

    @Then("the total should be {double}")
    public void theTotalShouldBe(double expectedTotal) {
        assertEquals(expectedTotal, cart.getTotal());
    }
}
