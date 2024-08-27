package com.natanxds.loan_api.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

    private Integer age;
    private String cpf;
    private String name;
    private Double income;
    private String location;


    public boolean isIncomeEqualOrLowerThan(double amount) {
        return income <= amount;
    }

    public boolean isIncomeBetween(double min, double max) {
        return income >= min && income <= max;
    }

    public boolean isAgeLowerThan(Integer value) {
        return this.age < value;
    }

    public boolean isFromLocation(String location) {
        return this.location.equalsIgnoreCase(location);
    }

    public boolean isIncomeEqualOrHigherThan(double amount) {
        return income >= amount;
    }
}
