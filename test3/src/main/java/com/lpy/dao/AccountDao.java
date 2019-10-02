package com.lpy.dao;

import com.lpy.pojo.Account;

import java.util.List;

public interface AccountDao {
    List<Account> findAllAccount();

}
