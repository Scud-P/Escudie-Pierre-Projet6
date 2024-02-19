package com.oc.buddytest.test.repository;

import com.oc.buddytest.test.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {

}
