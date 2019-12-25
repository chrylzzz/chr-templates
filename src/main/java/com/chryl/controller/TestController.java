package com.chryl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Chryl on 2019/12/22.
 */
@Controller
@RequestMapping("/admin")
public class TestController {

    /**
     * 不用templates
     */
    @RequestMapping("/hello")
    public String show() {
        System.out.println("1");

        return "hello";
    }

    //不用templates , return 前 也需要/
    @RequestMapping("/cmcc")
    public String cmcc() {
        System.out.println("cmcc");

        return "/cmcc.html";
    }

    //请求转发的,在admin基础上打开index.html
    @GetMapping("/index1")
    public String index1() {
        System.out.println("index1");
        return "/index.html";
    }

    //重定向到html
    @GetMapping("/index")
    public String index() {
        System.out.println("index");
        return "redirect:/index.html";
    }
    /**
     * 不用templates
     */
    //
    //
    //
    //

    /**
     * templates
     */
    //templates重定向到static的index.html
    //template->static: 需要加html
    @GetMapping("/indextemp")
    public String indextemp() {
        System.out.println("index");
        return "redirect:/index.html";
    }
    @GetMapping("/index-temp")
    public String indextemplate() {
        System.out.println("index-temp");
        return "/indextem";
    }

    //templates
    @RequestMapping("/hello2")
    public ModelAndView show2() {
        ModelAndView modelAndView = new ModelAndView();

        modelAndView.setViewName("hello");
        modelAndView.addObject("key", 12345);
        return modelAndView;

    }

    //地址栏跳转
    @RequestMapping("/ck1")
    public String ck1(Model model) {
        System.out.println("ck1");
//        return "ck1";
        return "ck1";

    }

    @RequestMapping("/ck2")
    public String ck2() {
        System.out.println("ck2");
        return "ck1";
//        return "redirect:ck1";

    }

    //前->后->前:return 前面需要有/
    @RequestMapping("/ck22")
    public String ck22() {
        System.out.println("ck22");
        return "/ck2";
    }

    @RequestMapping("/ck11")
    public String ck11() {
        System.out.println("ck11");
        return "/ck1";
    }
    /**
     * templates
     */
}
