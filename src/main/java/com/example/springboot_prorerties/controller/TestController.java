package com.example.springboot_prorerties.controller;

import com.example.springboot_prorerties.util.Config;
import com.example.springboot_prorerties.util.Config2;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author 吴成卓
 * @version V1.0
 * @Project: springboot_prorerties
 * @Package com.example.springboot_prorerties.controller
 * @Description:
 * @date 2020/1/3 星期五 23:53
 */
@Controller
public class TestController {

    @Value("${sname}")
    private String sname;
    @Value("${sage}")
    private int sage;
    @Value("${str}")
    private String str;




    @Resource
    private Config config;


    @Resource
    private Config2 config2;

    @RequestMapping("/init1")
    @ResponseBody
    public String show1(){
       return config.getName()+" "+config.getAge();
    }

    @RequestMapping("/init2")
    @ResponseBody
    public String show2(){
        return sname+" "+sage+" "+str;
    }

    @RequestMapping("/init3")
    @ResponseBody
    public String show3(){
        return config2.getName()+" "+config2.getAge();
    }
}
