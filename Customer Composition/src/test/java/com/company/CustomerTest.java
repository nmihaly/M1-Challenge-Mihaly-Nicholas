package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerTest {
    Address billingAddress;
    Address shippingAddress;
    Customer customer;
    @Before
    public void setUp() throws Exception {
        billingAddress = new Address("901 Long st","Unit A", "Denver",
                "CO", "09809");
        shippingAddress = new Address("222 short st", "Unit C", "Los Angeles",
                "CA", "90028");
        customer = new Customer("Nick", "Mihaly", "nick@email.com",
                "1-(234)567-8910",
                shippingAddress,  billingAddress, false);
    }

    @Test
    public void shouldReturnShippingAddress() {
        customer.getShippingAddress();
        assertEquals(shippingAddress, customer.getShippingAddress());
    }

    @Test
    public void shouldReturnBillingAddress() {
        customer.getBillingAddress();
        assertEquals(billingAddress, customer.getBillingAddress());
    }

    @Test
    public void shouldReturnIfCustomerIsARewardsMember(){
        customer.isRewardsMember();
        assertEquals(false, customer.isRewardsMember());
    }

}