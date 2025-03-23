package com.example.consumerbe.infrastructure.repository;

import com.example.consumerbe.domain.repository.RuleState;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.redisson.api.RedissonClient;
import org.springframework.stereotype.Repository;

@Slf4j
@Repository
@RequiredArgsConstructor
public class RuleStateImpl implements RuleState {
    private final RedissonClient redisClient;

    @Override
    public void addTransaction(String accountNumber, String transactionId, Long timestamp) {

    }

    @Override
    public Integer countTransactionsInRange(String accountNumber, Long from, Long to) {
        return 0;
    }

    @Override
    public void removeTransactionsBefore(String accountNumber, Long timestamp) {

    }
}
