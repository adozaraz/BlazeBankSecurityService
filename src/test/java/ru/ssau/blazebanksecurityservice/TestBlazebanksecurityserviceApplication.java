package ru.ssau.blazebanksecurityservice;

import org.springframework.boot.SpringApplication;

public class TestBlazebanksecurityserviceApplication {

	public static void main(String[] args) {
		SpringApplication.from(BlazebanksecurityserviceApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
