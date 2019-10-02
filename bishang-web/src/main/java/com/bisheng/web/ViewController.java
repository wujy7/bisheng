package com.bisheng.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @program: bisheng->ViewController
 * @description:
 * @author: wujy
 * @create: 2019-10-02 19:51
 **/
@Controller
public class ViewController {

    @RequestMapping("/")
    @ResponseBody
    public String view(){
        return "hello word";
    }
}
