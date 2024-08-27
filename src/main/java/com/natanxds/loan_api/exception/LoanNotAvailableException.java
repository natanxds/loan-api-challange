package com.natanxds.loan_api.exception;

public class LoanNotAvailableException extends RuntimeException {

    public LoanNotAvailableException(String message) {
        super(message);
    }
}
