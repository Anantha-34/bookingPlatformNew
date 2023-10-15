package com.example.booking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
//@EnableJpaRepositories("com.example.booking.*")
//@ComponentScan(basePackages = { "com.example.booking.*" })
//@EntityScan("com.example.booking.*")
public class BookingApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookingApplication.class, args);

		String dInStr = "2011-09-01";
		LocalDate d1 = LocalDate.parse(dInStr);
		System.out.println(d1);
	}

}
