package com.cglia.manytoone.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cglia.manytoone.model.Account;
import com.cglia.manytoone.service.AccountService;

@RestController
@RequestMapping("/account")
public class AccountController {
	 @Autowired
	    private AccountService accountService;

	    @GetMapping
	    public List<Account> getAllAccounts() {
	        return accountService.getAllAccounts();
	    }

	    @GetMapping("/{id}")
	    public Account getAccountById(@PathVariable int id) {
	        return accountService.getAccountById(id);
	    }

	    @PostMapping
	    public Account createAccount(@RequestBody Account account) {
	        return accountService.createAccount(account);
	    }

	    @PutMapping("/{id}")
	    public Account updateAccount(@PathVariable int id, @RequestBody Account updatedAccount) {
	        return accountService.updateAccount(id, updatedAccount);
	    }

	    @DeleteMapping("/{id}")
	    public void deleteAccount(@PathVariable int id) {
	        accountService.deleteAccount(id);
	    }
}
