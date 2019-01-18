package com.myhttp.controller;

import com.myhttp.model.Msg;
import com.myhttp.model.SysUser;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/index")
    public String index(Model model) {
//        Msg msg = new Msg("标题", "内容", "额外信息，只对管理员显示");
//        model.addAttribute("msg", msg);
//        SysUser user = (SysUser) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
//        model.addAttribute("user",user);
        return "index";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/login-error")
    public String loginError(Model model) {
        model.addAttribute("loginError",true);
        model.addAttribute("errorMsg","登录失败，用户名或者密码错误");
        return "login";
    }

}