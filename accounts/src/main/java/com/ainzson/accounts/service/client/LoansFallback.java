package com.ainzson.accounts.service.client;

import com.ainzson.accounts.dto.LoansDto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class LoansFallback implements LoansFeignClient{

    @Override
    public ResponseEntity<LoansDto> fetchLoanDetails(String correlationI, String mobileNumber) {
        return null;
    }
}
