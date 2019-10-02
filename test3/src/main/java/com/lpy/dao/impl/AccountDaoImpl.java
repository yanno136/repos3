package com.lpy.dao.impl;

import com.lpy.dao.AccountDao;
import com.lpy.pojo.Account;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.util.List;

public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {

    @Override
    public List<Account> findAllAccount() {

        List<Account> list = this.getJdbcTemplate().query("select * from account", new BeanPropertyRowMapper<Account>(Account.class));
        System.out.println(list);
        return list;
    }
}
