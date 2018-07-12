package com.evernote.accountservice.service;

import com.evernote.accountservice.domain.Account;

public interface AccountService {

    /**
     * Finds account by given name
     *
     * @param accountName
     * @return found account
     */
    Account findByName(String accountName);

    /**
     * Checks if account with the same name already exists
     * Invokes Auth Service user creation
     * Creates new account with default parameters
     *
     * @param account
     * @return created account
     */
    Account create(Account account);

}
