package com.evernote.accountservice.service.impl;

import com.evernote.accountservice.domain.Account;
import com.evernote.accountservice.repository.AccountRepository;
import com.evernote.accountservice.service.AccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

@Service
@Slf4j
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountRepository accountRepository;

    /**
     * {@inheritDoc}
     */
    @Override
    public Account findByName(String userName) {
        return accountRepository.findByUsername(userName);
    }

    @Override
    public Account create(Account account) {
        Account existing = accountRepository.findByUsername(account.getUsername());
        Assert.isNull(existing, "account already exists: " + account.getUsername());
//
//        authClient.createUser(account);
//
//        Account account = new Account();
//        account.setUsername(account.getUsername());
//        account.setLastSeen(new Date());
//        account.setSaving(saving);
        accountRepository.save(account);

        log.info("new account has been created: " + account.getUsername());

        return account;
    }
}
