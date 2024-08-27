package com.natanxds.loan_api.controller;

import com.natanxds.loan_api.controller.dto.CustomerLoanRequest;
import com.natanxds.loan_api.controller.dto.CustomerLoanResponse;
import com.natanxds.loan_api.service.LoanService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/loans")
public class LoanController {

    private final LoanService loanService;

    public LoanController(LoanService loanService) {
        this.loanService = loanService;
    }


    @PostMapping
    public ResponseEntity<CustomerLoanResponse> getCustomerLoans(@RequestBody @Valid CustomerLoanRequest request) {

        var loanResponse = loanService.checkLoanAvailability(request);
        return ResponseEntity.ok(loanResponse);
    }


}
