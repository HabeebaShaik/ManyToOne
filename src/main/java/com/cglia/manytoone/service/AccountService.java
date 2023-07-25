package com.cglia.manytoone.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cglia.manytoone.model.Account;
import com.cglia.manytoone.repository.AccountRepository;

@Service
public class AccountService {
    @Autowired
    private AccountRepository accountRepository;

    public List<Account> getAllAccounts() {
        return accountRepository.findAll();
    }

    public Account getAccountById(int accountId) {
        return accountRepository.findById(accountId).orElse(null);
    }

    public Account createAccount(Account account) {
        return accountRepository.save(account);
    }

    public Account updateAccount(int accountId, Account updatedAccount) {
        Account existingAccount = accountRepository.findById(accountId).orElse(null);
        if (existingAccount != null) {
            existingAccount.setAccountNumber(updatedAccount.getAccountNumber());
            existingAccount.setFullName(updatedAccount.getFullName());
            existingAccount.setBalance(updatedAccount.getBalance());
            existingAccount.setBranch(updatedAccount.getBranch());
            return accountRepository.save(existingAccount);
        }
        return null;
    }

    public void deleteAccount(int accountId) {
        accountRepository.deleteById(accountId);
    }
}
