package com.softtek.fundamentosabril15;

import com.softtek.fundamentosabril15.modelo.Conductor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Fundamentosabril15Application implements CommandLineRunner {

	@Autowired
	private Conductor c1;

	public static void main(String[] args) {
		SpringApplication.run(Fundamentosabril15Application.class, args);
	}

	//component lo mete al contenedor y autowired lo sacan

	@Override
	public void run(String... args) throws Exception {
		System.out.println(c1.conducir());
	}
}
