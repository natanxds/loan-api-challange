package com.natanxds.loan_api.service;

import com.natanxds.loan_api.controller.dto.CustomerLoanRequest;
import com.natanxds.loan_api.controller.dto.CustomerLoanResponse;
import com.natanxds.loan_api.controller.dto.LoanResponse;
import com.natanxds.loan_api.domain.Loan;
import com.natanxds.loan_api.domain.LoanType;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LoanService {

    public CustomerLoanResponse checkLoanAvailability(CustomerLoanRequest loanRequest) {
        var customer = loanRequest.toCustomer();
        var loan = new Loan(customer);

        List<LoanResponse> loans = new ArrayList<>();

        if (loan.isPersonalLoanAvailable()) {
            loans.add(new LoanResponse(LoanType.PERSONAL, loan.getPersonalLoanInterestRate()));
        }

        if (loan.isGuaranteedLoanAvailable()) {
            loans.add(new LoanResponse(LoanType.GUARANTEED, loan.getGuaranteedLoanInterestRate()));
        }

        if (loan.isConsigmentLoanAvailable()) {
            loans.add(new LoanResponse(LoanType.CONSIGNMENT, loan.getConsigmentLoanInterestRate()));
        }

        return new CustomerLoanResponse(loanRequest.name(), loans);
    }

}
