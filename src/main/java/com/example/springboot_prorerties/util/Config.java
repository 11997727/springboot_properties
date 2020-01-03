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
 * @date 2020/1/3 星期五 23:49
 */
@ConfigurationProperties(prefix="stu")
@Configuration
@Data
public class Config {
    private String name;
    private Integer age;
}
