package com.example.movies;

import org.springframework.boot.SpringApplication; //SpringApplication.run ile spring baslatmanı saglar
import org.springframework.boot.autoconfigure.SpringBootApplication; //annotation import eder


@SpringBootApplication  //annotationlar compiler'e class'	ın ne yaptıgını söyler
public class MoviesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoviesApplication.class, args);
	}





}
