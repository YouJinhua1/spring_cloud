package cn.yjh.consumer;

import org.springframework.cloud.openfeign.FeignClient;

import cn.yjh.consumer.config.ConsumerConfig;

/**
 * @author yW0041229
 * @since 2021/9/3 10:27
 */
@FeignClient(name = "SERVICE-CONSUMER",path = "/consumer",configuration = ConsumerConfig.class)
public interface ConsumerAPI {
}
