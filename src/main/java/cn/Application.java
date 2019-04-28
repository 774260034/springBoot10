package cn;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.dao")//扫描mybatis得接口所在得包
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);

    }
}
