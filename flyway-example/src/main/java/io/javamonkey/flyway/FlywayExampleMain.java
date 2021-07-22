package io.javamonkey.flyway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"io.javamonkey"})
@EntityScan(basePackages = {"io.javamonkey" })
@EnableJpaRepositories(basePackages = {"io.javamonkey"})
public class FlywayExampleMain
{
	public static void main(String[] args){
		SpringApplication.run(FlywayExampleMain.class, args);
	}
}
