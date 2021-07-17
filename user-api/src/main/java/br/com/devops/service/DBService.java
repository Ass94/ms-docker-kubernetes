package br.com.devops.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.devops.convert.DTOConvert;
import br.com.devops.model.User;

@Service
public class DBService {
	
	@Autowired
	private UserService service;

	public void inicializarBancoDados() {
		User user = new User();
		user.setNome("Alex De Souza Silva");
		user.setCpf("423.016.168-94");
		user.setEndereco("Rua 8");
		user.setEmail("alex94tu@gmail.com");
		user.setTelefone("4131-1183");
		user.setDataCadastro(new Date());
		service.insert(DTOConvert.convertDto(user));
	}
	
}
