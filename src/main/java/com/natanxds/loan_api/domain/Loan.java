package com.natanxds.loan_api.domain;

import com.natanxds.loan_api.exception.LoanNotAvailableException;

public class Loan {

    private Customer customer;

    public Loan(Customer customer) {
        this.customer = customer;
    }

    public boolean isPersonalLoanAvailable() {
        if (customer.isIncomeEqualOrLowerThan(3000.0) ||
                customer.isAgeLowerThan(30) &&
                        customer.isFromLocation("SP") &&
                        customer.isIncomeBetween(3000.00, 5000.00)) {
            return true;
        }
        return false;
    }

    public boolean isConsigmentLoanAvailable() {
        return customer.isIncomeEqualOrHigherThan(5000.0);
    }

    public boolean isGuaranteedLoanAvailable() {
        if (customer.isIncomeEqualOrLowerThan(3000.0) ||
                customer.isAgeLowerThan(30) &&
                        customer.isFromLocation("SP") &&
                        customer.isIncomeBetween(3000.00, 5000.00)) {
            return true;
        }
        return false;
    }

    public double getPersonalLoanInterestRate() {
        if (isPersonalLoanAvailable()) {
            return 4.00;
        }

        throw new LoanNotAvailableException("Loan not available for this customer");
    }

    public double getConsigmentLoanInterestRate() {
        if (isConsigmentLoanAvailable()) {
            return 2.00;
        }

        throw new LoanNotAvailableException("Loan not available for this customer");
    }

    public double getGuaranteedLoanInterestRate() {
        if (isGuaranteedLoanAvailable()) {
            return 3.00;
        }

        throw new LoanNotAvailableException("Loan not available for this customer");
    }

}
