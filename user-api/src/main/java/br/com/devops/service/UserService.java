package br.com.devops.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.devops.convert.DTOConvert;
import br.com.devops.dto.UserDTO;
import br.com.devops.exception.UserNotFoundException;
import br.com.devops.model.User;
import br.com.devops.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public List<UserDTO> findAll() {
		List<User> users = repository.findAll();
		return users.stream().map(DTOConvert::convertDto).collect(Collectors.toList());
	}
	
	public UserDTO findById(Long id) {
		Optional<User> user = repository.findById(id);
		if(user.isPresent()) {
			return DTOConvert.convertDto(user.get());
		}
		throw new UserNotFoundException();
	}
	
	public UserDTO insert(UserDTO dto) {
		dto.setKey(UUID.randomUUID().toString());
		User user = repository.save(DTOConvert.convert(dto));
		return DTOConvert.convertDto(user);
	}
	
	public UserDTO delete(Long id) throws UserNotFoundException {
		Optional<User> user = repository.findById(id);
		if(user.isPresent()) {
			repository.delete(user.get());
		}
		throw new UserNotFoundException();
	}
}
