package com.lpy.service.impl;

import com.lpy.dao.AccountDao;
import com.lpy.mapper.AccountMapper;
import com.lpy.pojo.Account;
import com.lpy.pojo.AccountInfo;
import com.lpy.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    AccountMapper mapper;

    @Autowired
    AccountDao AccountDaoImpl;
    @Override
    public List<Account> findAllAccount() {

        //return mapper.findAllAccount();
        return AccountDaoImpl.findAllAccount();
    }

    @Override
    public int updateAccount(AccountInfo accountInfo) {
        int a = 3/0;
        return mapper.updateAccount(accountInfo);
    }

    @Override
    public Account findAccountById(int x) {

        return mapper.findAccountById(x);
    }

    @Override
    public int updateAccount2(AccountInfo accountInfo) {
        return mapper.updateAccount2(accountInfo);
    }

}
