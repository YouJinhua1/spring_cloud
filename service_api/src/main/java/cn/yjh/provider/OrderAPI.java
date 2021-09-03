package cn.yjh.provider;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author yW0041229
 * @since 2021/9/3 11:25
 */
@FeignClient(name = "SERVICE-PROVIDER",path = "/order",contextId = "orderController")
public interface OrderAPI {

    @GetMapping("/getOrder")
    public String getOrder();
}
