package com.su.gitmesage.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @author SuZuQi
 * @title: GitMessageProperties
 * @projectName gitmesage
 * @description: TODO
 * @date 2020/10/10
 */
@Component("gits")
@ConfigurationProperties(prefix = "gits")
@PropertySource("classpath:gitmessage.properties")
@Data
public class GitMessageProperties {

    private String tags ;

    private String branch ;

    private String dirty ;

    private String originUrl ;

    private String commitId ;

    private String userEmail ;

    private String message ;

    private String userName ;

    private String commitTime  ;




}
