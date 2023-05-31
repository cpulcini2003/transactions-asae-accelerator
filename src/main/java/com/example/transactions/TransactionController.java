package com.example.transactions;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "app1/v1")
public class TransactionController {


	@Value("${spring.application.name}")
	private String appName;

	@Value("${spring.profiles.active}")
	private String activeProfile;

	@Value("${spring.datasource.url}")
	private String dataSourceUrl;

	@Value("${spring.datasource.username}")
	private String dataSourceUser;

	@Value("${spring.datasource.password}")
	private String dataSourcePassword;



	private TransactionService transactionService;

    //@Autowired //TransactionService is automatically instantiated and Injected
    public TransactionController(TransactionService transactionService) {
		this.transactionService = transactionService;
	}

	@RequestMapping("/env")
    public String home() {
        return "app name: " + appName + " - active profile: " + activeProfile + " - DB url: " + dataSourceUrl + "; username: " + dataSourceUser + "; password: " + dataSourcePassword;
    }

	@GetMapping(value = "/transactions")  
	public List<Transaction> getAllTransactions() {

		return this.transactionService.getAllTransactions();

	}

	@GetMapping(value = "/init")  
	public void initTransactions() {

		this.transactionService.initTransactions();

	}

	@PostMapping(value = "/addTransaction")  
	public void createTransaction(@RequestBody Transaction transaction) {

		this.transactionService.createTransaction(transaction);

	}

}
