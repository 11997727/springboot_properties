package com.example.springboot_prorerties.util;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author 吴成卓
 * @version V1.0
 * @Project: springboot_prorerties
 * @Package com.example.springboot_prorerties.util
 * @Description:
 * @date 2020/1/4 星期六 00:06
 */
@Data
@ConfigurationProperties(prefix = "student")
@Configuration
//@PropertySource("classpath:test.properties")
public class Config2 {
    private String name;
    private Integer age;
}
