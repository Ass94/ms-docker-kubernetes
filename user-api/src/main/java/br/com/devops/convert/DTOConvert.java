package br.com.devops.convert;

import br.com.devops.dto.UserDTO;
import br.com.devops.model.User;

public class DTOConvert {
	
	public static User convert(UserDTO dto) {
		User user = new User();
		user.setNome(dto.getNome());
		user.setCpf(dto.getCpf());
		user.setEndereco(dto.getEndereco());
		user.setKey(dto.getKey());
		user.setEmail(dto.getEmail());
		user.setTelefone(dto.getTelefone());
		user.setDataCadastro(dto.getDataCadastro());
		return user;
	}
	
	public static UserDTO convertDto(User user) {
		UserDTO dto = new UserDTO();
		dto.setNome(user.getNome());
		dto.setCpf(user.getCpf());
		dto.setEndereco(user.getEndereco());
		dto.setKey(user.getKey());
		dto.setEmail(user.getEmail());
		dto.setTelefone(user.getTelefone());
		dto.setDataCadastro(user.getDataCadastro());
		return dto;
	}

}
