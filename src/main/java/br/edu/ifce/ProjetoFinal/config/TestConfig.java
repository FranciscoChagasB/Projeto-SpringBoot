package br.edu.ifce.ProjetoFinal.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import br.edu.ifce.ProjetoFinal.entities.User;
import br.edu.ifce.ProjetoFinal.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {

		User u1 = new User(null, "Maria Green", "maria@gmail.com", "911111111", "123456");
		User u2 = new User(null, "Alex Brown", "alex@gmail.com", "922222222", "123456");
		
		userRepository.saveAll(Arrays.asList(u1, u2));
	}
	
}
