package cn.yjh.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yW0041229
 * @since 2021/9/3 10:24
 */
@RestController
@RequestMapping("/provider")
public class ProviderController {

    @GetMapping("/update")
    public String update(){
        return "update success";
    }
}
