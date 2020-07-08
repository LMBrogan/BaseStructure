package com.dailywear.base_structure;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.dailywear.base_structure.mapper")
@SpringBootApplication
public class BaseStructureApplication {

    public static void main(String[] args) {
        SpringApplication.run(BaseStructureApplication.class, args);
    }

}
