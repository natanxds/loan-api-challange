package com.natanxds.loan_api.controller.dto;

import com.natanxds.loan_api.domain.LoanType;

public record LoanResponse(LoanType type, Double interestRate) {
}
