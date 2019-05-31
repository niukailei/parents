package com.zuul;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.core.annotation.Order;

@SpringBootApplication
@EnableZuulProxy
public class Application implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }

    @Override
    public void run(String... strings) throws Exception {
        System.out.println("开始星星");
    }
}
