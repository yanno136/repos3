package com.lpy.controller;


import com.lpy.pojo.Account;
import com.lpy.pojo.AccountInfo;
import com.lpy.service.AccountService;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountController {
    @Autowired
    AccountService accountService;
    @RequestMapping("/accountList")
    public String findAllAccount(Model model) {
        List<Account> accountList = accountService.findAllAccount();
        Account account1 = accountList.get(0);
        Account account2 = accountList.get(1);
        model.addAttribute("account1",account1);
        model.addAttribute("account2",account2);
        //System.out.println(accountList);
        return "/transfer";
    }
    @RequestMapping("/tranferA")
    @ResponseBody
    public String tranferA(String input1Money,String id1,String id2) {
        int money = Integer.parseInt(input1Money);
        int x = Integer.parseInt(id1);
        int y = Integer.parseInt(id2);


        AccountInfo accountInfo = new AccountInfo();

        Account accountById = accountService.findAccountById(x);
        int money1 = accountById.getMoney();
        if (money1 < money) {
            return "enough";
        }
        accountInfo.setId(x);
        accountInfo.setMoney(money);
        int update2 = accountService.updateAccount2(accountInfo);

        accountInfo.setId(y);
        accountInfo.setMoney(money);
        int update = accountService.updateAccount(accountInfo);


        //int update = accountService.updateAccount(inputMoney1);
        return "success";
    }
    @RequestMapping("/tranferB")
    @ResponseBody
    public String tranferB(String input1Money,String id1,String id2) {
        int money = Integer.parseInt(input1Money);
        int a1 = Integer.parseInt(id1);
        int a2 = Integer.parseInt(id2);

        AccountInfo accountInfo = new AccountInfo();
        Account accountById = accountService.findAccountById(a2);
        int money2 = accountById.getMoney();
        if (money2 < money) {
            return "enough";
        }
        accountInfo.setId(a2);
        accountInfo.setMoney(money);
        int update = accountService.updateAccount2(accountInfo);

        accountInfo.setId(a1);
        int update2 = accountService.updateAccount(accountInfo);





        //int update = accountService.updateAccount(inputMoney1);
        return "success";
    }



}
