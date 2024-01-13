package br.edu.ifce.ProjetoFinal.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ifce.ProjetoFinal.repository.UserRepository;
import br.edu.ifce.ProjetoFinal.model.User;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	public List<User> findAll(){
		
		return repository.findAll();
		
	}
	
	public User findById(Long id) {
		Optional <User> obj = repository.findById(id);
		return obj.get();
	}
}
