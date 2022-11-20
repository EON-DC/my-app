package com.mycompany.app;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@AllArgsConstructor
public class FraudCheckService {

    private final FraudCheckHistoryRepository fraudCheckHistoryRepository;


    public boolean isFraudulentCustomer(Integer customId){
        fraudCheckHistoryRepository.save(
                FraudCheckHistory.builder()
                        .customerId(customId)
                        .isFraudster(false)
                        .createdAt(LocalDateTime.now())
                        .build()
        );
        return false;
    }


}
