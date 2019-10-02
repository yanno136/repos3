package com.lpy.mapper;

import com.lpy.pojo.Account;
import com.lpy.pojo.AccountInfo;

import java.util.List;

public interface AccountMapper {

    List<Account> findAllAccount();

    Account findAccountById(int x);

    int updateAccount(AccountInfo accountInfo);

    int updateAccount2(AccountInfo accountInfo);
}
