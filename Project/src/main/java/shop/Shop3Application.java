package shop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = {"shop", "com.malinacrafts"})
public class Shop3Application {

    public static void main(String[] args) {
        SpringApplication.run(Shop3Application.class, args);
    }
}
