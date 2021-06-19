package com.example.thienan.controller;

import com.example.thienan.entities.AccountsEntity;
import com.example.thienan.serverInplement.LoginService;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {

    @Autowired
    private LoginService loginService;

    @Autowired
    HttpSession session;

    @GetMapping("login")
    public String showPageLogin(){
        return "login";
    }


    
    @PostMapping("/login")
    public String checkLogin(ModelMap model, @RequestParam("username")String user, @RequestParam("password")String pass){

        AccountsEntity accountsEntity = loginService.login(user,pass);

        if (accountsEntity == null){
            model.addAttribute("message","Tài khoản không tồn tại");
            return "login";
        }else if(!pass.equals(accountsEntity.getEncrytedPassword()) ){
               model.addAttribute("message","Sai mật khẩu");
            return "login";
        }else if(pass.equals(accountsEntity.getEncrytedPassword())){
            session.setAttribute("user",accountsEntity);
            model.addAttribute("user",accountsEntity);
            return "index";
        }
        return "login";
    }

}
