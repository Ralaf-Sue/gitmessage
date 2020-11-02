package com.su.gitmesage;

import com.su.gitmesage.config.GitMessageProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.info.GitProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@EnableConfigurationProperties
@SpringBootApplication
@RestController
public class GitmesageApplication {

	@Autowired
	private GitMessageProperties gitProperties  ;

	@Value("${gits.commitId}")
	private  String commitId ;



	public static void main(String[] args) {
		SpringApplication.run(GitmesageApplication.class, args);
	}

	@RequestMapping("/hello")
	public GitMessageProperties gitProperties(){
		return gitProperties ;
	}

	@RequestMapping("/hello1")
	public String git(){
		return commitId ;
	}

	@RequestMapping("/test")
	public String  getCommitId(){
		return  gitProperties.getCommitId();
	}

}
