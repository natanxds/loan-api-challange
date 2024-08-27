package com.natanxds.loan_api;

import com.natanxds.loan_api.domain.Customer;

public class TestHelper {

    public static Customer createCustomer() {
        return new Customer(18, "123.456.789-09", "Natan", 3000.0, "SP");
    }

    public static Customer createCustomer(Double income, String location, Integer age) {
        return new Customer(age, "123.456.789-09", "Natan", income, location);
    }

}
