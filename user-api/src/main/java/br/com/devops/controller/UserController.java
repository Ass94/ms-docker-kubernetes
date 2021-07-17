package br.com.devops.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.devops.dto.UserDTO;
import br.com.devops.service.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserController {
	
	@Autowired
	private UserService service;
	
	@GetMapping
	public List<UserDTO> findaAll() {
		return service.findAll();
	}
	
	@GetMapping(value = "/{id}")
	public UserDTO findById(@PathVariable Long id) {
		return service.findById(id);
	}
	
	@DeleteMapping(value = "/{id}")
	public UserDTO delete(@PathVariable Long id) {
		return service.delete(id);
	}
	
	@PostMapping
	public UserDTO insert(@RequestBody UserDTO dto) {
		return service.insert(dto);
	}

}
