package cn.yjh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.yjh.provider.OrderAPI;
import cn.yjh.provider.ProviderAPI;

/**
 * @author yW0041229
 * @since 2021/9/3 10:25
 */
@RestController
@RequestMapping("/consumer")
public class ConsumerController {

    @Autowired
    ProviderAPI providerAPI;
    @Autowired
    OrderAPI orderAPI;

    @GetMapping("/get")
    public String get(){
        System.out.println(providerAPI.update());
        System.out.println(orderAPI.getOrder());
        return "OK";
    }
}
