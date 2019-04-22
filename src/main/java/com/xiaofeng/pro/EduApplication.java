package com.xiaofeng.pro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cache.annotation.EnableCaching;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication(scanBasePackageClasses = {EduApplication.class})
@MapperScan(basePackages = "com.xiaofeng.pro.dao")
@EnableCaching
public class EduApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(EduApplication.class, args);
}

    @Override//为了打包springboot项目
    protected SpringApplicationBuilder configure(
            SpringApplicationBuilder builder) {
        return builder.sources(this.getClass());
    }
}
