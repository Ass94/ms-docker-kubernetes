package br.com.devops.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import br.com.devops.service.DBService;

@Configuration
@Profile("test")
public class DevConfig {
	
	@Autowired
	private DBService service;
	
	@Bean
	public void inicializar() {
		service.inicializarBancoDados();
	}

}
