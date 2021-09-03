package cn.yjh.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yW0041229
 * @since 2021/9/3 11:26
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @GetMapping("/getOrder")
    public String getOrder(){
        return "get order";
    }
}
