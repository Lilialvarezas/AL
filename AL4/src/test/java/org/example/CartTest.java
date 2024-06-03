package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CartTest {

    private Cart cart;

    @BeforeEach
    public void setUp() {
        cart = new Cart();
    }

    @Test
    public void testAddProductWithoutDiscount() {
        Product product = new Product("Book", 50);
        cart.addProduct(product);
        assertEquals(50, cart.getTotal());
        assertEquals(1, cart.getProductCount());
        assertTrue(cart.getProducts().contains(product));
    }

    @Test
    public void testAddProductWithDiscount() {
        Product product = new Product("Laptop", 150);
        cart.addProduct(product);
        assertEquals(135, cart.getTotal()); // 150 * 0.9 = 135
        assertEquals(1, cart.getProductCount());
        assertTrue(cart.getProducts().contains(product));
    }

    @Test
    public void testRemoveProduct() {
        Product product = new Product("Laptop", 150);
        cart.addProduct(product);
        assertEquals(135, cart.getTotal());
        cart.removeProduct(product);
        assertEquals(0, cart.getTotal());
        assertEquals(0, cart.getProductCount());
        assertTrue(!cart.getProducts().contains(product));
    }

    @Test
    public void testAddMultipleProducts() {
        Product product1 = new Product("Book", 50);
        Product product2 = new Product("Laptop", 150);
        cart.addProduct(product1);
        cart.addProduct(product2);
        assertEquals(185, cart.getTotal()); // 50 + 150 * 0.9 = 185
        assertEquals(2, cart.getProductCount());
        assertTrue(cart.getProducts().contains(product1));
        assertTrue(cart.getProducts().contains(product2));
    }

    @Test
    public void testClearCart() {
        Product product1 = new Product("Book", 50);
        Product product2 = new Product("Laptop", 150);
        cart.addProduct(product1);
        cart.addProduct(product2);
        cart.clear();
        assertEquals(0, cart.getTotal());
        assertEquals(0, cart.getProductCount());
        assertTrue(cart.getProducts().isEmpty());
    }
}
