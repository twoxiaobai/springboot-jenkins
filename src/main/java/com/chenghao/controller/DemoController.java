package com.chenghao.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName DemoController
 * @Description
 * @Author hao.chenghao
 * @Date 2020/9/3 9:49
 * @Version 1.0
 */
@RestController
public class DemoController {


    @GetMapping("/getSetting")
    public String setting() {
        return "22222";
    }
}
