package com.lpy.service;


import com.lpy.pojo.Account;
import com.lpy.pojo.AccountInfo;

import java.util.List;

public interface AccountService {

    List<Account> findAllAccount();

    int updateAccount(AccountInfo accountInfo);

    Account findAccountById(int x);

    int updateAccount2(AccountInfo accountInfo);
}
