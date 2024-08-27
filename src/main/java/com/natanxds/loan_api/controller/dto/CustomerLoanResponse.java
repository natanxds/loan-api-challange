package com.natanxds.loan_api.controller.dto;

import java.util.List;

public record CustomerLoanResponse(String customerName, List<LoanResponse> loans) {
}
