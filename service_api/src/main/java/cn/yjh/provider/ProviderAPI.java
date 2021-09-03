package cn.yjh.provider;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author yW0041229
 * @since 2021/9/3 10:27
 */
@FeignClient(name = "SERVICE-PROVIDER",path = "/provider",contextId = "providerController")
public interface ProviderAPI {

    @GetMapping("/update")
    public String update();
}
