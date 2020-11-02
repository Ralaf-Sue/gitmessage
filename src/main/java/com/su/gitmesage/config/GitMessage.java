package com.su.gitmesage.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @author SuZuQi
 * @title: GitMessageProperties
 * @projectName gitmesage
 * @description: TODO
 * @date 2020/10/10
 */
@Component
@PropertySource(value = "classpath:git.properties",encoding="UTF-8")
@Data
public class GitMessage {

}
