package com.hunau;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.hunau.mapper")
@SpringBootApplication
public class ToaruApplication {

	public static void main(String[] args) {
		SpringApplication.run(ToaruApplication.class, args);
	}

}

