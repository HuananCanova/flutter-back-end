package br.ufsm.csi.poow2.spring_rest_security;

import br.ufsm.csi.poow2.spring_rest_security.controller.LoggingObserver;
import br.ufsm.csi.poow2.spring_rest_security.controller.WorkoutController;
import br.ufsm.csi.poow2.spring_rest_security.controller.WorkoutControllerImpl;
import br.ufsm.csi.poow2.spring_rest_security.dao.WorkoutDAO;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class SpringRestSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRestSecurityApplication.class, args);
	}


}