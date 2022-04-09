package br.com.alura.contractmanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@SpringBootApplication
public class ContractManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContractManagerApplication.class, args);
	}

	@GetMapping("/")
	public String ola() {
		return "oi";
	}
}
