package com.su.gitmesage.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author SuZuQi
 * @title: GitProperties
 * @projectName gitmesage
 * @description: TODO
 * @date 2020/10/10
 */
@Component
@ConfigurationProperties(prefix = "git")
@Data
public class GitProperties {

    private String tags ;

    private String branch ;

    private String dirty ;

    private String orginUrl ;

    private String commitId ;

    private String userEmail ;

    private String message ;

    private String userName ;

    private String comitTime  ;




}
