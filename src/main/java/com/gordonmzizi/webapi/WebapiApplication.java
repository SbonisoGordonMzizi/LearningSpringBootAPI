package com.gordonmzizi.webapi;

import com.gordonmzizi.webapi.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;


@SpringBootApplication
public class WebapiApplication {

	public static void main(String[] args) {

		SpringApplication.run(WebapiApplication.class, args);
	}

}
