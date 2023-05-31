package com.example.transactions;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.stereotype.Service;

@Service //Is the same as @Component, but just for readability
public class TransactionService {

    private final TransactionRepository transactionRepository;

    public TransactionService(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    public List<Transaction> getAllTransactions() {
        return transactionRepository.findAll();
    }

    public void createTransaction(Transaction transaction) {
        transactionRepository.save(transaction);
        System.out.println("transaction" + transaction.toString());
    }

    public void initTransactions() {
        transactionRepository.save(new Transaction(LocalDate.of(2000, Month.JANUARY, 5), 34.0, "dddd" + String.valueOf(23)));
        transactionRepository.save(new Transaction(LocalDate.of(2001, Month.FEBRUARY, 6), 35.0, "cc" + String.valueOf(23)));
        transactionRepository.save(new Transaction(LocalDate.of(2001, Month.MARCH, 7), 36.0, "ff" + String.valueOf(23)));
    }


}