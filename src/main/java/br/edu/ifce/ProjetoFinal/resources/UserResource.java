package br.edu.ifce.ProjetoFinal.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.edu.ifce.ProjetoFinal.entities.User;

@Controller
@RequestMapping("/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<User> findAll() {
		User u = new User(1L, "Joao", "joao@gmail.com", "85912345678", "joao123");
		return ResponseEntity.ok().body(u);
	}
	
}
