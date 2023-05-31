package com.example.transactions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TransactionsApplication {

	public static void main(String[] args) {
		SpringApplication.run(TransactionsApplication.class, args);
	}


// @Service //Is the same as @Component, but just for readability
// public class TransactionService {
//     public List<Transaction> getTransactions() {
// 		return List.of(new Transaction(
// 				LocalDate.of(2000, Month.JANUARY, 5),
// 				34.0,
// 				"dddd" + String.valueOf(23))
// 			);
// 	}
// }


}
